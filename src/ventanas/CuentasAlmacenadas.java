/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

/**
 *
 * @author espin
 */
public class CuentasAlmacenadas {
    private TreeAVL tree;
    
    public CuentasAlmacenadas(){
        tree = new TreeAVL();
        tree.Insertar("Ivan","universidad123","Empleado");
        tree.Insertar("Profe", "soypro1234", "Administrador");
        tree.Insertar("Adamantium", "equipo25", "Empleado");
    }
    public boolean validar(String usuario,String contraseña){
        User valid = tree.search(usuario);
        if(valid != null && valid.getContraseña().equals(contraseña)){
            return true;
        }
        return false;
    }
    public String privilegioUser(String usuario){
        User priv = tree.search(usuario);
        return priv.getPrivilegios();
    }
}
class User{
    private int altura;
    private String usuario,contraseña,privilegios;
    private User left,right;
    
    public User(String usuario, String contraseña, String privilegios){
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.privilegios = privilegios;
        left = right = null;
        this.altura = 0;
    }
    public int getAltura(){
        return this.altura;
    }
    public User getLeftChild(){
        return this.left;
    }
    public User getRightChild(){
        return this.right;
    }
    public String getUsuario(){
        return this.usuario;
    }
    public String getContraseña(){
        return this.contraseña;
    }
    public String getPrivilegios(){
        return this.privilegios;
    }
    public void setUsuario(String newData){
        this.usuario = newData;
    }
    public void setContraseña(String newData){
        this.contraseña = newData;
    }
    public void setPrivilegios(String newData){
        this.privilegios = newData;
    }
    public void setLeftChild(User left){
        this.left = left; 
    }
    public void setRightChild(User right){
        this.right = right;
    }
    public void setAltura(int newAltura){
        this.altura = newAltura;
    }
}

class TreeAVL{
    private User root;
    
    public TreeAVL(){
        this.root = null;
    }
    
    private boolean isEmpty(){
        if(this.root==null){
            return true;
        }
        return false;
    }
    private int getHeight(User node){
        return node == null? -1: node.getAltura();
    }
    private void updateHeight(User node){
        node.setAltura((1 + getMaxHeight(getHeight(node.getLeftChild()),getHeight(node.getRightChild()))));
    }
    private int getBalance(User node){
        return(node==null)?0 : getHeight(node.getRightChild()) - getHeight(node.getLeftChild());
    }
    private int getMaxHeight(int leftHeight,int rightHeight){
        return leftHeight > rightHeight? leftHeight:rightHeight;
    }
    public User leftChildRotation(User objeto){
        User rightChild=objeto.getRightChild();
        objeto.setRightChild(rightChild.getLeftChild());
        rightChild.setLeftChild(objeto);
        updateHeight(objeto);
        updateHeight(rightChild);
        return rightChild;
    }
    public User rightChildRotation(User objeto){
        User leftChild=objeto.getLeftChild();
        objeto.setLeftChild(leftChild.getRightChild());
        leftChild.setRightChild(objeto);
        updateHeight(objeto);
        updateHeight(leftChild);
        return leftChild;
    }
    public User rebalance(User objeto){
        
        updateHeight(objeto);
        int balance = getBalance(objeto);
        if(balance > 1){
            if(getHeight(objeto.getRightChild().getRightChild()) > getHeight(objeto.getRightChild().getLeftChild())){
                objeto = leftChildRotation(objeto);
            }
            else{
                objeto.setRightChild(rightChildRotation(objeto.getRightChild()));
                objeto = leftChildRotation(objeto);
            }
        }
        else if(balance < -1){
            if(getHeight(objeto.getLeftChild().getLeftChild()) > getHeight(objeto.getLeftChild().getRightChild())){
                objeto = rightChildRotation(objeto);
            }
            else{
                objeto.setLeftChild(leftChildRotation(objeto.getLeftChild()));
                objeto = rightChildRotation(objeto);
            }
        }
        return objeto;
    }
    public void Insertar(String usuario, String contraseña, String privilegios){
        root = insertElement(usuario,contraseña,privilegios,root);
    }
    private User insertElement(String usuario, String contraseña, String privilegios, User objeto){
        
        if(objeto==null){
            return new User(usuario,contraseña,privilegios);
        }
        else{
            int compare = (objeto.getUsuario()).compareTo(usuario);
            if(compare > 0){  //objetoData > data
                objeto.setLeftChild(insertElement(usuario,contraseña, privilegios,objeto.getLeftChild()));
            }
            else if(compare < 0){ //objetoData < data
                objeto.setRightChild(insertElement(usuario,contraseña, privilegios,objeto.getRightChild()));
            }
            return rebalance(objeto);
        }
    }
    public void Eliminar(String data){
        root = Delete(root,data);
    }
    private User Delete(User objeto,String data){
        if(objeto == null){
            return null;
        }
        else{
            int compare = (objeto.getUsuario()).compareTo(data);
            
            if(compare > 1){
                objeto.setLeftChild(Delete(objeto.getLeftChild(),data));
            }
            else if(compare < 1){
                objeto.setRightChild(Delete(objeto.getRightChild(),data));
            }
            else if(objeto.getLeftChild()==null || objeto.getRightChild()==null){
                objeto=(objeto.getLeftChild()==null)? objeto.getRightChild():objeto.getLeftChild();
            }
            else{
                User maxLeftChild =maxLeftChild(objeto.getRightChild());
                objeto.setUsuario(maxLeftChild.getUsuario());
                objeto.setRightChild(Delete(objeto.getRightChild(),objeto.getUsuario()));
            }
        }
        if(objeto!=null){
            objeto=rebalance(objeto);
        }
        updateHeight(objeto);
        return objeto;
    }
    private User maxLeftChild(User objeto){
        User current = objeto;
        while(current.getLeftChild()!=null){
            current = current.getLeftChild();
        }
        return current;
    }
    public User search(String ref){
        User searched = root;
        while(searched != null){
            int compare = searched.getUsuario().compareTo(ref);
            
            if(compare == 0){
                break;
            }
            else{
                if(compare < 0){
                    searched = searched.getRightChild();
                }
                else if(compare > 0){
                    searched = searched.getLeftChild();
                }
            }  
        }
        return searched;
    }
}
