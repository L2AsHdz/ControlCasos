package control_casos.backend.datos;

import control_casos.backend.proyectos.Proyecto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorProyectos {
    ConectorBaseDatos CBD;

    public ControladorProyectos() {
        CBD = new ConectorBaseDatos();
    }
    
    public boolean create(Proyecto p) {
        try {
            String sql = "INSERT INTO PROYECTO(Id, Nombre, Descripcion, Estado, DPI_AdminP) VALUES(?,?,?,?,?)";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getDescripcion());
            ps.setInt(4, p.getEstado());
            ps.setString(5, p.getDpiAdminP());
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
    
    public ArrayList<Proyecto> leerProyecto(){
        ArrayList<Proyecto> lista = new ArrayList();
        try {
            String sql = "SELECT P.Id, P.Nombre, P.Estado, P.DPI_AdminP, U.Nombre FROM PROYECTO P JOIN USUARIO U ON P.DPI_AdminP=U.DPI";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proyecto proyecto = new Proyecto();
                proyecto.setId(rs.getInt("Id"));
                proyecto.setNombre(rs.getString(2));
                //proyecto.setDescripcion(rs.getString("Descripcion"));
                proyecto.setEstado(rs.getInt("Estado"));
                //proyecto.setNumeroCasos(rs.getInt("No_Casos"));
                proyecto.setDpiAdminP(rs.getString("DPI_AdminP"));
                proyecto.setNombreAdminP(rs.getString(5));
                lista.add(proyecto);
            }
            ps.close();
            ps = null;
            CBD.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo leer proyecto");
            ex.printStackTrace();
        }
        return lista;
    }
    
    public boolean delete(int id) {
        try {
            String sql = "DELETE FROM PROYECTO WHERE Id = ?";
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
    
    public boolean actualizar(Proyecto p) {
        try {
            String sql = "UPDATE PROYECTO SET Nombre = ?, Descripcion = ?, DPI_AdminP = ? WHERE Id = ?";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setString(3, p.getDpiAdminP());
            ps.setInt(4, p.getId());
            ps.execute();
            ps.close();
            ps=null;
            CBD.desconectar();
            return true;
        } catch (SQLException ex) {
            return false;
        }        
    }
    
     public Proyecto leerProyectoFila(int id) {
       Proyecto p = new Proyecto();
        try {
            String sql = "SELECT P.Id, P.Nombre, P.Estado, P.Descripcion, P.DPI_AdminP, U.Nombre FROM PROYECTO P JOIN USUARIO U ON P.DPI_AdminP=U.DPI WHERE Id = ?";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt("Id"));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString("Descripcion"));
                p.setEstado(rs.getInt("Estado"));
                p.setDpiAdminP(rs.getString("DPI_AdminP"));
                p.setNombreAdminP(rs.getString(6));
            }
            ps.close();
            ps = null;
            CBD.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo leerproyecto");
        }
        return p;
    }
}
