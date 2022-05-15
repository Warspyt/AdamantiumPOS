import java.util.Objects;

public class Inventory extends Lista_DE { // *** heredado de la clase lista ***
    N_tuple head,tail;

    public Inventory(){
        super();
    }

    public boolean isEmpty(){
        return head == null && tail == null;
    }

    public void pushBack(String id,String nombre,int precio, int costo,int cantidad, int tope){
        N_tuple N=new N_tuple(id, nombre, precio, costo, cantidad, tope);
        if(isEmpty()){
            head=N;
            tail=N;
        }
        else{
            tail.next=N;
            N.prev=tail;
        }
        tail=N;
    }

    public N_tuple find(String id){  // *** <---- con el find se optiene el nodo tupla y teniendolo se puede editar cualquier atributo de esa tupla con los setters del N_tuple
        N_tuple N = head;
        while(N != null){
            if(!Objects.equals(N.getId(), id)){
                N =N.getNext();
            }
            return N;
        }
        System.out.println("No se ha encontrado el elemento en la lista");
        return null;
    }

    public boolean erase(String id){
        N_tuple N = find(id);
        if(N != null){
            N.getPrev().setNext(N.getNext());
            N.getNext().setPrev(N.getPrev());
            return true;
        }
        System.out.println("No existe elemento a eliminar");
        return false;
    }

    public void imprimir_pedido(){
        N_tuple N = head;
        while(N != null){
            if (N.getCantidad() <= N.getTope()){
                System.out.println("faltan "+(N.getTope()-N.getCantidad())+" "+N.getNombre()+" para completar el inventario");
                N = N.getNext();
            }
        }
    }

}
