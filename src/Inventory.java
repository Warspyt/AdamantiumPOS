import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;

/**
 *
 * @author espin
 */
public class Inventory {
    Objeto root;

    public Inventory() {
        root = null;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }

    public void clearAll() {
        root = null;
    }

    private int getHeight(Objeto objeto) {
        return objeto == null ? -1 : objeto.getAltura();
    }

    private void updateHeight(Objeto objeto) {
        objeto.setAltura(1 + Math.max(getHeight(objeto.getLeftChild()), getHeight(objeto.getRightChild())));
    }

    public int getBalance(Objeto objeto) {
        return (objeto == null) ? 0 : getHeight(objeto.getRightChild()) - getHeight(objeto.getLeftChild());
    }

    public Objeto rightRotation(Objeto y) {
        Objeto x = y.getLeftChild();
        Objeto z = x.getRightChild();
        x.setRightChild(y);
        y.setLeftChild(z);
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    public Objeto LeftRotation(Objeto y) {
        Objeto x = y.getRightChild();
        Objeto z = x.getLeftChild();
        x.setLeftChild(y);
        y.setRightChild(z);
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    public Objeto rebalance(Objeto objeto) {
        updateHeight(objeto);
        int balance = getBalance(objeto);
        if (balance > 1) {
            if (getHeight(objeto.getRightChild().getRightChild()) > getHeight(objeto.getRightChild().getLeftChild())) {
                objeto = LeftRotation(objeto);
            } else {
                objeto.setRightChild(rightRotation(objeto.getRightChild()));
                objeto = LeftRotation(objeto);
            }
        } else if (balance < -1) {
            if (getHeight(objeto.getLeftChild().getLeftChild()) > getHeight(objeto.getLeftChild().getRightChild())) {
                objeto = rightRotation(objeto);
            } else {
                objeto.setLeftChild(LeftRotation(objeto.getLeftChild()));
                objeto = rightRotation(objeto);
            }
        }
        return objeto;
    }

    public void Insertar(String tipo, int id, int precDistribuidor, int precVenta, int cant) {
        root = insertElement(tipo, id, precDistribuidor, precVenta, cant, root);
    }

    private Objeto insertElement(String tipo, int id, int precDistribuidor, int precVenta, int cant, Objeto objeto) {
        if (objeto == null) {
            return new Objeto(id, tipo, precDistribuidor, precVenta, cant);
        } else if (objeto.getId() > id) {
            objeto.setLeftChild(insertElement(tipo, id, precDistribuidor, precVenta, cant, objeto.getLeftChild()));
        } else if (objeto.getId() < id) {
            objeto.setRightChild(insertElement(tipo, id, precDistribuidor, precVenta, cant, objeto.getRightChild()));
        } else {
            JOptionPane.showMessageDialog(null, "ID duplicado, inserte nuevo ID");
        }
        return rebalance(objeto);
    }

    public void Eliminar(int ref) {
        root = delete(root, ref);
    }

    private Objeto delete(Objeto objeto, int id) {
        if (objeto == null) {
            return objeto;
        } else if (objeto.getId() > id) {
            objeto.setLeftChild(delete(objeto.getLeftChild(), id));
        } else if (objeto.getId() < id) {
            objeto.setRightChild(delete(objeto.getRightChild(), id));
        } else {
            if (objeto.getLeftChild() == null || objeto.getRightChild() == null) {
                objeto = (objeto.getLeftChild() == null) ? objeto.getRightChild() : objeto.getLeftChild();
            } else {
                Objeto maxLeftChild = maxLeftChild(objeto.getRightChild());
                objeto.setId(maxLeftChild.getId());
                objeto.setRightChild(delete(objeto.getRightChild(), objeto.getId()));
            }
        }
        if (objeto != null) {
            objeto = rebalance(objeto);
        }
        return objeto;
    }

    private Objeto maxLeftChild(Objeto objeto) {
        Objeto current = objeto;
        while (current.getLeftChild() != null) {
            current = current.getLeftChild();
        }
        return current;
    }

    public void ModificarPrecioDistribuidor(int ref, int precioNuevo) {
        search(ref).setPrecio_distribuidor(precioNuevo);
    }

    public void ModificarPrecioVenta(int ref, int precioNuevo) {
        search(ref).setPrecio_venta(precioNuevo);
    }

    public void ModificarCantidad(int ref, int nuevaCantidad) {
        search(ref).setCantidad(nuevaCantidad);
    }

    public Objeto search(int ref) {
        Objeto searched = root;
        while (searched != null) {
            if (searched.getId() == ref) {
                break;
            }
            searched = searched.getId() < ref ? searched.getRightChild() : searched.getLeftChild();
        }
        return searched;
    }

    public void ImprimirInventario() {
        MarcoTabla tabla = new MarcoTabla();
        print(root, tabla);
        JFrame mimarco = tabla;
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }

    private void print(Objeto printed, MarcoTabla tabla) {
        if (printed == null) {
            return;
        }
        print(printed.getRightChild(), tabla);
        Object[] newRow = { printed.getNombre(), printed.getId(), printed.getPrecio_distribuidor(),
                printed.getPrecio_venta(), printed.getCantidad() };
        tabla.addRow(newRow);
        print(printed.getLeftChild(), tabla);

    }

    /* Metodo para imprimir el pedido */
    public void imprimirPedido(int tope) {
        PrintPedido(tope, root);
    }

    /* Metodo para imprimir el pedido de cada articulo */
    private void PrintPedido(int tope, Objeto producto) {
        if (producto == null) {
            return;
        }
        PrintPedido(tope, producto.getRightChild());
        if (producto.getCantidad() < tope) {
            System.out.println("Producto: " + producto.getNombre()
                    + "\nCantidad disponible: " + producto.getCantidad()
                    + "\nCantidad a pedir: " + (tope - producto.getCantidad())
                    + "\nCosto: " + (producto.getPrecio_distribuidor() * (tope - producto.getCantidad())));
        }
        PrintPedido(tope, producto.getLeftChild());
    }
}

class MarcoTabla extends JFrame {
    DefaultTableModel model;
    JTable tabla;

    public MarcoTabla() {
        setTitle("INVENTARIO");
        setBounds(300, 300, 600, 200);
        model = new DefaultTableModel(datosFilas, columNames);
        tabla = new JTable(model);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    public void addRow(Object[] row) {
        model.insertRow(0, row);
    }

    private final String[] columNames = { "Nombre", "Referencia", "Precio Distribuidor", "Precio Venta", "Cantidad" };
    private Object[][] datosFilas;
}