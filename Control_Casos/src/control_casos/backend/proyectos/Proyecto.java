package control_casos.backend.proyectos;

public class Proyecto {
    private int id;
    private String nombre;
    private String descripcion;
    private int estado;
    private String estadoN;
    private int numeroCasos;
    private String dpiAdminP;
    private String nombreAdminP;

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, String dpiAdminP) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dpiAdminP = dpiAdminP;
    }

    public Proyecto(int id, String nombre, String descripcion, int estado, String dpiAdminP) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.dpiAdminP = dpiAdminP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getEstadoN() {
        return estadoN;
    }

    public void setEstadoN() {
        switch (estado) {
            case 1:
                this.estadoN = "Sin Casos";
                break;
            case 2:
                this.estadoN = "Activo";
                break;
            case 3:
                this.estadoN = "Inactivo";
                break;
                
            case 4:
                this.estadoN = "Finalizado";
                break;
            default:
                break;
        }
    }

    public int getNumeroCasos() {
        return numeroCasos;
    }

    public void setNumeroCasos(int numeroCasos) {
        this.numeroCasos = numeroCasos;
    }

    public String getDpiAdminP() {
        return dpiAdminP;
    }

    public void setDpiAdminP(String dpiAdminP) {
        this.dpiAdminP = dpiAdminP;
    }

    public String getNombreAdminP() {
        return nombreAdminP;
    }

    public void setNombreAdminP(String nombreAdminP) {
        this.nombreAdminP = nombreAdminP;
    }
    
}
