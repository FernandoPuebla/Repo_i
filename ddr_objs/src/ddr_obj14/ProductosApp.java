package ddr_obj14;

public class ProductosApp
{
    public static void main(String[] args) {

        double precioTotal;

        Productos[] productos = new Productos[3];
//Creo los elementos
        productos[0] = new Productos("producto 1", 10);
        productos[1] = new Perecedero("producto 2", 1, 20);
        productos[2] = new NoPerecedero("producto 3", 5, 1);

        //Calculo el precio
        double total=0;
        for(int i=0;i<productos.length;i++){
            total += productos[i].calcular(5); //Polimorfismo
        }

        //Muestro el total
        System.out.println("el total es "+total);

    }
}
