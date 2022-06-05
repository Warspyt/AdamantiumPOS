import javax.swing.JFrame;
import java.io.Serializable;

/* Clase para generar un arbol BST */
public class BstInventario implements Serializable {

    /* Atributos del arbol BST */
    private NodeBst raiz;

    /* Constructor de la clase BstInventario sin parametros */
    public BstInventario() {
        raiz = null;
    }

    /* Metodo get para el atributo raiz */
    public NodeBst getRaiz() {
        return this.raiz;
    }

    /* Metodo para verificar si el arbol BST se encuentra vacio */
    private boolean empty() {
        if (raiz != null) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * Metodo para insertar un nuevo producto en el arbol BST
     * (el orden esta dado por el id de referencia de los productos)
     */
    public NodeBst insert(Producto item, NodeBst nodo) {
        if (empty()) {
            this.raiz = new NodeBst(item);
        }

        else if (nodo == null) {
            nodo = new NodeBst(item);
        }

        else {

            if (item.getId() < nodo.getdata().getId()) {
                nodo.setLeftChild(insert(item, nodo.getLeftChild()));
            }

            else {

                if (item.getId() > nodo.getdata().getId()) {
                    nodo.setRightChild(insert(item, nodo.getRightChild()));
                }

                else {
                    System.out.println("El elemento ya se encuentra en el inventario");
                }
            }
        }

        return nodo;
    }

    /* Metodo para eliminar un producto en el arbol BST */
    public NodeBst remove(int id, NodeBst nodo, NodeBst prevNode) {
        NodeBst item;

        if (empty() || nodo == null) {
            System.out.println("No se encontro el producto");
            item = null;
            return item;
        } else if (nodo.getdata().getId() == id) {
            item = nodo;

            // Si el nodo no tiene hijos
            if (nodo.getLeftChild() == null && nodo.getRightChild() == null) {
                if (prevNode.getRightChild() == nodo) {
                    prevNode.setRightChild(null);
                } else if (prevNode.getLeftChild() == nodo) {
                    prevNode.setLeftChild(null);
                }
            }

            // si el nodo tiene dos hijos
            else if (nodo.getLeftChild() != null && nodo.getRightChild() != null) {
                NodeBst copyMinNode = minNode(nodo.getRightChild());

                if (prevNode.getRightChild() == nodo) {
                    prevNode.setRightChild(copyMinNode);
                } else if (prevNode.getLeftChild() == nodo) {
                    prevNode.setLeftChild(copyMinNode);
                }

                remove(copyMinNode.getdata().getId(), nodo, nodo);
            }

            // si el nodo tiene un hijo derecho
            else if (nodo.getRightChild() != null) {
                NodeBst copyNode = nodo.getRightChild();

                if (prevNode.getRightChild() == nodo) {
                    prevNode.setRightChild(copyNode);
                } else if (prevNode.getLeftChild() == nodo) {
                    prevNode.setLeftChild(copyNode);
                }
            }

            // si el nodo tiene un hijo izquierdo
            else if (nodo.getLeftChild() != null) {
                NodeBst copyNode = nodo.getLeftChild();

                if (prevNode.getRightChild() == nodo) {
                    prevNode.setRightChild(copyNode);
                } else if (prevNode.getLeftChild() == nodo) {
                    prevNode.setLeftChild(copyNode);
                }
            }

            return item;
        } else {
            if (id < nodo.getdata().getId()) {
                item = remove(id, nodo.getLeftChild(), nodo);
            } else {
                item = remove(id, nodo.getRightChild(), nodo);
            }
        }

        return item;
    }

    private NodeBst minNode(NodeBst nodo) {
        if (nodo != null) {
            while (nodo.getLeftChild() != null) {
                nodo = nodo.getLeftChild();
            }
        }

        return nodo;
    }

    /*
     * Metodo para buscar mediante el id un determinado producto,
     * se usa para imprimir el inventario o modificar los atributos
     * de un item
     */
    public Producto search(int id, NodeBst nodo) {
        Producto item;

        if (empty() || nodo == null) {
            System.out.println("No se encontro el producto");
            item = null;
            return item;
        } else if (nodo.getdata().getId() == id) {
            item = null;
            return nodo.getdata();
        } else {
            if (id < nodo.getdata().getId()) {
                item = search(id, nodo.getLeftChild());
            } else {
                item = search(id, nodo.getRightChild());
            }
        }

        return item;
    }

    /* Metodo para mostrar el inventario */
    public void printInventario() {
        TablaInventario tablaInventario = new TablaInventario();

        addrows(tablaInventario, raiz);

        JFrame mimarco = tablaInventario;
        mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mimarco.setVisible(true);
        while (mimarco.isShowing()) {
            mimarco.setVisible(true);
        }

    }

    /*
     * Metodo para agregar a la tabla en orden ascendente segun el id,
     * los productos del BST (la funcion hace recursion hasta que se
     * agregan todos los elementos y luego es llamada en el metodo printInventario)
     */
    private void addrows(TablaInventario inventario, NodeBst nodo) {
        if (nodo.getRightChild() != null) {
            addrows(inventario, nodo.getRightChild());
        }
        Object[] newRow = { nodo.getdata().getId(),
                nodo.getdata().getNombre(),
                nodo.getdata().getPrecio_distribuidor(),
                nodo.getdata().getPrecio_venta(),
                nodo.getdata().getCantidad() };

        inventario.addRow(newRow);

        if (nodo.getLeftChild() != null) {
            addrows(inventario, nodo.getLeftChild());
        }
    }

}