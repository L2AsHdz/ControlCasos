package control_casos.backend.etapas;

public class Etapa {
    private int id;
    private String nombre;
    private String descripcion;
    private int estado;
    private String estadoN;
    private String comentarioFinal;
    private String comentarioRechazo;
    private double costoHora;
    private double horasTrabajadas;
    private int idProyecto;
    private String nombreProyecto;
    private int idCaso;
    private String nombreCaso;
    private String dpiDesarrollador;
    private String nombreDesarrollador;

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

    public String getEstadoN() {
        return estadoN;
    }

    public void setEstadoN() {
        switch (estado) {
            case 1:
                this.estadoN = "En Progreso";
                break;
            case 2:
                this.estadoN = "Trabajo Finzalizado";
                break;
            case 3:
                this.estadoN = "Rechazada";
                break;
            case 4:
                this.estadoN = "Correccion";
                break;
            case 5:
                this.estadoN = "Congelada";
                break;
            case 6:
                this.estadoN = "Cancelada";
                break;
            case 7:
                this.estadoN = "Finalizada";
                break;
        }
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

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String idnombreProyecto) {
        this.nombreProyecto = idnombreProyecto;
    }

    public int getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public String getNombreCaso() {
        return nombreCaso;
    }

    public void setNombreCaso(String nombreCaso) {
        this.nombreCaso = nombreCaso;
    }

    public String getDpiDesarrollador() {
        return dpiDesarrollador;
    }

    public void setDpiDesarrollador(String dpiDesarrollador) {
        this.dpiDesarrollador = dpiDesarrollador;
    }

    public String getNombreDesarrollador() {
        return nombreDesarrollador;
    }

    public void setNombreDesarrollador(String nombreDesarrollador) {
        this.nombreDesarrollador = nombreDesarrollador;
    }
    
}
