public class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node() {
        this(0);
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}