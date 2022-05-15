import java.util.Objects;

public class Fact_database extends Lista_DE{
    N_facture head, tail;

    public Fact_database() {
        super();
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void pushBack(String idFact, String cliente, String fecha, String idProducto, int cantProducto, Inventory inventario){
        N_facture N=new N_facture(idFact, cliente, fecha, idProducto, cantProducto);
        if(isEmpty()){
            head=N;
            tail=N;
        }
        else{
            tail.next=N;
            N.prev=tail;
        }
        tail=N;

        N_tuple M = new N_tuple(idProducto);
        M = inventario.find(idProducto);
        M.setCantidad(M.getCantidad() - cantProducto);
    }

    public N_facture find(String idFactura) {
        N_facture N = head;
        while(N != null){
            if(!Objects.equals(N.getIdFact(), idFactura)){
                N =N.getNext();
            }
            return N;
        }
        System.out.println("No se ha encontrado la factura en la base de datos");
        return null;
    }

    public boolean erase(String idFactura, Inventory inventario) {
        N_facture N = find(idFactura);
        if(N != null){

            N_tuple M = new N_tuple(N.getIdProducto());  // *** <------ regresando el inventario de la factura eliminada
            M = inventario.find(N.getIdProducto());
            M.setCantidad(M.getCantidad() + N.getCantProducto());

            N.getPrev().setNext(N.getNext());
            N.getNext().setPrev(N.getPrev());
            return true;
        }
        System.out.println("No existe la factura a eliminar");
        return false;
    }

    public void imprimir_fact(String idFactura, Inventory inventario){
        N_facture N = find(idFactura);
        N_tuple M = new N_tuple(N.getIdProducto());
        M = inventario.find(M.getId());
        System.out.println("Factura de compra "+N.getIdFact());
        System.out.println("Cliente: "+N.getCliente());
        System.out.println("fecha: "+N.getFecha());
        System.out.println("Producto: "+N.getIdProducto());
        System.out.println("Cantidad: "+N.getCantProducto());
        System.out.println("Precio unitario: "+M.getPrecio());
        System.out.println("Total a pagar: $"+( M.getPrecio() * N.getCantProducto() ));
    }

    public void pushB_and_print(String idFact, String cliente, String fecha, String idProducto, int cantProducto, Inventory inventario){
        N_facture N=new N_facture(idFact, cliente, fecha, idProducto, cantProducto);
        if(isEmpty()){
            head=N;
            tail=N;
        }
        else{
            tail.next=N;
            N.prev=tail;
        }
        tail=N;

        N_tuple M = new N_tuple(idProducto);
        M = inventario.find(idProducto);

        M.setCantidad(M.getCantidad() - cantProducto);

        System.out.println("Factura de compra "+N.getIdFact());
        System.out.println("Cliente: "+N.getCliente());
        System.out.println("fecha: "+N.getFecha());
        System.out.println("Producto: "+N.getIdProducto());
        System.out.println("Cantidad: "+N.getCantProducto());
        System.out.println("Precio unitario: "+M.getPrecio());
        System.out.println("Total a pagar: $"+( M.getPrecio() * N.getCantProducto() ));
    }

    public void finanzas(Inventory inventario){
        N_facture N = head;
        N_tuple M = new N_tuple("");
        int numVentas = 0;
        int cantProductosVendidos = 0;
        int ventaTotal = 0;
        int retornoCapital = 0;
        int ganancias = 0;

        while(N != null){
            M = inventario.find(N.getIdProducto());
            numVentas += 1;
            cantProductosVendidos += N.getCantProducto();
            ventaTotal += ( M.getPrecio() * N.getCantProducto() );
            retornoCapital += ( M.getCosto() * N.getCantProducto() );
            ganancias += ( (M.getPrecio() - M.getCosto()) * N.getCantProducto() );
        }
    }
}
