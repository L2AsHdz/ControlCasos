package control_casos.ui;

public class Validaciones {
    
    public static String validarLogin(String nombre, String pass){
        String error = "";
        if (nombre.isEmpty() || pass.isEmpty()) {
            error = "No pueden haber campos vacios";
        }
        return error;
    }
    
    public static String validarAgregarUsuario(String dpi, String nombre, String user, String pass, int tipo){
        String error = "";
        if (nombre.isEmpty() || dpi.isEmpty() || tipo == 0) {
            error = "No pueden haber campos vacios";
        }
        if (!user.isEmpty() && pass.isEmpty()) {
            error = "No ha colocado contraseña";
        }
        return error;
    }
}
