public class Node {
    private Objeto data;
    private Node next;

    public Node()
    {
        this.data=new Objeto();
    }
    public Node(Objeto item) {
        this.data=item;
        next = null;
    }
    public Objeto getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}