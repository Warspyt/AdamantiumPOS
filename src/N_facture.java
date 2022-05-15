public class N_facture extends Node{
    String idFact;
    String cliente;
    String fecha;
    String idProducto;
    int cantProducto;
    N_facture next;
    N_facture prev;

    public N_facture(String idFact, String cliente, String fecha, String idProducto, int cantProducto){
        this.idFact = idFact;
        this.cliente = cliente;
        this.fecha = fecha;
        this.idProducto = idProducto;
        this.cantProducto =cantProducto ;
        this.next = null;
        this.prev = null;
    }

    public String getIdFact() {
        return idFact;
    }

    public void setIdFact(String idFact) {
        this.idFact = idFact;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    @Override
    public N_facture getNext() {
        return next;
    }

    public void setNext(N_facture next) {
        this.next = next;
    }

    @Override
    public N_facture getPrev() {
        return prev;
    }

    public void setPrev(N_facture prev) {
        this.prev = prev;
    }
}
