public class Hash {
    int dato;
    int mode; // 0 = Vacío, 1 = Eliminado, 2 = Ocupado

    static int fx(int n, int m) {
        return ((n + 1) % m);
    }

    static void insert(Hash[] h, int m, int n) {
        boolean i = false;
        int j = fx(n, m);
        do {
            if (h[j].mode == 0 || h[j].mode == 1) {
                h[j].dato = n;
                h[j].mode = 2;
                i = true;
            } else {
                j++;
            }
        } while (j < m && !i);
        if (i) {
            System.out.println("¡Producto insertado con éxito!");
            // javax.swing.JOptionPane.showMessageDialog(null, "¡Elemento insertado con
            // éxito!");
        } else {
            System.out.println("¡Tabla llena!");
            // javax.swing.JOptionPane.showMessageDialog(null, "¡Tabla llena!");
        }
    }

    static int search(Hash[] h, int m, int n) {
        int j = fx(n, m);
        while (j < m) {
            if (h[j].mode == 0) {
                return -1;
            } else if (h[j].dato == n) {
                if (h[j].mode == 1) {
                    return -1;
                } else {
                    return j;
                }
            } else {
                j++;
            }
        }
        return -1;
    }

    static int delete(Hash[] h, int m, int n) {
        int i = search(h, m, n);
        if (i == -1) {
            return -1;
        } else {
            h[i].mode = 1;
            return 1;
        }
    }
}