package control_casos.backend.etapas;

public class Etapa {
    private int id;
    private String nombre;
    private String descripcion;
    private int estado;
    private String comentarioFinal;
    private String comentarioRechazo;
    private double costoHora;
    private double horasTrabajadas;
    private int idProyecto;
    private int idCaso;
    private String dpiDesarrollador;

    public Etapa() {
    }

    public Etapa(int id, String nombre, int estado, int idProyecto, int idCaso, String dpiDesarrollador) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.idProyecto = idProyecto;
        this.idCaso = idCaso;
        this.dpiDesarrollador = dpiDesarrollador;
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

    public String getComentarioFinal() {
        return comentarioFinal;
    }

    public void setComentarioFinal(String comentarioFinal) {
        this.comentarioFinal = comentarioFinal;
    }
    
    public String getComentarioRechazo() {
        return comentarioRechazo;
    }

    public void setComentarioRechazo(String comentarioRechazo) {
        this.comentarioRechazo = comentarioRechazo;
    }

    public double getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public int getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public String getDpiDesarrollador() {
        return dpiDesarrollador;
    }

    public void setDpiDesarrollador(String dpiDesarrollador) {
        this.dpiDesarrollador = dpiDesarrollador;
    }
    
}
