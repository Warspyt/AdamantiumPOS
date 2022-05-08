/* Estructura lineal de una lista implementando un arreglo */
class Arreglo {

    /* Atributos del arreglo */
    Objeto data;
    int size;
    int count;
    int position;
    Factura arreglo[];

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
    public boolean delete(Factura item) {
        boolean deleted = false;
        if (!empty())
            if (search(item)) {
                for (int j = position; j < count - 1; j++)
                    arreglo[j] = arreglo[j + 1];
                count--;
                deleted = true;
            } else {
                System.out.println("El elemento no esta en la lista");
            }

        return deleted;
    }

    /*
     * Metodo para verificar si un objeto factura se encuentra dentro
     * del arreglo
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

}