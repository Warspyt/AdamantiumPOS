import java.util.Date;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido a ADAMANTIUM POS");

        // Creacion del arreglo para guardar las facturas
        Arreglo Facturacion;
        Facturacion = new Arreglo(200);
        Facturacion.facturacionAleatoria(100);

        Inventory inventario;
        inventario = new Inventory();

        inventario.Insertar("Camisar", 302, 30000, 40000, 10);
        inventario.Insertar("Pantalon", 322, 30000, 35000, 10);
        inventario.Insertar("Medias", 332, 3000, 10000, 20);

        // Inventario creado en el arbol BST
        BstInventario inventario2;
        inventario2 = new BstInventario();

        // Productos de prueba para el arbol BST
        Producto item1 = new Producto(12, "Camisa", 30000, 40000, 10);
        Producto item2 = new Producto(7, "Blusa", 10000, 15000, 20);
        Producto item3 = new Producto(15, "Zapatos", 50000, 85000, 8);

        inventario2.insert(item1, inventario2.getRaiz());
        inventario2.insert(item2, inventario2.getRaiz());
        inventario2.insert(item3, inventario2.getRaiz());

        while (true) {

            int option = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción para comenzar, "
                    + "\n1: Inventario "
                    + "\n2: Facturación "
                    + "\n3. Pedidos "
                    + "\n4. Finanzas"
                    + "\n5. Imprimir Inventario"));

            switch (option) {
                case 1:
                    /* Seleccionar si se quiere manipular el inventario con un arbol AVL o BST */
                    int optionEstructura = Integer
                            .parseInt(JOptionPane
                                    .showInputDialog("Elija la estructura con la que desea realizar la accion: "
                                            + "\n1: Arbol AVL"
                                            + "\n2: Arbol BST"));

                    switch (optionEstructura) {
                        case 1:
                            /* Analizar inventario con AVL */
                            int optionInventario = Integer
                                    .parseInt(JOptionPane.showInputDialog("Elija una opción para comenzar, "
                                            + "\n1: Agregar producto"
                                            + "\n2: Eliminar producto"
                                            + "\n3: Cantidad de unidades de un producto"
                                            + "\n4: Precio Distribuidor de un producto"
                                            + "\n5: Precio de Venta de un producto"
                                            + "\n6: Modificar Cantidad de un producto"
                                            + "\n7: Modificar Precio Distribuidor producto"
                                            + "\n8: Modificar Precio Venta producto"));
                            switch (optionInventario) {
                                case 1:
                                    inventario.Insertar(JOptionPane.showInputDialog("Inserte el nombre del producto"),
                                            Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte la id(o referencia) del producto")),
                                            Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte el precio de Distribuidor del producto")),
                                            Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte el precio de Venta del producto")),
                                            Integer.parseInt(
                                                    JOptionPane.showInputDialog("Inserte la cantidad disponile")));
                                    break;
                                case 2:
                                    inventario.Eliminar(
                                            Integer.parseInt(JOptionPane.showInputDialog(
                                                    "Inserte la id(o referencia) del producto a eliminar")));
                                    break;
                                case 3:
                                    Objeto searchCantidad = inventario
                                            .search(Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte la id(o referencia) del producto")));
                                    JOptionPane.showMessageDialog(null,
                                            "Hay " + searchCantidad.getCantidad() + " unidades");
                                    break;
                                case 4:
                                    Objeto searchPrecioDistribuidor = inventario
                                            .search(Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte la id(o referencia) del producto")));
                                    JOptionPane.showMessageDialog(null, "El producto cuesta "
                                            + searchPrecioDistribuidor.getPrecio_distribuidor() + " pesos");
                                    break;
                                case 5:
                                    Objeto searchPrecioVenta = inventario
                                            .search(Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte la id(o referencia) del producto")));
                                    JOptionPane.showMessageDialog(null,
                                            "El producto cuesta " + searchPrecioVenta.getPrecio_venta() + " pesos");
                                    break;
                                case 6:
                                    inventario.ModificarCantidad(
                                            Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte la id(o referencia) del producto")),
                                            Integer.parseInt(JOptionPane.showInputDialog(
                                                    "Inserte la nueva cantidad de unidades del producto")));
                                    break;
                                case 7:
                                    inventario.ModificarPrecioDistribuidor(
                                            Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte la id(o referencia) del producto")),
                                            Integer.parseInt(
                                                    JOptionPane
                                                            .showInputDialog("Inserte el nuevo precio del producto")));
                                    break;
                                case 8:
                                    inventario.ModificarPrecioVenta(
                                            Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte la id(o referencia) del producto")),
                                            Integer.parseInt(
                                                    JOptionPane
                                                            .showInputDialog("Inserte el nuevo precio del producto")));
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Inserte una opción válida");
                            }
                            break;

                        // Analizar inventario con arbol BST
                        case 2:

                            /* Opciones para la manipulacion del inventario */
                            int optionInventario2 = Integer
                                    .parseInt(JOptionPane.showInputDialog("Elija una opción para comenzar, "
                                            + "\n1: Agregar producto"
                                            + "\n2: Eliminar producto"
                                            + "\n3: Cantidad de unidades de un producto"
                                            + "\n4: Precio Distribuidor de un producto"
                                            + "\n5: Precio de Venta de un producto"
                                            + "\n6: Modificar Cantidad de un producto"
                                            + "\n7: Modificar Precio Distribuidor producto"
                                            + "\n8: Modificar Precio Venta producto"
                                            + "\n9: Ver Inventario"));

                            switch (optionInventario2) {

                                case 1:
                                    /* Creacion de un nuevo producto para agregar al inventario en el BST */
                                    Producto newitem = new Producto(
                                            Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte la id(o referencia) del producto")),
                                            JOptionPane.showInputDialog("Inserte el nombre del producto"),
                                            Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte el precio de Distribuidor del producto")),
                                            Integer.parseInt(JOptionPane
                                                    .showInputDialog("Inserte el precio de Venta del producto")),
                                            Integer.parseInt(
                                                    JOptionPane.showInputDialog("Inserte la cantidad disponile")));

                                    inventario2.insert(newitem, inventario2.getRaiz());

                                    break;
                                case 2:
                                    /* Eliminacion de un producto en el inventario */
                                    try {
                                        inventario2.remove(Integer.parseInt(JOptionPane
                                                .showInputDialog("Inserte la id(o referencia) del producto")),
                                                inventario2.getRaiz(), inventario2.getRaiz());
                                    } catch (Exception e) {
                                        System.out.println("No se pudo eliminar el producto");
                                    }
                                    break;
                                case 3:
                                    /* Se muestran las cantidades existentes de un determinado producto */
                                    Producto item_U = inventario2.search(Integer.parseInt(JOptionPane
                                            .showInputDialog("Inserte la id(o referencia) del producto")),
                                            inventario2.getRaiz());

                                    // Se verifica que el producto se encuentre en el arbol BST
                                    if (item_U != null) {
                                        JOptionPane.showMessageDialog(null,
                                                "Producto: " + item_U.getNombre() + "\n\n" + item_U.getCantidad()
                                                        + " unidades");
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "No se encontro el producto");
                                    }

                                    break;
                                case 4:
                                    /* Se muestra el precio de distribuidor de un determinado producto */
                                    Producto item_Pd = inventario2.search(Integer.parseInt(JOptionPane
                                            .showInputDialog("Inserte la id(o referencia) del producto")),
                                            inventario2.getRaiz());

                                    // Se verifica que el producto se encuentre en el arbol BST
                                    if (item_Pd != null) {
                                        JOptionPane.showMessageDialog(null,
                                                "Producto: " + item_Pd.getNombre() + "\n\n"
                                                        + item_Pd.getPrecio_distribuidor()
                                                        + " pesos");
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "No se encontro el producto");
                                    }
                                    break;
                                case 5:
                                    /* Se muestra el precio de venta de un determinado producto */
                                    Producto item_Pv = inventario2.search(Integer.parseInt(JOptionPane
                                            .showInputDialog("Inserte la id(o referencia) del producto")),
                                            inventario2.getRaiz());

                                    // Se verifica que el producto se encuentre en el arbol BST
                                    if (item_Pv != null) {
                                        JOptionPane.showMessageDialog(null,
                                                "Producto: " + item_Pv.getNombre() + "\n\n" + item_Pv.getPrecio_venta()
                                                        + " pesos");
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "No se encontro el producto");
                                    }
                                    break;
                                case 6:
                                    /* Se modifica la cantidad de un determinado producto */
                                    try {
                                        inventario2.search(Integer.parseInt(JOptionPane
                                                .showInputDialog("Inserte la id(o referencia) del producto")),
                                                inventario2.getRaiz()).setCantidad(
                                                        Integer.parseInt(JOptionPane
                                                                .showInputDialog(
                                                                        "Inserte la nueva cantidad del producto")));
                                    } catch (Exception e) {
                                        System.out.println("No se pudo modificar la cantidad");
                                    }
                                    break;
                                case 7:
                                    /* Se modifica el precio de distribuidor de un determinado producto */
                                    try {
                                        inventario2.search(Integer.parseInt(JOptionPane
                                                .showInputDialog("Inserte la id(o referencia) del producto")),
                                                inventario2.getRaiz()).setPrecio_distribuidor(
                                                        Integer.parseInt(JOptionPane
                                                                .showInputDialog(
                                                                        "Inserte el nuevo precio de distribuidor del producto")));
                                    } catch (Exception e) {
                                        System.out.println("No se pudo modificar el precio de distribuidor");
                                    }
                                    break;
                                case 8:
                                    /* Se modifica el precio de venta de un determinado producto */
                                    try {
                                        inventario2.search(Integer.parseInt(JOptionPane
                                                .showInputDialog("Inserte la id(o referencia) del producto")),
                                                inventario2.getRaiz()).setPrecio_venta(
                                                        Integer.parseInt(JOptionPane
                                                                .showInputDialog(
                                                                        "Inserte el nuevo precio de venta del producto")));
                                    } catch (Exception e) {
                                        System.out.println("No se pudo modificar el precio de venta");
                                    }
                                    break;
                                case 9:
                                    /* Se muestra el inventario del arbol BST a traves de una tabla */
                                    inventario2.printInventario();
                                    break;

                            }

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

                            /* Se piden los datos de entrada al usuario */
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
                            /* Mostrar la facturacion en una tabla */
                            Facturacion.printFacturas();
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
                    inventario.ImprimirInventario();
                    break;
            }
        }

    }

}