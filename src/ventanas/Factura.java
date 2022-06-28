/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

/**
 *
 * @author espin
 */
import java.util.Date;

/* Objeto para guardar los datos de una factura*/
public class Factura {
    /* Atributos de la factura */
    private int id_factura;
    private int id_producto;
    private int cantidad;
    private int total;
    private Date fecha;

    /* Constructor sin parametros */
    public Factura() {
        this.id_factura = 0;
        this.id_producto = 0;
        this.cantidad = 0;
        this.total = 0;
        this.fecha = new Date();
    }

    /* Constructor con parametros */
    public Factura(int id_factura, int id_producto, int cantidad, int total, Date fecha) {
        this.id_factura = id_factura;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.total = total;
        this.fecha = fecha;
    }

    /* Metodos get y set para los atributos de la factura */

    public int getId_factura() {
        return id_factura;
    }

    public void setId(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}