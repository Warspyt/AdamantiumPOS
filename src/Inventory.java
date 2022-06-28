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
    
    public Inventory(){
        root=null;
    }
    
    public boolean isEmpty(){
        if(root==null){
            return true;
        }
        return false;
    }

    public void clearAll(){
        root=null;
    }

    private int getHeight(Objeto objeto){
        return objeto == null? -1: objeto.getAltura();
    }

    private void updateHeight(Objeto objeto){
        objeto.setAltura(1 + getMaxHeight(getHeight(objeto.getLeftChild()),getHeight(objeto.getRightChild())));
    }

    private int getBalance(Objeto objeto){
        return(objeto==null)?0 : getHeight(objeto.getRightChild()) - getHeight(objeto.getLeftChild());
    }

    private int getMaxHeight(int leftHeight,int rightHeight){
        return leftHeight > rightHeight? leftHeight:rightHeight;
    }

    public Objeto leftChildRotation(Objeto objeto){
        Objeto rightChild=objeto.getRightChild();
        objeto.setRightChild(rightChild.getLeftChild());
        rightChild.setLeftChild(objeto);
        updateHeight(objeto);
        updateHeight(rightChild);
        return rightChild;
    }

    public Objeto rightChildRotation(Objeto objeto){
        Objeto leftChild=objeto.getLeftChild();
        objeto.setLeftChild(leftChild.getRightChild());
        leftChild.setRightChild(objeto);
        updateHeight(objeto);
        updateHeight(leftChild);
        return leftChild;
    }
    public Objeto rebalance(Objeto objeto){

        int balance = getBalance(objeto);

        if (balance< -1) {
            if (getBalance(objeto.getLeftChild()) <= 0) {    
                objeto = rightChildRotation(objeto);
            } else {                                
                objeto.setLeftChild(leftChildRotation(objeto.getLeftChild()));
                objeto = rightChildRotation(objeto);
            }
        }
        if (balance > 1) {
            if (getBalance(objeto.getRightChild()) >= 0) {  
              objeto = leftChildRotation(objeto);
            } else {
                objeto.setRightChild(rightChildRotation(objeto.getRightChild()));
              objeto = leftChildRotation(objeto);
            }
          }

        return objeto;
    }


    public void Insertar(String tipo, int id, int precDistribuidor, int precVenta, int cant){
        root = insertElement(tipo, id, precDistribuidor, precVenta, cant, root);
    }

    private Objeto insertElement(String tipo, int id, int precDistribuidor, int precVenta, int cant, Objeto objeto){
        if(objeto==null){
            return new Objeto(id,tipo,precDistribuidor,precVenta,cant);
        }

        if(objeto.getId() > id){
            objeto.setLeftChild(insertElement(tipo,id,precDistribuidor,precVenta,cant,objeto.getLeftChild()));
        }
        else if(objeto.getId() < id){
            objeto.setRightChild(insertElement(tipo, id, precDistribuidor, precVenta, cant, objeto.getRightChild()));
        }
        else{
            JOptionPane.showMessageDialog(null, "ID duplicado, inserte nuevo ID");
        }
        updateHeight(objeto);
        return rebalance(objeto);
    }

    public void Eliminar(int ref){
        root = delete(root, ref);
    }

    private Objeto delete(Objeto objeto, int id){
        if(objeto == null){
            return null;
        }
        else{
            if(objeto.getId() > id){
                objeto.setLeftChild(delete(objeto.getLeftChild(),id));
            }
            else if(objeto.getId() < id){
                objeto.setRightChild(delete(objeto.getRightChild(),id));
            }
            else if(objeto.getLeftChild()==null || objeto.getRightChild()==null){
                objeto=(objeto.getLeftChild()==null)? objeto.getRightChild():objeto.getLeftChild();
            }
            else{
                Objeto maxLeftChild =maxLeftChild(objeto.getRightChild());
                objeto.setId(maxLeftChild.getId());
                objeto.setRightChild(delete(objeto.getRightChild(),objeto.getId()));
            }
        }
        if(objeto!=null){
            objeto=rebalance(objeto);
        }
        updateHeight(objeto);
        return objeto;
    }

    private Objeto maxLeftChild(Objeto objeto){
        Objeto current = objeto;
        while(current.getLeftChild()!=null){
            current = current.getLeftChild();
        }
        return current;
    }

    public void ModificarPrecioDistribuidor(int ref, int precioNuevo){
        search(ref).setPrecio_distribuidor(precioNuevo);
    }
    public void ModificarPrecioVenta(int ref, int precioNuevo){
        search(ref).setPrecio_venta(precioNuevo);
    }
    public void ModificarCantidad(int ref, int nuevaCantidad){
        search(ref).setCantidad(nuevaCantidad);
    }

    public Objeto search(int ref){
        Objeto searched = root;
        boolean check = false;
        while(searched != null && check!=true){
            if(searched.getId() < ref){
                searched = searched.getRightChild();
            }
            else if(searched.getId() > ref){
                searched = searched.getLeftChild();
            }
            else{
                break;
            }
        }
        return searched;
    }


    public void ImprimirInventario(){
        MarcoTabla tabla= new MarcoTabla();
        print(root,tabla);
        JFrame mimarco= tabla;
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
   
    }

    private void print(Objeto printed, MarcoTabla tabla){
        if(printed == null){
            return;
        }
        print(printed.getRightChild(),tabla);
        Object[] newRow = {printed.getNombre(),printed.getId(),printed.getPrecio_distribuidor(), printed.getPrecio_venta(),printed.getCantidad()};
        tabla.addRow(newRow);
        print(printed.getLeftChild(), tabla);
    }
}

class MarcoTabla extends JFrame{
    DefaultTableModel model;
    JTable tabla;
    
    public MarcoTabla(){
        setTitle("INVENTARIO");
        setBounds(300,300,600,200);
        model = new DefaultTableModel(datosFilas,columNames);
        tabla=new JTable(model);
        add(new JScrollPane(tabla),BorderLayout.CENTER);
    }
    public void addRow(Object[] row){
        model.insertRow(0,row);
    }

    private final String[] columNames = {"Nombre","Referencia","Precio Distribuidor", "Precio Venta","Cantidad"};
    private Object [][] datosFilas;
}