package control_casos.backend.datos;

import control_casos.backend.casos.Caso;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorCasos {
    ConectorBaseDatos CBD;

    public ControladorCasos() {
        CBD = new ConectorBaseDatos();
    }
    
    public boolean create(Caso c) {
        try {
            String sql = "INSERT INTO CASO(Id, Nombre, Descripcion, Fecha_Inicio, "
                       + "Fecha_Limite, Estado, Id_Proyecto, Id_TipoCaso) VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            Date dateInicio = new Date(c.getFechaInicio().getTime());
            Date dateLimite = new Date(c.getFechaLimite().getTime());
            ps.setInt(1, c.getId());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getDescripcion());
            ps.setDate(4, dateInicio);
            ps.setDate(5, dateLimite);
            ps.setInt(6, c.getEstado());
            ps.setInt(7, c.getIdProyecto());
            ps.setInt(8, c.getIdTipoCaso());
            ps.execute();
            ps.close();
            ps = null;
            CBD.desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println("No se inserto registro");
            ex.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Caso> leerCaso(){
        ArrayList<Caso> lista = new ArrayList();
        try {
            String sql = "SELECT C.Id, C.Nombre, P.Nombre, T.Nombre, C.Estado, "
                    + "C.Fecha_Limite FROM CASO C JOIN PROYECTO P ON C.Id_Proyecto = P.Id "
                    + "JOIN TIPO_CASO T ON C.Id_TipoCaso = T.Id";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Caso caso = new Caso();
                caso.setId(rs.getInt("Id"));
                caso.setNombre(rs.getString(2));
                caso.setNombreProyecto(rs.getString(3));
                caso.setTipoCaso(rs.getString(4));
                caso.setEstado(rs.getInt("Estado"));
                Date dateLimite = new Date(rs.getDate("Fecha_Limite").getTime());
                caso.setFechaLimite(dateLimite);
                lista.add(caso);
            }
            ps.close();
            ps = null;
            CBD.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo leer Caso");
            ex.printStackTrace();
        }
        return lista;
    }
    
    public boolean delete(int id) {
        try {
            String sql = "DELETE FROM CASO WHERE Id = ?";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            ps = null;
            CBD.desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println("No se elimino registro");
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean actualizar(Caso c) {
        try {
            String sql = "UPDATE CASO SET Nombre = ?, Descripcion = ?, Fecha_Inicio = ?,"
                    + "Fecha_Limite = ?, Id_Proyecto = ?, Id_TipoCaso = ? WHERE Id = ?";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            Date dateInicio = new Date(c.getFechaInicio().getTime());
            Date dateLimite = new Date(c.getFechaLimite().getTime());
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDescripcion());
            ps.setDate(3, dateInicio);
            ps.setDate(4, dateLimite);
            ps.setInt(5, c.getIdProyecto());
            ps.setInt(6, c.getIdTipoCaso());
            ps.setInt(7, c.getId());
            ps.execute();
            ps.close();
            ps=null;
            CBD.desconectar();
            return true;
        } catch (SQLException ex) {
            return false;
        }        
    }
    
     public Caso leerCasoFila(int id) {
       Caso c = new Caso();
        try {
            String sql = "SELECT C.Id, C.Nombre, P.Id, T.Id, C.Estado, "
                    + "C.Fecha_Limite, C.Fecha_Inicio, C.Descripcion FROM CASO C JOIN PROYECTO P ON C.Id_Proyecto = P.Id "
                    + "JOIN TIPO_CASO T ON C.Id_TipoCaso = T.Id WHERE C.Id = ?";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt("Id"));
                c.setNombre(rs.getString(2));
                c.setIdProyecto(rs.getInt(3));
                c.setIdTipoCaso(rs.getInt(4));
                c.setEstado(rs.getInt("Estado"));
                Date dateLimite = new Date(rs.getDate("Fecha_Limite").getTime());
                c.setFechaLimite(dateLimite);
                Date dateInicio = new Date(rs.getDate("Fecha_Inicio").getTime());
                c.setFechaInicio(dateInicio);
                c.setDescripcion(rs.getString("Descripcion"));
            }
            ps.close();
            ps = null;
            CBD.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo leer Caso");
        }
        return c;
    }
}
