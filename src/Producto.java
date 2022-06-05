import java.io.Serializable;

public class Producto implements Serializable {
    private int id;
    private String nombre;
    private int precio_distribuidor;
    private int precio_venta;
    private int cantidad;

    public Producto(int id, String name, int pr_d, int pr_v, int ct){
        this.id = id;
        this.nombre = name;
        this.precio_distribuidor = pr_d;
        this.precio_venta = pr_v;
        this.cantidad = ct;
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

    public int getPrecio_distribuidor() {
        return precio_distribuidor;
    }

    public void setPrecio_distribuidor(int precio_distribuidor) {
        this.precio_distribuidor = precio_distribuidor;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void display(){
        System.out.println("- Producto\n"
                + "\nID: " + getId()
                + "\nNombre: " + getNombre()
                + "\nPrecio distribuidor: " + getPrecio_distribuidor()
                + "\nPrecio de venta: " + getPrecio_venta()
                + "\nCantidad: " + getCantidad());

        System.out.println();
    }
}
