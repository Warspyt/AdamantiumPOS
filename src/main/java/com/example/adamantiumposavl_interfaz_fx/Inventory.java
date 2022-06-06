package com.example.adamantiumposavl_interfaz_fx;

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
        objeto.setAltura(1 + Math.max(getHeight(objeto.getLeftChild()),getHeight(objeto.getRightChild())));
    }

    public int getBalance(Objeto objeto){
        return(objeto==null)?0 : getHeight(objeto.getRightChild()) - getHeight(objeto.getLeftChild());
    }

    public Objeto rightRotation(Objeto objeto){
        Objeto leftChild=objeto.getLeftChild();
        Objeto z=leftChild.getRightChild();
        leftChild.setRightChild(objeto);
        objeto.setLeftChild(z);
        updateHeight(objeto);
        updateHeight(leftChild);
        return leftChild;
    }
    public Objeto LeftRotation(Objeto objeto){
        Objeto rightChild=objeto.getRightChild();
        Objeto z=rightChild.getLeftChild();
        rightChild.setLeftChild(objeto);
        objeto.setRightChild(z);
        updateHeight(objeto);
        updateHeight(rightChild);
        return rightChild;
    }

    public Objeto rebalance(Objeto objeto){
        updateHeight(objeto);
        int balance = getBalance(objeto);
        if(balance > 1){
            if(getHeight(objeto.getRightChild().getRightChild()) > getHeight(objeto.getRightChild().getLeftChild())){
                objeto = LeftRotation(objeto);
            }
            else{
                objeto.setRightChild(rightRotation(objeto.getRightChild()));
                objeto=LeftRotation(objeto);
            }
        }
        else if(balance < -1){
            if(getHeight(objeto.getLeftChild().getLeftChild()) > getHeight(objeto.getLeftChild().getRightChild())){
                objeto = rightRotation(objeto);
            }
            else{
                objeto.setLeftChild(LeftRotation(objeto.getLeftChild()));
                objeto=rightRotation(objeto);
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
        else if(objeto.getId() > id){
            objeto.setLeftChild(insertElement(tipo, id, precDistribuidor, precVenta, cant, objeto.getLeftChild()));
        }
        else if(objeto.getId() < id){
            objeto.setRightChild(insertElement(tipo, id, precDistribuidor, precVenta, cant, objeto.getRightChild()));
        }
        else{
            System.out.println("ID duplicado, inserte nuevo ID");
        }
        return rebalance(objeto);
    }

    public void Eliminar(int ref){
        root = delete(root, ref);
    }

    private Objeto delete(Objeto objeto, int id){
        if(objeto == null){
            return objeto;
        }
        else if(objeto.getId() > id){
            objeto.setLeftChild(delete(objeto.getLeftChild(),id));
        }
        else if(objeto.getId() < id){
            objeto.setRightChild(delete(objeto.getRightChild(),id));
        }
        else{
            if(objeto.getLeftChild()==null || objeto.getRightChild()==null){
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
        while(searched != null){
            if(searched.getId() == ref){
                break;
            }
            searched = searched.getId() < ref? searched.getRightChild():searched.getLeftChild();
        }
        return searched;
    }

}

