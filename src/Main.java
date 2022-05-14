import java.util.Date;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido a ADAMANTIUM POS");

        // Creacion del arreglo para guardar las facturas
        Arreglo Facturacion;
        Facturacion = new Arreglo(10);
        // Inventory inventario;
        // inventario = new Inventory();

        // inventario.Insertar("Camisar", "p302", 30000, 10);
        // inventario.Insertar("Pantalon", "p322", 30000, 10);
        // inventario.Insertar("Medias", "p332", 3000, 20);

        while (true) {

            int option = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción para comenzar, "
                    + "\n1: Inventario "
                    + "\n2: Facturación "
                    + "\n3. Pedidos "
                    + "\n4. Finanzas"
                    + "\n5. Imprimir Inventario"));

            switch (option) {
                case 1:
                    int optionInventario = Integer
                            .parseInt(JOptionPane.showInputDialog("Elija una opción para comenzar, "
                                    + "\n1: Agregar producto"
                                    + "\n2: Eliminar producto"
                                    + "\n3: Cantidad de unidades de un producto"
                                    + "\n4: Precio de un producto"
                                    + "\n5: Modificar Cantidad de un producto"
                                    + "\n6: Modificar Precio producto"));
                    switch (optionInventario) {
                        case 1:
                            // inventario.Insertar(JOptionPane.showInputDialog("Inserte el nombre del
                            // producto"),
                            // JOptionPane.showInputDialog("Inserte la id(o referencia) del producto"),
                            // Integer.parseInt(JOptionPane.showInputDialog("Inserte el precio del
                            // producto")),
                            // Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad
                            // disponile")));
                            break;
                        case 2:
                            // inventario.Eliminar(
                            // JOptionPane.showInputDialog("Inserte la id(o referencia) del producto a
                            // eliminar"));
                            break;
                        case 3:
                            // Node searchCantidad = inventario
                            // .Search(JOptionPane.showInputDialog("Inserte la id(o referencia) del
                            // producto"));
                            // JOptionPane.showMessageDialog(null, "Hay " + searchCantidad.getCantidad() + "
                            // unidades");
                            break;
                        case 4:
                            // Node searchPrecio = inventario
                            // .Search(JOptionPane.showInputDialog("Inserte la id(o referencia) del
                            // producto"));
                            // JOptionPane.showMessageDialog(null,
                            // "El producto cuesta " + searchPrecio.getPrecio() + " pesos");
                            break;
                        case 5:
                            // inventario.ModificarCantidad(
                            // JOptionPane.showInputDialog("Inserte la id(o referencia) del producto"),
                            // Integer.parseInt(JOptionPane
                            // .showInputDialog("Inserte la nueva cantidad de unidades del producto")));
                            break;
                        case 6:
                            // inventario.ModificarPrecio(
                            // JOptionPane.showInputDialog("Inserte la id(o referencia) del producto"),
                            // Integer.parseInt(
                            // JOptionPane.showInputDialog("Inserte el nuevo precio del producto")));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Inserte una opción válida");
                    }
                    break;
                case 2:

                    /* Mostrar al usuario las opciones disponibles dentro de facturacion */
                    int optionFacturacion = Integer
                            .parseInt(JOptionPane.showInputDialog("Elija una opción para comenzar, "
                                    + "\n1: Agregar factura"
                                    + "\n2: Eliminar factura"
                                    + "\n3: Ver facturacion"));
                    switch (optionFacturacion) {
                        case 1:
                            /* Creacion de una nueva factura que se inserta en el arreglo de facturas */
                            Factura factura;

                            factura = new Factura(
                                    Integer.parseInt(JOptionPane.showInputDialog("Inserte el id de la factura")),
                                    Integer.parseInt(JOptionPane.showInputDialog("Inserte el id del producto")),
                                    Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad")),
                                    Integer.parseInt(JOptionPane.showInputDialog("Inserte el valor total")),
                                    new Date());

                            Facturacion.insert(factura);
                            break;
                        case 2:
                            /* Eliminacion de la factura con el id indicado */
                            Facturacion.delete(
                                    Integer.parseInt(
                                            JOptionPane.showInputDialog("Inserte el id de la factura a eliminar")));
                            break;
                        case 3:
                            Facturacion.PrintFacturas();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Inserte una opción válida");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    // inventario.ImprimirInventario();
                    break;
            }
        }

    }

}
