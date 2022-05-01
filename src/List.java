class Lista {
    Node inicio;

    public Lista() {
        inicio = null;
    }

    public boolean empty() {
        if (inicio == null)
            return true;
        return false;
    }

    public void insert(Objeto dato) {
        Node nodito = new Node(dato);


        if (empty()) {
            inicio = nodito;
        } else {
            nodito.setNext(inicio);
            inicio = nodito;
        }

    }
    public Node consultar(int item) {
        Node pos = new Node();

        if (!empty()) {
            pos = inicio;
            while (pos != null) {
                if (pos.getData().id == item) {
                    return pos;
                }
                pos = pos.getNext();
            }

        }
        System.out.println("Item no encontrado");
        return pos;


    }

    public void modificar(int id, String nombre, int precio_dis, int precio_ven, int cantidad) {
        Node nodo = consultar(id);
        if (nodo.getData().id != 0) {
            nodo.getData().setId(id);
            nodo.getData().setNombre(nombre);
            nodo.getData().setPrecio_distribuidor(precio_dis);
            nodo.getData().setPrecio_venta(precio_ven);
            nodo.getData().setCantidad(cantidad);
            inicio=nodo;
        }
    }

    public void delete(int id) {
        Node nodo = consultar(id);
        if (nodo.getData().id != 0) {
            Node pos = inicio;
            while (pos.getNext().getData().id != id) {
                pos = pos.getNext();
            }
            pos.getNext().setNext(pos.getNext().getNext());
            inicio = pos;
        }
    }
    public void printList()
    {
        Node pos = inicio;
        while (pos != null) {
            pos.getData().toString();
            pos = pos.getNext();
        }
    }
}