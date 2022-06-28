package ventanas;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

/**
 *
 * @author espin
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        extender();
        this.setLocationRelativeTo(null);
    }
        public static String user;
        public static String contraseña;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        WindowMinMax = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Info = new javax.swing.JLabel();
        Inicio = new javax.swing.JLabel();
        Nuevo = new javax.swing.JLabel();
        Abrir = new javax.swing.JLabel();
        Comentarios = new javax.swing.JLabel();
        Cuenta = new javax.swing.JLabel();
        Ayuda = new javax.swing.JLabel();
        tipoUsuario = new javax.swing.JLabel();
        Adamantium = new javax.swing.JLabel();
        logoLateral = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BarraAzulLateral = new javax.swing.JPanel();
        BarraGrisSuperior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setMinimumSize(new java.awt.Dimension(1920, 1080));
        BackGround.setPreferredSize(new java.awt.Dimension(1920, 1080));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMaximumSize(new java.awt.Dimension(1777, 997));
        content.setMinimumSize(new java.awt.Dimension(1777, 997));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1777, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 997, Short.MAX_VALUE)
        );

        BackGround.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 83, -1, -1));

        Cerrar.setBackground(new java.awt.Color(200, 200, 200));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SimboloCerrar.png"))); // NOI18N
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.setOpaque(true);
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });
        BackGround.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 0, -1, -1));

        WindowMinMax.setBackground(new java.awt.Color(200, 200, 200));
        WindowMinMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SimboloCompMin.png"))); // NOI18N
        WindowMinMax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WindowMinMax.setOpaque(true);
        WindowMinMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WindowMinMaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WindowMinMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WindowMinMaxMouseExited(evt);
            }
        });
        BackGround.add(WindowMinMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 0, -1, -1));

        Minimizar.setBackground(new java.awt.Color(200, 200, 200));
        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SimboloMinimizar.png"))); // NOI18N
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.setOpaque(true);
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizarMouseExited(evt);
            }
        });
        BackGround.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 0, -1, -1));

        Info.setBackground(new java.awt.Color(200, 200, 200));
        Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SimboloInfo.png"))); // NOI18N
        Info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Info.setOpaque(true);
        Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InfoMouseExited(evt);
            }
        });
        BackGround.add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 0, -1, -1));

        Inicio.setBackground(new java.awt.Color(30, 84, 190));
        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio.png"))); // NOI18N
        Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inicio.setOpaque(true);
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
        });
        BackGround.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        Nuevo.setBackground(new java.awt.Color(30, 84, 190));
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nuevo.png"))); // NOI18N
        Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nuevo.setOpaque(true);
        Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoMouseClicked(evt);
            }
        });
        BackGround.add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        Abrir.setBackground(new java.awt.Color(30, 84, 190));
        Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Abrir.png"))); // NOI18N
        Abrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Abrir.setOpaque(true);
        Abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbrirMouseClicked(evt);
            }
        });
        BackGround.add(Abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        Comentarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Comentarios.png"))); // NOI18N
        Comentarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackGround.add(Comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 910, -1, -1));

        Cuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cuenta.png"))); // NOI18N
        Cuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuentaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CuentaMousePressed(evt);
            }
        });
        BackGround.add(Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 950, -1, -1));

        Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ayuda.png"))); // NOI18N
        Ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AyudaMouseClicked(evt);
            }
        });
        BackGround.add(Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 990, -1, -1));

        tipoUsuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        tipoUsuario.setText("Usuario");
        BackGround.add(tipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 40));

        Adamantium.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Adamantium.setText("Adamantium");
        BackGround.add(Adamantium, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, -1, -1));

        logoLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoBarraLateral.png"))); // NOI18N
        BackGround.add(logoLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        BackGround.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        BackGround.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 890, 100, 30));

        BarraAzulLateral.setBackground(new java.awt.Color(30, 84, 190));
        BarraAzulLateral.setPreferredSize(new java.awt.Dimension(143, 1080));

        javax.swing.GroupLayout BarraAzulLateralLayout = new javax.swing.GroupLayout(BarraAzulLateral);
        BarraAzulLateral.setLayout(BarraAzulLateralLayout);
        BarraAzulLateralLayout.setHorizontalGroup(
            BarraAzulLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        BarraAzulLateralLayout.setVerticalGroup(
            BarraAzulLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        BackGround.add(BarraAzulLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BarraGrisSuperior.setBackground(new java.awt.Color(200, 200, 200));
        BarraGrisSuperior.setPreferredSize(new java.awt.Dimension(1777, 83));

        javax.swing.GroupLayout BarraGrisSuperiorLayout = new javax.swing.GroupLayout(BarraGrisSuperior);
        BarraGrisSuperior.setLayout(BarraGrisSuperiorLayout);
        BarraGrisSuperiorLayout.setHorizontalGroup(
            BarraGrisSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1790, Short.MAX_VALUE)
        );
        BarraGrisSuperiorLayout.setVerticalGroup(
            BarraGrisSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        BackGround.add(BarraGrisSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 1790, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {                                   
        Cerrar.setBackground(new Color(200,200,200));
    }                                  

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {                                    
        Cerrar.setBackground(Color.red);
    }                                   

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {                                    
        System.exit(0);
    }                                   

    private void WindowMinMaxMouseEntered(java.awt.event.MouseEvent evt) {                                          
        WindowMinMax.setBackground(new Color(35,178,212));
    }                                         

    private void WindowMinMaxMouseExited(java.awt.event.MouseEvent evt) {                                         
        WindowMinMax.setBackground(new Color(200,200,200));
    }                                        

    private void WindowMinMaxMouseClicked(java.awt.event.MouseEvent evt) {                                          
        //this.setBounds(320, 180, 1280, 720);
        //BackGround.setSize(1280, 720);        
        //Cerrar.setBounds(1230,0,46,35);
    }                                         

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {                                       
        this.setExtendedState(1);
    }                                      

    private void MinimizarMouseEntered(java.awt.event.MouseEvent evt) {                                       
        Minimizar.setBackground(new Color(35,178,212));
    }                                      

    private void MinimizarMouseExited(java.awt.event.MouseEvent evt) {                                      
        Minimizar.setBackground(new Color(200,200,200));
    }                                     

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {                                    
        Inicio.setBackground(new Color(15,53,126));
        Nuevo.setBackground(new Color(30,84,190));
        Abrir.setBackground(new Color(30,84,190));
        Primera prim = new Primera();
        Principal.ShowPanel(prim);
    }                                   

    private void NuevoMouseClicked(java.awt.event.MouseEvent evt) {                                   
        Inicio.setBackground(new Color(30,84,190));
        Nuevo.setBackground(new Color(15,53,126));
        Abrir.setBackground(new Color(30,84,190));
        Inventory inv = new Inventory();
        Inventario ventInv = new Inventario(inv);
        Principal.ShowPanel(ventInv);
    }                                  

    private void AbrirMouseClicked(java.awt.event.MouseEvent evt) {                                   
        Inicio.setBackground(new Color(30,84,190));
        Nuevo.setBackground(new Color(30,84,190));
        Abrir.setBackground(new Color(15,53,126));
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if(archivo!=null){
            //abrirBaseDeDatos(inventario)
        }
    }                                  

    private void InfoMouseEntered(java.awt.event.MouseEvent evt) {                                  
        Info.setBackground(new Color(35,178,212));
    }                                 

    private void InfoMouseExited(java.awt.event.MouseEvent evt) {                                 
        Info.setBackground(new Color(200,200,200));
    }                                

    private void InfoMouseClicked(java.awt.event.MouseEvent evt) {                                  
        JOptionPane.showMessageDialog(null, "Adamantium POS es una aplicación que busca facilitar la administración de pequeños negocios, proveyendo herramientas para hacer seguimiento de inventario, facturación y ventas.", "INFORMACION", 1);
    }                                 

    private void AyudaMouseClicked(java.awt.event.MouseEvent evt) {                                   
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI("https://www.youtube.com");
                    desktop.browse(uri);
                }catch(URISyntaxException | IOException ex){}
            }
        }
    }                                  

    private void CuentaMousePressed(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:}
        
    }                                   

    private void CuentaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(this,"Inicio de sesion: \nUsuario:  " + this.user + "\nEstado: "+ tipoUsuario.getText(),"LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }                                   

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    public void extender(){
    GraphicsEnvironment env =
    GraphicsEnvironment.getLocalGraphicsEnvironment();
    this.setMaximizedBounds(env.getMaximumWindowBounds());
    this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
}
    public static void ShowPanel(JPanel ventana){
       ventana.setSize(1777,997);
       ventana.setLocation(0,0);
       
       content.removeAll();
       content.add(ventana,BorderLayout.CENTER);
       content.revalidate();
       content.repaint();     
    }
    public static void Datos(String user, String password){
        Principal.user = user;
        Principal.contraseña = password;
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Abrir;
    private javax.swing.JLabel Adamantium;
    private javax.swing.JLabel Ayuda;
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel BarraAzulLateral;
    private javax.swing.JPanel BarraGrisSuperior;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Comentarios;
    private javax.swing.JLabel Cuenta;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Nuevo;
    private javax.swing.JLabel WindowMinMax;
    public static javax.swing.JPanel content;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoLateral;
    public static javax.swing.JLabel tipoUsuario;
    // End of variables declaration                   
}