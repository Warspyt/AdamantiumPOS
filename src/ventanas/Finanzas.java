package ventanas;

/**
 *
 * @author espin
 */
public class Finanzas extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    Inventory inventario;

    public Finanzas(Inventory inventario) {
        this.inventario = inventario;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        barraInventario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Finanzas = new javax.swing.JLabel();
        InventarioOpc = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Facturación = new javax.swing.JLabel();
        Pedidos = new javax.swing.JLabel();
        barraGrisSup = new javax.swing.JPanel();
        Ayuda = new javax.swing.JLabel();
        Ventana = new javax.swing.JLabel();
        Vista = new javax.swing.JLabel();
        Reportes = new javax.swing.JLabel();
        Consultas = new javax.swing.JLabel();
        Datos = new javax.swing.JLabel();
        Edicion = new javax.swing.JLabel();
        Archivo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1777, 997));
        setMinimumSize(new java.awt.Dimension(1777, 997));
        setPreferredSize(new java.awt.Dimension(1777, 997));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraInventario.setBackground(new java.awt.Color(29, 84, 189));
        barraInventario.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        barraInventario.setForeground(new java.awt.Color(255, 255, 255));
        barraInventario.setText("                       Finanzas");
        barraInventario.setMaximumSize(new java.awt.Dimension(1736, 49));
        barraInventario.setMinimumSize(new java.awt.Dimension(1736, 49));
        barraInventario.setOpaque(true);
        barraInventario.setPreferredSize(new java.awt.Dimension(1736, 49));
        add(barraInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 209, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setMaximumSize(new java.awt.Dimension(1736, 137));
        jPanel2.setMinimumSize(new java.awt.Dimension(1736, 137));
        jPanel2.setPreferredSize(new java.awt.Dimension(1736, 137));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Finanzas.setBackground(new java.awt.Color(241, 241, 241));
        Finanzas.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        Finanzas.setForeground(new java.awt.Color(102, 102, 102));
        Finanzas.setText("Finanzas");
        Finanzas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Finanzas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Finanzas.setMaximumSize(new java.awt.Dimension(1736, 49));
        Finanzas.setMinimumSize(new java.awt.Dimension(1736, 49));
        Finanzas.setOpaque(true);
        Finanzas.setPreferredSize(new java.awt.Dimension(1736, 49));
        jPanel2.add(Finanzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 110, -1));

        InventarioOpc.setBackground(new java.awt.Color(241, 241, 241));
        InventarioOpc.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        InventarioOpc.setForeground(new java.awt.Color(102, 102, 102));
        InventarioOpc.setText("Inventario");
        InventarioOpc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InventarioOpc.setMaximumSize(new java.awt.Dimension(1736, 49));
        InventarioOpc.setMinimumSize(new java.awt.Dimension(1736, 49));
        InventarioOpc.setPreferredSize(new java.awt.Dimension(1736, 49));
        InventarioOpc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventarioOpcMouseClicked(evt);
            }
        });
        jPanel2.add(InventarioOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 49, 1230, 10));

        Facturación.setBackground(new java.awt.Color(29, 84, 189));
        Facturación.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        Facturación.setForeground(new java.awt.Color(102, 102, 102));
        Facturación.setText("Facturación");
        Facturación.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Facturación.setMaximumSize(new java.awt.Dimension(1736, 49));
        Facturación.setMinimumSize(new java.awt.Dimension(1736, 49));
        Facturación.setPreferredSize(new java.awt.Dimension(1736, 49));
        Facturación.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacturaciónMouseClicked(evt);
            }
        });
        jPanel2.add(Facturación, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 140, -1));

        Pedidos.setBackground(new java.awt.Color(29, 84, 189));
        Pedidos.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        Pedidos.setForeground(new java.awt.Color(102, 102, 102));
        Pedidos.setText("Pedidos");
        Pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pedidos.setMaximumSize(new java.awt.Dimension(1736, 49));
        Pedidos.setMinimumSize(new java.awt.Dimension(1736, 49));
        Pedidos.setPreferredSize(new java.awt.Dimension(1736, 49));
        Pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PedidosMouseClicked(evt);
            }
        });
        jPanel2.add(Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 100, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 53, 1736, 137));

        barraGrisSup.setBackground(new java.awt.Color(179, 179, 179));
        barraGrisSup.setMaximumSize(new java.awt.Dimension(1777, 38));
        barraGrisSup.setMinimumSize(new java.awt.Dimension(1777, 38));
        barraGrisSup.setName(""); // NOI18N
        barraGrisSup.setPreferredSize(new java.awt.Dimension(1777, 38));
        barraGrisSup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ayuda.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Ayuda.setForeground(new java.awt.Color(255, 255, 255));
        Ayuda.setText("Ayuda");
        Ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraGrisSup.add(Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 8, -1, -1));

        Ventana.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Ventana.setForeground(new java.awt.Color(255, 255, 255));
        Ventana.setText("Ventana");
        Ventana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraGrisSup.add(Ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 8, -1, -1));

        Vista.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Vista.setForeground(new java.awt.Color(255, 255, 255));
        Vista.setText("Vista");
        Vista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraGrisSup.add(Vista, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 8, -1, -1));

        Reportes.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Reportes.setForeground(new java.awt.Color(255, 255, 255));
        Reportes.setText("Reportes");
        Reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraGrisSup.add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 8, -1, -1));

        Consultas.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Consultas.setForeground(new java.awt.Color(255, 255, 255));
        Consultas.setText("Consultas");
        Consultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraGrisSup.add(Consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 8, -1, -1));

        Datos.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Datos.setForeground(new java.awt.Color(255, 255, 255));
        Datos.setText("Datos");
        Datos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraGrisSup.add(Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 8, -1, -1));

        Edicion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Edicion.setForeground(new java.awt.Color(255, 255, 255));
        Edicion.setText("Edición");
        Edicion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraGrisSup.add(Edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 8, -1, -1));

        Archivo.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Archivo.setForeground(new java.awt.Color(255, 255, 255));
        Archivo.setText("Archivo");
        Archivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraGrisSup.add(Archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 8, -1, -1));

        add(barraGrisSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>

    private void InventarioOpcMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Inventario ventInv = new Inventario(inventario);
        Principal.ShowPanel(ventInv);
    }

    private void FacturaciónMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Facturacion ventFac = new Facturacion(inventario);
        Principal.ShowPanel(ventFac);
    }

    private void PedidosMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Pedido ventPed = new Pedido(inventario);
        Principal.ShowPanel(ventPed);
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Archivo;
    private javax.swing.JLabel Ayuda;
    private javax.swing.JLabel Consultas;
    private javax.swing.JLabel Datos;
    private javax.swing.JLabel Edicion;
    private javax.swing.JLabel Facturación;
    private javax.swing.JLabel Finanzas;
    private javax.swing.JLabel InventarioOpc;
    private javax.swing.JLabel Pedidos;
    private javax.swing.JLabel Reportes;
    private javax.swing.JLabel Ventana;
    private javax.swing.JLabel Vista;
    private javax.swing.JPanel barraGrisSup;
    private javax.swing.JLabel barraInventario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration
}
