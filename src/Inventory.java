import java.util.Objects;

public class Inventory extends Lista_DE { // *** heredado de la clase lista ***
    N_tuple head,tail;

    public Inventory(){
        super();
    }

    public boolean isEmpty(){
        return this.head == null && this.tail == null;
    }

    public void pushBack(int id,String nombre,int precio, int costo,int cantidad, int tope){
        N_tuple N=new N_tuple(id, nombre, precio, costo, cantidad, tope);
        if(isEmpty()){
            this.head=N;
        }
        else{
            this.tail.next=N;
            N.prev=this.tail;
        }
        this.tail=N;
    }

    public void popFront(){
        if(isEmpty()){
            System.out.println("Inventario vacío, no se puede eliminar");
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
            System.out.println("Inventario vacío, no se puede eliminar");
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

    public N_tuple find(int id){  // *** <---- con el find se optiene el nodo tupla y teniendolo se puede editar cualquier atributo de esa tupla con los setters del N_tuple
        N_tuple N = this.head;
        while(N != null){
            if(N.getId() == id){
                return N;
            }
            if(N.getNext() == null){
                System.out.println("No se ha encontrado el elemento en la lista");
                return null;
            }
            N = N.getNext();
        }
        return null;
    }

    public boolean erase(int id){
        N_tuple N = find(id);
        if(N != null){
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
        System.out.println("No existe elemento a eliminar");
        return false;
    }

    public void imprimir_inventario(){
        N_tuple N = this.head;
        while(N != null){
            System.out.println(N.getId() + ", " + N.getNombre() + ", " + N.getCantidad() + ", " + N.getPrecio());
            N = N.getNext();
        }
    }

    public void imprimir_pedido(){
        N_tuple N = this.head;
        while(N != null){
            if (N.getCantidad() <= N.getTope()){
                System.out.println("faltan "+(N.getTope()-N.getCantidad())+" "+N.getNombre()+" para completar el inventario");
                N = N.getNext();
            }
        }
    }

}