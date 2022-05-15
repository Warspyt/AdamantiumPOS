public class Lista_DE{
    Node head, tail;

    public Lista_DE(){
        this.head=this.tail=null;
    }

    public boolean isEmpty(){
        return this.head == null && this.tail == null;
    }

    public void pushFront(int data){
        Node N=new Node(data);
        if(isEmpty()){
            this.head=N;
            this.tail=N;
        }
        else{
            N.next=this.head;
            this.head.prev=N;
        }
        this.head=N;
    }

    public void pushBack(int data){
        Node N=new Node(data);
        if(isEmpty()){
            this.head=N;
            this.tail=N;
        }
        else{
            this.tail.next=N;
            N.prev=this.tail;
        }
        this.tail=N;
    }

    public void popFront(){
        if(isEmpty()){
            System.out.println("Lista vacía, no se puede eliminar");
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
            System.out.println("Lista vacía, no se puede eliminar");
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

    public Node find(int Key){
        Node N = this.head;
        while(N != null){
            if(N.getData() != Key){
                N =N.getNext();
            }
            return N;
        }
        System.out.println("No se ha encontrado el elemento en la lista");
        return N;
    }

    public boolean erase(int Key){
        Node N = find(Key);
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

    void printList(){
        if(isEmpty()){
            System.out.println("Lista vacía");
        }
        else if(this.head == this.tail){
            System.out.println(this.head.getData());
        }
        else{
            Node aux=this.head;
            while(aux != null){
                System.out.println(aux.getData()+" ");
                aux=aux.getNext();
            }
        }
    }

}

