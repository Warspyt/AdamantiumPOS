public class N_tuple extends Node{  //*** Heredado del nodo para hacer de tupla en la lista inventario ***
    String id;
    String nombre;
    int precio;
    int costo;
    int cantidad;
    int tope;
    N_tuple next;
    N_tuple prev;

    public N_tuple(String id,String nombre,int precio, int costo,int cantidad, int tope){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.costo = costo;
        this.cantidad = cantidad;
        this.tope = tope;
        this.next = null;
        this.prev = null;
    }

    public N_tuple(String id){  // ***<--- este es para que la facturacion encuentre el precio del producto
        this.id = id;
        this.nombre = "";
        this.precio = 0;
        this.costo = 0;
        this.cantidad = 0;
        this.tope = 0;
        this.next = null;
        this.prev = null;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    int getPrecio() {
        return precio;
    }

    void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    int getCantidad() {
        return cantidad;
    }

    void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    int getTope() {
        return tope;
    }

    void setTope(int tope) {
        this.tope = tope;
    }

    public N_tuple getNext() {
        return this.next;
    }

    public void setNext(N_tuple next) {
        this.next = next;
    }

    public N_tuple getPrev() {
        return prev;
    }

    public void setPrev(N_tuple prev) {
        this.prev = prev;
    }
}