package control_casos.backend.usuarios;

public class Usuario {
    
    private String dpi;
    private String nombre;
    private int tipo;
    private String tipoN;
    private String nombreUsuarioS;
    private String password;

    public Usuario() {
    }

    public Usuario(String dpi, String nombre, String tipoN) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.tipoN = tipoN;
        this.setTipo();
    }

    public Usuario(String dpi, String nombre, String nombreUsuarioS, String password, String tipoN) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.tipoN = tipoN;
        this.setTipo();
        this.nombreUsuarioS = nombreUsuarioS;
        this.password = password;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setTipo(String tipoN) {
        switch (tipoN) {
            case "Administrador Sistema":
                this.tipo = 1;
                break;
            case "Administrador Proyecto":
                this.tipo = 2;
                break;
            case "Desarrollador":
                this.tipo = 3;
                break;
            default:
                break;
        }
    }

    public String getTipoN() {
        return tipoN;
    }

    public void setTipoN(String tipoN) {
        this.tipoN = tipoN;
    }

    public String getNombreUsuarioS() {
        return nombreUsuarioS;
    }

    public void setNombreUsuarioS(String nombreUsuarioS) {
        this.nombreUsuarioS = nombreUsuarioS;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
