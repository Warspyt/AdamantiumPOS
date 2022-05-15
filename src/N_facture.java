public class N_facture extends Node{
    int idFact;
    String cliente;
    String fecha;
    int idProducto;
    int cantProducto;
    N_facture next;
    N_facture prev;

    public N_facture(int idFact, String cliente, String fecha, int idProducto, int cantProducto){
        this.idFact = idFact;
        this.cliente = cliente;
        this.fecha = fecha;
        this.idProducto = idProducto;
        this.cantProducto =cantProducto ;
        this.next = null;
        this.prev = null;
    }

    public int getIdFact() {
        return this.idFact;
    }

    public void setIdFact(int idFact) {
        this.idFact = idFact;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantProducto() {
        return this.cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    @Override
    public N_facture getNext() {
        return this.next;
    }

    public void setNext(N_facture next) {
        this.next = next;
    }

    @Override
    public N_facture getPrev() {
        return this.prev;
    }

    public void setPrev(N_facture prev) {
        this.prev = prev;
    }
}
