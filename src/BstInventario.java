import javax.swing.JFrame;

public class BstInventario {

    private NodeBst raiz;

    public BstInventario() {
        raiz = null;
    }

    public NodeBst getRaiz() {
        return this.raiz;
    }

    private boolean empty() {
        if (raiz != null) {
            return false;
        } else {
            return true;
        }
    }

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

    /* Metodo para mostrar las facturas */
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
