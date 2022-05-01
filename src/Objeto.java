public class Objeto {
    int id;
    String nombre;
    int precio_distribuidor;
    int precio_venta;
    int cantidad;

    public Objeto()
    {
        this.id=0;
        this.nombre="";
        this.precio_distribuidor=0;
        this.precio_venta=0;
        this.cantidad=0;
    }
    public Objeto(int id,String nombre,int precio_dis,int precio_ven,int cantidad)
    {
        this.id=id;
        this.nombre=nombre;
        this.precio_distribuidor=precio_dis;
        this.precio_venta=precio_ven;
        this.cantidad=cantidad;
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

    @Override
    public String toString() {
        return "\nObjeto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio_distribuidor=" + precio_distribuidor +
                ", precio_venta=" + precio_venta +
                ", cantidad=" + cantidad +
                '}';
    }

}
