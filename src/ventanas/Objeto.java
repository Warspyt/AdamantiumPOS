package ventanas;

import java.io.Serializable;

/**
 *
 * @author espin
 */
public class Objeto implements Serializable {
    private int id,altura;
    private String nombre;
    private int precio_distribuidor;
    private int precio_venta;
    private int cantidad;
    private Objeto leftChild,rightChild;

    public Objeto()
    {
        this.id=0;
        this.nombre="";
        this.precio_distribuidor=0;
        this.precio_venta=0;
        this.cantidad=0;
        this.altura=0;
    }
    public Objeto(int id,String nombre,int precio_dis,int precio_ven,int cantidad)
    {
        this.id=id;
        this.nombre=nombre;
        this.precio_distribuidor=precio_dis;
        this.precio_venta=precio_ven;
        this.cantidad=cantidad;
        this.altura=0;
    }

    public int getAltura(){
        return this.altura;
    }
    public void setAltura(int altura){
        this.altura=altura;
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
    public Objeto getLeftChild(){
        return leftChild;
    }
    public void setLeftChild(Objeto leftChild){
        this.leftChild = leftChild;
    }
    public Objeto getRightChild(){
        return rightChild;
    }
    public void setRightChild(Objeto rightChild){
        this.rightChild= rightChild;
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
