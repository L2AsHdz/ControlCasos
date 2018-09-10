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

    public Usuario(String dpi, String nombre, int tipo) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Usuario(String dpi, String nombre, String nombreUsuarioS, String password, int tipo) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.tipo = tipo;
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

    public String getTipoN() {
        return tipoN;
    }
    
    public void setTipoN() {
        switch (tipo) {
            case 1:
                this.tipoN = "Administrador Sistema";
                break;
            case 2:
                this.tipoN = "Administrador Proyecto";
                break;
            case 3:
                this.tipoN = "Desarrollador";
                break;
            default:
                break;
        }
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
