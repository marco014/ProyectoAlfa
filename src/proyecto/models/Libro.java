package proyecto.models;

public class Libro {
    private String nombre;
    private int id;
    private String categoria;
    public Libro(String nombre, int id, String categoria){
        this.nombre = nombre;
        this.id = id;
        this.categoria = categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public int getId() { return id; }
    public String getCategoria() {
        return categoria;
    }
}
