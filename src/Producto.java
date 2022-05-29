/* Objeto para guardar cada uno de los productos en el inventario*/
public class Producto {

    /* Atributos del objeto prodcuto */
    private int id;
    private String nombre;
    private int precio_distribuidor;
    private int precio_venta;
    private int cantidad;

    /* Constructor de la clase producto sin parametros */
    public Producto() {
        this.id = 0;
        this.nombre = "";
        this.precio_distribuidor = 0;
        this.precio_venta = 0;
        this.cantidad = 0;
    }

    /* Constructor de la clase producto con parametros */
    public Producto(int id, String nombre, int precio_dis, int precio_ven, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio_distribuidor = precio_dis;
        this.precio_venta = precio_ven;
        this.cantidad = cantidad;
    }

    /* Metodos set y get para los atributos del objeto Producto */

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
}
