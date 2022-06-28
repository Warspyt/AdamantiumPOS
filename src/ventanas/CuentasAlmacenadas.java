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
    private HashTable ht = new HashTable();
    public CuentasAlmacenadas(){
        ht.put("Ivan", "universidad123", "Empleado");
        ht.put("Profe", "soypro1234", "Administrador");
        ht.put("Adamantium", "equipo25", "Empleado");  
    }
    
    public boolean validar(String usuario, String contraseña){
        ListNode valid = ht.get(usuario);
        if(valid!=null && valid.contraseña.equals(contraseña)){
            return true;
        }
        return false;
    };
    public String privilegioUser(String usuario){
        ListNode priv = ht.get(usuario);
        return priv.privilegios;
    }
    }
class ListNode { 
         String usuario;
         String contraseña,privilegios;
         ListNode next;
}

class HashTable {

    private ListNode[] table; 
    private int count;

    public HashTable() {
       table = new ListNode[64];
    }

    public HashTable(int initialSize) {
       table = new ListNode[initialSize];
    }

    public void put(String usuario, String contraseña, String privilegios) {
       int bucket = hash(usuario);
       ListNode list = table[bucket];
       while (list != null) {
          if (list.usuario.equals(usuario))
             break;
          list = list.next;
       }
       if (list != null) {
          list.usuario = usuario;
       }
       else {
          if (count >= 0.75*table.length) {
             resize();
          }
          ListNode newNode = new ListNode();
          newNode.usuario = usuario;
          newNode.contraseña = contraseña;
          newNode.privilegios = privilegios;
          newNode.next = table[bucket];
          table[bucket] = newNode;
          count++;
       }
    }

    public ListNode get(String key) {
       int bucket = hash(key);
       ListNode list = table[bucket];
       while (list != null) {
          if (list.usuario.equals(key))
             return list;
          list = list.next;
       }
       return null;  
    }

    public void remove(String key) {
       int bucket = hash(key);
       if (table[bucket] == null) {
          return; 
       }
       if (table[bucket].usuario.equals(key)) {
          table[bucket] = table[bucket].next;
          count--;
          return;
       }
       ListNode prev = table[bucket];
       ListNode curr = prev.next;
       while (curr != null && ! curr.usuario.equals(key)) {
          curr = curr.next;
          prev = curr;
       }
       if (curr != null) {
          prev.next = curr.next;
          count--;
       }
    }

    public boolean containsKey(String key) {
       int bucket = hash(key);
       ListNode list = table[bucket];
       while (list != null) {
          if (list.usuario.equals(key))
             return true;
          list = list.next;
       }
       return false;
    }

    public int size() {
       return count;
    }

    private int hash(String usuario) {
       return (Math.abs(usuario.hashCode())) % table.length;
    }

    private void resize() {
       ListNode[] newtable = new ListNode[table.length*2];
       for (int i = 0; i < table.length; i++) {
          ListNode list = table[i];
          while (list != null) {
             ListNode next = list.next;
             int hash = (Math.abs(list.usuario.hashCode())) % newtable.length;
             list.next = newtable[hash];
             newtable[hash] = list;
             list = next;
          }
       }
       table = newtable;
 }
}
