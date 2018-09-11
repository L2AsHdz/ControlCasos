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
    
    public static String validarAgregarProyecto(String nombre, int adminP){
        String error = "";
        if (nombre.isEmpty() || adminP == -1) {
            error = "El nombre y el Admin son obligatorios";
        }
        return error;
    }
    
    public static String validarAgregarTipoCaso(String nombre, String cantidadEtapas){
        String error = "";
        if (nombre.isEmpty() || cantidadEtapas.isEmpty()) {
            error = "El nombre y el Admin son obligatorios";
        }
        boolean isNumeric;
        try {
            Integer.parseInt(cantidadEtapas);
            isNumeric = true;
        } catch (NumberFormatException e) {
            isNumeric = false;
        }
        if (!isNumeric) {
            error = "El dato no es numerico";

        }
        return error;
    }
}
