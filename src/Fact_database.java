public class Fact_database extends Lista_DE{
    N_facture head, tail;

    public Fact_database() {
        super();
    }

    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

    public void pushBack(int idFact, String cliente, String fecha, int idProducto, int cantProducto, Inventory inventario){
        N_facture N=new N_facture(idFact, cliente, fecha, idProducto, cantProducto);
        if(isEmpty()){
            this.head=N;
        }
        else{
            this.tail.next=N;
            N.prev=this.tail;
        }
        this.tail=N;

        N_tuple M = new N_tuple(idProducto);
        M = inventario.find(idProducto);
        M.setCantidad(-cantProducto);
    }

    public void popFront(){
        if(isEmpty()){
            System.out.println("Base de datos vacía, no se puede eliminar");
        }
        else if(this.head == this.tail){
            this.head=null;
            this.tail=null;
        }
        else{
            this.head=this.head.getNext();
            this.head.prev=null;
        }
    }

    public void popBack(){
        if(isEmpty()){
            System.out.println("Base de datos vacía, no se puede eliminar");
        }
        else if(this.head == this.tail){
            this.head=null;
            this.tail=null;
        }
        else{
            this.tail=this.tail.prev;
            this.tail.next=null;
        }
    }

    public N_facture find(int idFactura) {
        N_facture N = this.head;
        while(N != null){
            if(N.getIdFact() == idFactura){
                return N;
            }
            if(N.getNext() == null){
                System.out.println("No se ha encontrado la factura en la base de datos");
                return null;
            }
            N = N.getNext();
        }
        return null;
    }

    public boolean erase(int idFactura, Inventory inventario) {
        N_facture N = find(idFactura);
        if(N != null){

            N_tuple M = new N_tuple(N.getIdProducto());  // *** <------ regresando el inventario de la factura eliminada
            M = inventario.find(N.getIdProducto());
            M.setCantidad(N.getCantProducto());

            if(N == this.head){
                this.popFront();
                return true;
            }

            if(N == this.tail){
                this.popBack();
                return true;
            }

            N.getPrev().setNext(N.getNext());
            N.getNext().setPrev(N.getPrev());
            return true;
        }
        System.out.println("No existe la factura a eliminar");
        return false;
    }

    public void imprimir_fact(int idFactura, Inventory inventario){
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

    public void pushB_and_print(int idFact, String cliente, String fecha, int idProducto, int cantProducto, Inventory inventario){
        N_facture N=new N_facture(idFact, cliente, fecha, idProducto, cantProducto);
        if(isEmpty()){
            this.head=N;
            this.tail=N;
        }
        else{
            this.tail.next=N;
            N.prev=this.tail;
        }
        this.tail=N;

        N_tuple M = new N_tuple(idProducto);
        M = inventario.find(idProducto);

        M.setCantidad(-cantProducto);

        System.out.println("Factura de compra "+N.getIdFact());
        System.out.println("Cliente: "+N.getCliente());
        System.out.println("fecha: "+N.getFecha());
        System.out.println("Producto: "+N.getIdProducto());
        System.out.println("Cantidad: "+N.getCantProducto());
        System.out.println("Precio unitario: "+M.getPrecio());
        System.out.println("Total a pagar: $"+( M.getPrecio() * N.getCantProducto() ));
    }

    public void finanzas(Inventory inventario){
        N_facture N = this.head;
        N_tuple M = new N_tuple(0);
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

            N = N.getNext();
        }

        System.out.println("BALANCE FINANCIERO:");
        System.out.println("Número total de ventas: "+numVentas);
        System.out.println("Cantidad de productos vendidos: "+cantProductosVendidos);
        System.out.println("venta total: "+ventaTotal);
        System.out.println("Retorno a capital: "+retornoCapital);
        System.out.println("ganancias: "+ganancias);
    }
}
