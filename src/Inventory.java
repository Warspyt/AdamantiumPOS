import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import java.awt.*;


/**
 *
 * @author espin
 */
public class Inventory {
    Objeto head;
    
    public Inventory(){
        head=null;
    }
    
    public boolean estaVacia(){
        if(head==null){
            return true;
        }
        return false;
    }
    public void Insertar(String tipo, int id, int precDistribuidor, int precVenta, int cant){
        Objeto nodito = new Objeto(id, tipo, precDistribuidor, precVenta, cant);
        if(estaVacia()==true){
            head=nodito;
        }
        else{
            nodito.setNext(head);
            head.setPrev(nodito);
        }
        head=nodito;
    }
    public void Eliminar(int ref){
        if(estaVacia()==true){
            System.out.println("Lista vacía. IMPOSIBLE ELIMINAR");
        }
        else if((head.getId() == ref) && head.getNext()==null){
            head=null;
        }
        else{
            boolean headId=false;
            if((head.getId() == ref)){
                head=head.getNext();
                headId=true;
            }
            Objeto deleted=head;
            
            while((deleted.getId()== (ref)) == false){
                if(deleted.getNext()==null){
                    break;
                }
                deleted = deleted.getNext();
            }
            if(deleted.getId()== (ref)){
                if(deleted.getNext()==null){
                    deleted.getPrev().setNext(null);
                }
                else{
                    deleted.getNext().setPrev(deleted.getPrev());
                    deleted.getPrev().setNext(deleted.getNext());
                    deleted=null;
                }
            } 
            else if((deleted.getId()== (ref)) == false && headId == false){
                System.out.println("No se ha encontrado la referencia");
            }
        }
    }
    public void ModificarPrecioDistribuidor(int ref, int precioNuevo){
        if(estaVacia()==true){
            System.out.println("Lista vacía");
        }
        else{
            Objeto modyfier=head;
            while((modyfier.getId() == ref) ==false){
                if(modyfier.getNext()==null){
                   break; 
                }
                modyfier = modyfier.getNext();
            }
            if((modyfier.getId() == ref)){
                modyfier.setPrecio_distribuidor(precioNuevo);
            }
            else{
                System.out.println("No se ha encontrado la referencia");
            }
        }
    }
    public void ModificarPrecioVenta(int ref, int precioNuevo){
        if(estaVacia()==true){
            System.out.println("Lista vacía");
        }
        else{
            Objeto modyfier=head;
            while((modyfier.getId() == ref) ==false){
                if(modyfier.getNext()==null){
                   break; 
                }
                modyfier = modyfier.getNext();
            }
            if((modyfier.getId() == ref)){
                modyfier.setPrecio_venta(precioNuevo);
            }
            else{
                System.out.println("No se ha encontrado la referencia");
            }
        }
    }
    public void ModificarCantidad(int ref, int nuevaCantidad){
        if(estaVacia()==true){
            System.out.println("Lista vacía");
        }
        else{
            Objeto modyfier=head;
            while((modyfier.getId() == ref) ==false){
                if(modyfier.getNext()==null){
                    break;
                }
                modyfier = modyfier.getNext();
            }
            if((modyfier.getId() == ref)){
                modyfier.setCantidad(nuevaCantidad);
            }
            else{
                System.out.println("No se ha encontrado la referencia");
            }
        }
    }
    public Objeto Search(int ref){
        Objeto searched = head;
        while((searched.getId()== ref) ==false){
            if(searched.getNext() == null){
                break;
            }
            searched = searched.getNext();
        }
        if((searched.getId()== ref)){
            return searched;
        }
        else{
            System.out.println("No se ha encontrado la referencia");
            return null;
        }
    }
    public void ImprimirInventario(){
        MarcoTabla tabla= new MarcoTabla();
        Objeto printed=head;
        while(printed != null){
            Object[] newRow = {printed.getNombre(),printed.getId(),printed.getPrecio_distribuidor(), printed.getPrecio_venta(),printed.getCantidad()};
            tabla.addRow(newRow);
            printed = printed.getNext();
        }
        JFrame mimarco= tabla;
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
            
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