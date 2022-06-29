package ventanas;

/**
 *
 * @author espin
 */
import java.io.*;
import javax.swing.JOptionPane;

public class Serialize <Inventory> {
    
    private static final long serialVersionUID = 6529685098267757690L;
    
    public void WriteObjectToFile(Inventory Obj) {
        try{
            FileOutputStream fileOut = new FileOutputStream(JOptionPane.showInputDialog("Inserte el nombre con el que se guardará el Inventario")+".inv");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(Obj);
            objectOut.close();
            JOptionPane.showMessageDialog(null,"El estado del arbol (AVL) ha sido guardado");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public Inventory ReadObjectFromFile_AVL(String path) throws IOException, ClassNotFoundException{
        FileInputStream fileIn = new FileInputStream(path);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        Inventory tree = (Inventory) objectIn.readObject();
        objectIn.close();
        return tree;
    }
}