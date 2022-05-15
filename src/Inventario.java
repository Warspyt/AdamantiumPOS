public class Inventario {
    private int position;
    private int size;
    private static final int standar_size = 1000;
    private Producto[] arr;


    public Inventario(int elm){
        arr = new Producto[elm];
        size = 0;
        position = 0;
    }

    //Constructor con tamaño por defecto
    public Inventario(){
        this(standar_size);
    }

    //Vaciar lista
    public void clear(){
        size = 0;
        position = 0;
    }

    //Lista llena
    public boolean full(){
        return size>=arr.length;
    }

    //Lista vacia
    public boolean empty(){
        return size<=0;
    }

    //Comprobar si un producto ya está en la lista
    public boolean search(Producto item){
        for (position = 0; position<size; position++){
            if(arr[position]==item || arr[position].getId()==item.getId()){
                return true;
            }
        }
        return false;
    }

    //Comprobar si un producto ya está en la lista, usando el id
    public boolean search_id(int id){
        for (position = 0; position<size; position++){
            if(arr[position].getId()==id){
                return true;
            }
        }
        return false;
    }

    //Insertar al frente de la lista
    public boolean insertfront(Producto item){
        boolean inserted = false;
        if(!full()){
            if(!search(item)){
                for(int j=size-1; j>=0; j--){
                    arr[j+1] = arr[j];
                }
                arr[0] = item;
                size++;
                inserted = true;
            }
        }
        if(full()){
            Producto[] temp_arr = new Producto[size*2];
            for (int i = 0; i < size; i++) {
                temp_arr[i] = arr[i];
            }
            arr = temp_arr;
        }
        return inserted;
    }

    //Insertar al final de la lista
    public boolean insertback(Producto item){
        boolean inserted = false;
        if(!full()){
            if(!search(item)){
                for(int j=size; j>position; j--){
                    arr[j] = arr[j-1];
                }
                arr[position] = item;
                size++;
                inserted = true;
            }
        }
        if(full()){
            Producto[] temp_arr = new Producto[size*2];
            for (int i = 0; i < size; i++) {
                temp_arr[i] = arr[i];
            }
            arr = temp_arr;
        }
        return inserted;
    }

    //Eliminar un producto de la lista usando su id
    public boolean delete(int id){
        boolean deleted = false;
        if(!empty()){
            if(search_id(id)){
                for(int j=position; j<size-1; j++){
                    arr[j] = arr[j+1];
                }
                size--;
                deleted = true;
            }
        }
        else{
            System.out.println("Vacía");
        }
        return deleted;
    }

    //Tamaño de la lista
    public int getSize(){
        return this.size;
    }

    //Acceder al producto en una posición específica de la lista
    public Producto get(int idx){
        if(idx<size && idx>=0){
            return arr[idx];
        }
        else{
            System.out.println("Posición fuera de la lista");
            return null;
        }
    }

    //Poner en una posición específica de la lista, un producto
    public void set(int idx, Producto elm){
        if(idx<size && idx>=0){
            arr[idx] = elm;
        }
        else{
            System.out.println("Posición fuera de la lista");
        }
    }

    //Acceder a un producto, buscándolo por id
    public Producto read(int item_id){
        for (position = 0; position<size; position++){
            if(arr[position].getId()==item_id){
                return arr[position];
            }
        }
        return null;
    }

    //Muestra que hay en la lista (solo muestra si hay productos)
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Muestra la información de todos los productos en la lista
    public void display_inf(){
        for (int i = 0; i < size; i++) {
            arr[i].display();
        }
    }

    //Imprime el inventario como tabla
    public void print_inv(){
        final String[][] table = new String[size+1][];

        table[0] = new String[]{"ID", "Nombre ", "Precio distribuidor", "Precio venta", "Cantidad"};

        for (int i = 1; i < size+1; i++) {
            table[i] = new String[]
                    {String.valueOf(arr[i-1].getId()),
                    arr[i-1].getNombre(),
                    String.valueOf(arr[i-1].getPrecio_distribuidor()),
                    String.valueOf(arr[i-1].getPrecio_venta()),
                    String.valueOf(arr[i-1].getCantidad())};
        }

        for (final String[] row : table) {
            System.out.format("%15s%30s%30s%30s%30s%n", row);
        }
    }

    //Métodos de modificación
    public void update_nombre(int id, String name){
        Producto modificado = read(id);
        if(modificado!=null){
            modificado.setNombre(name);
        }
        else{
            System.out.println("No se encontró el producto");
        }
    }

    public void update_precio_dis(int id, int pr_d){
        Producto modificado = read(id);
        if(modificado!=null){
            modificado.setPrecio_distribuidor(pr_d);
        }
        else{
            System.out.println("No se encontró el producto");
        }
    }

    public void update_precio_vent(int id, int pr_v){
        Producto modificado = read(id);
        if(modificado!=null){
            modificado.setPrecio_venta(pr_v);
        }
        else{
            System.out.println("No se encontró el producto");
        }
    }

    public void update_cant(int id, int cant){
        Producto modificado = read(id);
        if(modificado!=null){
            modificado.setCantidad(cant);
        }
        else{
            System.out.println("No se encontró el producto");
        }
    }
}
