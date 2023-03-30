public class Main {
    public static void main(String[] args)
    {
        //1.- Empleando arreglos, mostrar n productos con sus respectivos precios.

        String productos[] = {"Pelota", "Laptop","Mouse", "Tv pantalla","Mochila", "Polo","Audifono"};
        Double precio[] = {89.99, 3500.99, 35.99, 2500.69, 129.99, 45.99, 38.99};

        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i]+" = s/."+precio[i]);
        }
    }
}