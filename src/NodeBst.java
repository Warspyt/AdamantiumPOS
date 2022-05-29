/* Clase para crear los nodos del arbol BST */
public class NodeBst {

    /* Atributos del nodo */
    private Producto data;
    private NodeBst leftChild, rightChild;

    /*
     * Constructor de la clase NodeBst con el parametro data
     * que almacena la informacion de un producto
     */
    public NodeBst(Producto data) {
        this.data = data;
    }

    /* Metodos set y get para los atributos de la clase NodeBst */
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
