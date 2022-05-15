import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        Inventory L = new Inventory();
        L.pushBack(1,"pantalon",31000,15000,18,18);
        L.pushBack(2,"camisa",21000,11000,18,18);
        L.pushBack(3,"pijama",40000,20000,18,18);
        L.pushBack(4,"medias",33000,15000,18,18);
        L.pushBack(5,"gorra",50000,35000,18,18);
        L.erase(4);

        L.find(1).setCantidad(-2);
        L.find(5).setCantidad(-2);

        L.imprimir_inventario();

        Fact_database F = new Fact_database();

        F.pushBack(1,"pepe","13/05",2,3,L);
        F.pushBack(2,"marco","13/05",2,2,L);
        F.pushBack(3,"antonio","13/05",2,4,L);
        F.pushBack(4,"hermeregildancio","13/05",3,4,L);
        F.erase(1,L);
        F.pushB_and_print(5,"pepe","13/05",5,3,L);

        L.imprimir_inventario();
        L.imprimir_pedido();
        F.imprimir_fact(2,L);
        F.imprimir_fact(3,L);
        F.imprimir_fact(4,L);
        F.imprimir_fact(5,L);

        F.finanzas(L);


    }
}
