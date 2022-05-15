import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        Inventory L = new Inventory();
        L.pushBack("2fjk2","pantalon",31000,15000,18,18);
        L.pushBack("2asfq","camisa",21000,11000,18,18);
        L.pushBack("1245f2","pijama",40000,20000,18,18);
        L.erase("1245f2");
        L.pushBack("f1231","medias",33000,15000,18,18);
        L.pushBack("345yu","gorra",50000,35000,18,18);

        Fact_database F = new Fact_database();

        F.pushBack("f1","pepe","13/05","2fjk2",3,L);
        F.pushBack("f2","marco","13/05","2asfq",2,L);
        F.pushBack("f3","marco","13/05","2asfq",4,L);
        F.erase("f2",L);
        F.pushB_and_print("f1","pepe","13/05","345yu",3,L);

        L.imprimir_pedido();

        F.finanzas(L);

        // *** Falta hacer depuracion porque las funciones erase arrojan null pointer exeption en algunos casos, se hacen muchos
        // llamados incesesarios en algunos metodos y el metodo finanzas aun no funciona
    }
}

