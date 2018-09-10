package control_casos.backend.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorBaseDatos {
    private Connection connection;
    private final String user = "userDB";
    private final String password = "123";
    private final String url = "jdbc:mariadb://localhost:3306/control_casos";

    public ConectorBaseDatos() {
    }
    
    public Connection conectar(){
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Se conecto");
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar");
            ex.printStackTrace();
        }
        
        return connection;
    }
    
    public void desconectar(){
        try {
            connection.close();
            System.out.println("Se desconecto");
        } catch (SQLException ex) {
        }
    }
}
