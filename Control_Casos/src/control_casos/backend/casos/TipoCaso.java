package control_casos.backend.casos;

public class TipoCaso {
    private int id;
    private String nombre;
    private int cantidadEtapas;

    public TipoCaso() {
    }

    public TipoCaso(int id, String nombre, int cantidadEtapas) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadEtapas = cantidadEtapas;
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

    public int getCantidadEtapas() {
        return cantidadEtapas;
    }

    public void setCantidadEtapas(int cantidadEtapas) {
        this.cantidadEtapas = cantidadEtapas;
    }
    
}
