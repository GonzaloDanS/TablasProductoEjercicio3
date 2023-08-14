package g2p1ej3;

public class Producto {
    private double precio;
    private String cat, nombre;

    public Producto(double precio, String cat, String nombre) {
        this.precio = precio;
        this.cat = cat;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
