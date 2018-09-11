package control_casos.backend.datos;

import control_casos.backend.etapas.Etapa;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorEtapas {
    ConectorBaseDatos CBD;

    public ControladorEtapas() {
        CBD = new ConectorBaseDatos();
    }
    
    public boolean create(Etapa e) {
        try {
            String sql = "INSERT INTO ETAPA(Id, Nombre, Estado, Id_Proyecto, Id_Caso, "
                       + "DPI_Desarrollador) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ps.setInt(1, e.getId());
            ps.setString(2, e.getNombre());
            ps.setInt(3, e.getEstado());
            ps.setInt(4, e.getIdProyecto());
            ps.setInt(5, e.getIdCaso());
            ps.setString(6, e.getDpiDesarrollador());
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
    
    public ArrayList<Etapa> leerEtapa(){
        ArrayList<Etapa> lista = new ArrayList();
        try {
            String sql = "SELECT E.Id, E.Nombre, E.Id_Proyecto E.Id_Caso, E.Estado, "
                    + "U.Nombre FROM ETAPA E JOIN USUARIO U ON E.DPI_Desarrollador = U.DPI";
            PreparedStatement ps = CBD.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Etapa etapa = new Etapa();
                etapa.setId(rs.getInt("Id"));
                etapa.setNombre(rs.getString("2"));
                etapa.setIdProyecto(rs.getInt("Id_Proyecto"));
                etapa.setIdCaso(rs.getInt("Id_Caso"));
                etapa.setEstado(rs.getInt("Estado"));
                etapa.setNombreDesarrollador(rs.getString(6));
                lista.add(etapa);
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
}
