package control_casos.ui;

public class Validaciones {
    private static String error = "";
    public static String validarLogin(String nombre, String pass){
        if (nombre.isEmpty() || pass.isEmpty()) {
            error = "No pueden haber campos vacios";
        }
        return error;
    }
    
    public static String validarAgregarUsuario(String dpi, String nombre, String user, String pass, int tipo){
        if (nombre.isEmpty() || dpi.isEmpty() || tipo == 0) {
            error = "No pueden haber campos vacios";
        }
        if (!user.isEmpty() && pass.isEmpty()) {
            error = "No ha colocado contraseña";
        }
        return error;
    }
    
    public static String validarAgregarProyecto(String nombre, int adminP){
        if (nombre.isEmpty() || adminP == -1) {
            error = "El nombre y el Admin son obligatorios";
        }
        return error;
    }
    
    public static String validarAgregarTipoCaso(String nombre, String cantidadEtapas){
        if (nombre.isEmpty() || cantidadEtapas.isEmpty()) {
            error = "El nombre y el Admin son obligatorios";
        }
        return error;
    }
}
