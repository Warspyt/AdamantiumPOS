public class NodeBst {

    private Producto data;
    private NodeBst leftChild, rightChild;

    public NodeBst(Producto data) {
        this.data = data;
    }

    public Producto getdata() {
        return this.data;
    }

    public void setdata(Producto newdata) {
        this.data = newdata;
    }

    public NodeBst getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(NodeBst newLeftChild) {
        this.leftChild = newLeftChild;
    }

    public NodeBst getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(NodeBst newRightChild) {
        this.rightChild = newRightChild;
    }
}
