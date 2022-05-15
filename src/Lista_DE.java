public class Lista_DE{
    Node head, tail;

    public Lista_DE(){
        head=tail=null;
    }

    public boolean isEmpty(){
        return head == null && tail == null;
    }

    public void pushFront(int data){
        Node N=new Node(data);
        if(isEmpty()){
            head=N;
            tail=N;
        }
        else{
            N.next=head;
            head.prev=N;
        }
        head=N;
    }

    public void pushBack(int data){
        Node N=new Node(data);
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

    public void popFront(){
        if(isEmpty()){
            System.out.println("Lista vacía, no se puede eliminar");
        }
        else if(head == tail){
            head=null;
            tail=null;
        }
        else{
            head=head.getNext();
            head.prev=null;
        }
    }

    public void popBack(){
        if(isEmpty()){
            System.out.println("Lista vacía, no se puede eliminar");
        }
        else if(head == tail){
            head=null;
            tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
    }

    public Node find(int Key){
        Node N = head;
        while(N.getNext() != null){
            if(N.getData() != Key){
                N =N.getNext();
            }
            return N;
        }
        System.out.println("No se ha encontrado el elemento en la lista");
        return null;
    }

    public boolean erase(int Key){
        Node N = find(Key);
        if(N != null){
            N.getPrev().setNext(N.getNext());
            N.getNext().setPrev(N.getPrev());
            return true;
        }
        System.out.println("No existe elemento a eliminar");
        return false;
    }

    void printList(){
        if(isEmpty()){
            System.out.println("Lista vacía");
        }
        else if(head == tail){
            System.out.println(head.getData());
        }
        else{
            Node aux=head;
            while(aux != null){
                System.out.println(aux.getData()+" ");
                aux=aux.getNext();
            }
        }
    }

}
