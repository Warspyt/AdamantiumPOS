import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.*;

/*
 * Clase usada en la interfaz para mostrar el inventario a traves
 * de una tabla
 */
public class TablaInventario extends JFrame {
    DefaultTableModel model;
    JTable tabla;

    /* Metodo para generar la tabla */
    public TablaInventario() {
        setTitle("Inventario");
        setBounds(300, 300, 600, 200);
        model = new DefaultTableModel(datosFilas, columNames);
        tabla = new JTable(model);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    /*
     * Medodo para añadir una nueva fila en la tabla
     * cuando se inserta un nuevo producto en el inventario
     */
    public void addRow(Object[] row) {
        model.insertRow(0, row);
    }

    private final String[] columNames = { "Referencia", "Nombre", "Precio Distribuidor", "Precio Venta", "Cantidad" };
    private Object[][] datosFilas;
}
