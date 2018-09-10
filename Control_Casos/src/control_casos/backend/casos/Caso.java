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
    private String motivoCancelacion;
    private double horasInvertidas;
    private double costo;
    private int idProyecto;
    private int idTipoCaso;

    public Caso() {
    }

    public Caso(int id, String nombre, Date fechaInicio, Date fechaLimite, int estado, int idProyecto, int idTipoCaso) {
        this.id = id;
        this.nombre = nombre;
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

    public int getIdTipoCaso() {
        return idTipoCaso;
    }

    public void setIdTipoCaso(int idTipoCaso) {
        this.idTipoCaso = idTipoCaso;
    }
    
    
}
