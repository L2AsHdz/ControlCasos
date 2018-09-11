package control_casos.backend.casos;

import java.util.Date;

public class Caso {
    private int id;
    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaLimite;
    private Date fechaEntrega;
    private double porcentaje;
    private int estado;
    private String estadoN;
    private String motivoCancelacion;
    private double horasInvertidas;
    private double costo;
    private int idProyecto;
    private String nombreProyecto;
    private int idTipoCaso;
    private String tipoCaso;

    public Caso() {
    }

    public Caso(int id, String nombre, String descripcion, Date fechaInicio, 
            Date fechaLimite, int estado, int idProyecto, int idTipoCaso) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaLimite = fechaLimite;
        this.estado = estado;
        this.idProyecto = idProyecto;
        this.idTipoCaso = idTipoCaso;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setFechaEntrega(String fecha){
        this.fechaEntrega = new Date(fecha);
    }
    
    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
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
                this.estadoN = "Activo";
                break;
            case 2:
                this.estadoN = "Cancelado";
                break;
            case 3:
                this.estadoN = "Con Retraso";
                break;
            case 4:
                this.estadoN = "Congelado";
                break;
            case 5:
                this.estadoN = "Finalizado";
                break;
        }
    }

    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }

    public double getHorasInvertidas() {
        return horasInvertidas;
    }

    public void setHorasInvertidas(double horasInvertidas) {
        this.horasInvertidas = horasInvertidas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public int getIdTipoCaso() {
        return idTipoCaso;
    }

    public void setIdTipoCaso(int idTipoCaso) {
        this.idTipoCaso = idTipoCaso;
    }

    public void setTipoCaso(String tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    public String getTipoCaso() {
        return tipoCaso;
    }
    
    
}
