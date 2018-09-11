package control_casos.backend.datos;

import control_casos.backend.casos.TipoCaso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorTipoCasos {
    ConectorBaseDatos CBD;

    public ControladorTipoCasos() {
        CBD = new ConectorBaseDatos();
    }
    
    public boolean create(TipoCaso tc) {
        try {
            String sql = "INSERT INTO TIPO_CASO(Id, Nombre, Cantidad_Etapas) VALUES(?,?,?)";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ps.setInt(1, tc.getId());
            ps.setString(2, tc.getNombre());
            ps.setInt(3, tc.getCantidadEtapas());
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
    
    public ArrayList<TipoCaso> leerTipoCaso(){
        ArrayList<TipoCaso> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM TIPO_CASO";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoCaso tipoCaso = new TipoCaso();
                tipoCaso.setId(rs.getInt("Id"));
                tipoCaso.setNombre(rs.getString("Nombre"));
                tipoCaso.setCantidadEtapas(rs.getInt("Cantidad_Etapas"));
                lista.add(tipoCaso);
            }
            ps.close();
            ps = null;
            CBD.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo leer tipoCaso");
            ex.printStackTrace();
        }
        return lista;
    }
    
    public boolean delete(int id) {
        try {
            String sql = "DELETE FROM TIPO_CASO WHERE Id = ?";
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
    
    public boolean actualizar(TipoCaso tc) {
        try {
            String sql = "UPDATE TIPO_CASO SET Nombre = ?, Cantidad_Etapas = ? WHERE Id = ?";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ps.setString(1, tc.getNombre());
            ps.setInt(2, tc.getCantidadEtapas());
            ps.setInt(3, tc.getId());
            ps.execute();
            ps.close();
            ps=null;
            CBD.desconectar();
            return true;
        } catch (SQLException ex) {
            return false;
        }        
    }
    
     public TipoCaso leerTipoCasoFila(int id) {
       TipoCaso tc = new TipoCaso();
        try {
            String sql = "SELECT * FROM TIPO_CASO WHERE Id = ?";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tc.setId(rs.getInt("Id"));
                tc.setNombre(rs.getString("Nombre"));
                tc.setCantidadEtapas(rs.getInt("Cantidad_Etapas"));
            }
            ps.close();
            ps = null;
            CBD.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo leer tipoCaso");
        }
        return tc;
    }
}
