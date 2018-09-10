package control_casos.backend.proyectos;

public class Proyecto {
    private int id;
    private String nombre;
    private String descripcion;
    private int estado;
    private int numeroCasos;
    private String dpiAdminP;

    public Proyecto() {
    }

    public Proyecto(int id, String nombre, int estado, String dpiAdminP) {
        this.id = id;
        this.nombre = nombre;
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
    
}
