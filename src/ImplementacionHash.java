public class ImplementacionHash {
    public static void main(String[] args) {
        try {
            int i, n, resp;
            int m = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el tamaño de la tabla"));
            Hash[] h = new Hash[m];
            for (i = 0; i < m; i++) {
                h[i] = new Hash();
                h[i].mode = 0;
            }
            do {
                resp = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Menú Principal: "
                        + "Insertar (1), Buscar (2), Eliminar (3), Salir (4)"));
                switch (resp) {
                    case 1:
                        n = Integer.parseInt(javax.swing.JOptionPane
                                .showInputDialog("Ingrese el ID del producto a ser insertado en la tabla:"));
                        Hash.insert(h, m, n);
                        break;
                    case 2:
                        n = Integer.parseInt(javax.swing.JOptionPane
                                .showInputDialog("Ingrese el ID del producto a ser buscado en la tabla:"));
                        i = Hash.search(h, m, n);
                        if (i == -1) {
                            javax.swing.JOptionPane.showMessageDialog(null, "ID no encontrado");
                        } else {
                            javax.swing.JOptionPane.showMessageDialog(null,
                                    "ID del producto encontrado en la posición: " + i);
                        }
                        break;
                    case 3:
                        n = Integer.parseInt(javax.swing.JOptionPane
                                .showInputDialog("Ingrese el ID del producto a ser eliminado de la tabla:"));
                        i = Hash.delete(h, m, n);
                        if (i == -1) {
                            javax.swing.JOptionPane.showMessageDialog(null, "ID no encontrado");
                        } else {
                            javax.swing.JOptionPane.showMessageDialog(null, "Producto eliminado con éxito");
                        }
                        break;
                    case 4:
                        System.exit(0);
                    default:
                }
            } while (resp != 4);
        } catch (NumberFormatException nfe) {
            javax.swing.JOptionPane.showMessageDialog(null, "Está Saliendo del Programa");
        } catch (OutOfMemoryError ome) {
            javax.swing.JOptionPane.showMessageDialog(null, "No Hay Espacio");
        }
    }
}