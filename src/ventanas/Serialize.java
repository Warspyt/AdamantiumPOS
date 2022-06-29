package ventanas;

/**
 *
 * @author espin
 */
import java.io.*;
import javax.swing.JOptionPane;

public class Serialize <T> {
    
    public void WriteObjectToFile(T Obj) {
        try{
            FileOutputStream fileOut = new FileOutputStream("data\\" + JOptionPane.showInputDialog("Inserte el nombre con el que se guardará el Inventario"));
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(Obj);
            objectOut.close();
            JOptionPane.showMessageDialog(null,"El estado del arbol (AVL) ha sido guardado");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public T ReadObjectFromFile_AVL(String path) throws IOException, ClassNotFoundException{
        FileInputStream fileIn = new FileInputStream(path);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        T tree = (T) objectIn.readObject();
        objectIn.close();
        return tree;
    }
}