import javax.swing.JFrame;

/* Estructura lineal de una lista implementando un arreglo */
class Arreglo {

    /* Atributos del arreglo */
    private int size;
    private int count;
    private int position;
    private Factura arreglo[];

    public void setSize(int size) {
        this.size = size;
    }

    /* Constructor con el parametro de tamaño */
    public Arreglo(int size) {
        this.size = size;
        this.arreglo = new Factura[size];
    }

    /* Metodo para saber si el arreglo esta lleno */
    private boolean full() {
        return count >= size;
    }

    /* Metodo para saber si el arreglo esta vacio */
    private boolean empty() {
        return count <= 0;
    }

    /* Metodo para insetar un nuevo objeto factura en el arreglo */
    public boolean insert(Factura item) {
        boolean inserted = false;
        if (!full())
            if (!search(item)) {
                arreglo[count] = item;
                count++;
                inserted = true;
            } else {
                System.out.println("La lista esta llena");
            }

        return inserted;
    }

    /* Metodo para eliminar un objeto factura del arreglo */
    public boolean delete(int id) {
        boolean deleted = false;
        if (!empty())
            if (searchId(id)) {
                for (int j = position; j < count - 1; j++)
                    arreglo[j] = arreglo[j + 1];
                count--;
                deleted = true;
            } else {
                System.out.println("La factura no esta en la lista");
            }

        return deleted;
    }

    /*
     * Metodo para verificar si un objeto factura se encuentra dentro
     * del arreglo (se usa para evitar insertar una factura mas de una
     * vez en la lista)
     */
    private boolean search(Factura item) {
        boolean found = false;
        boolean stop = false;
        position = 0;

        while (position < count && !stop) {
            if (arreglo[position] == item) {
                found = true;
                stop = true;
            } else {
                position++;
            }
        }
        return found;
    }

    /*
     * Metodo para verificar si un id de factura se encuentra dentro
     * del arreglo (se usa para eliminar una factura por su id)
     */
    private boolean searchId(int id) {
        boolean found = false;
        boolean stop = false;
        position = 0;

        while (position < count && !stop) {
            if (arreglo[position].getId_factura() == id) {
                found = true;
                stop = true;
            } else {
                position++;
            }
        }
        return found;
    }

    /* Metodo para mostrar las facturas */
    public void PrintFacturas() {
        TablaFactura tablafacturas = new TablaFactura();

        int i = 0;
        while (arreglo[i] != null) {
            Object[] newRow = { arreglo[i].getId_factura(),
                    arreglo[i].getId_producto(),
                    arreglo[i].getCantidad(),
                    arreglo[i].getTotal(),
                    arreglo[i].getFecha(), };
            tablafacturas.addRow(newRow);
            i++;
        }
        JFrame mimarco = tablafacturas;
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }

}