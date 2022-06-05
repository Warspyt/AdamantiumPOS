import java.io.*;

public class Serialize_Obj <T> {

    private static final String filepath="data\\saved_tree";

    public void WriteObjectToFile(T Obj) {
        try {
            if(Obj.getClass()==BstInventario.class){
                FileOutputStream fileOut = new FileOutputStream(filepath + "_bst");
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                objectOut.writeObject(Obj);
                objectOut.close();
                System.out.println("El estado del arbol (BST) ha sido guardado");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public T ReadObjectFromFile_BST() throws IOException, ClassNotFoundException{
        FileInputStream fileIn = new FileInputStream(filepath + "_bst");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        T tree = (T) objectIn.readObject();
        objectIn.close();
        return tree;
    }
}
