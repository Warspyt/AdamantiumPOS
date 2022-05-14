import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.*;

public class TablaFactura extends JFrame {
    DefaultTableModel model;
    JTable tabla;

    public TablaFactura() {
        setTitle("Facturacion");
        setBounds(300, 300, 600, 200);
        model = new DefaultTableModel(datosFilas, columNames);
        tabla = new JTable(model);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    public void addRow(Object[] row) {
        model.insertRow(0, row);
    }

    private final String[] columNames = { "Id-Factura", "Referencia Producto", "Cantidad", "Total", "Fecha" };
    private Object[][] datosFilas;
}
