package ddr_obj4;

public class ElectApp extends Electrodomestico
{
    public static void main(String[] args)
    {
     Electrodomestico[] e = new Electrodomestico[10];

     e[0] = new Electrodomestico(200,60,'C',"verde");
     e[1] = new Lavadora(150,30,0);
     e[2] = new Television(500,80,'E',"negro",42,false);
     e[3] = new Electrodomestico();
     e[4] = new Electrodomestico(600,20,'D',"gris");
     e[5] = new Lavadora(300,40,'Z',"blanco", 40);
     e[6] = new Television(250,70,0,true);
     e[7] = new Lavadora(400,100,'A',"verde", 15);
     e[8] = new Television(200,60,'C', "naranja", 30 ,true);
     e[9] = new Electrodomestico(50,10);

     int sumaElectrodomesticos = 0;
     int sumaTelevisiones = 0;
     int sumaLavadoras = 0;
     for (int i = 0; i<e.length;i++)
     {
         if(e[i] instanceof Electrodomestico){
             sumaElectrodomesticos+=e[i].precioFinal();
         }
         if(e[i] instanceof Lavadora){
             sumaLavadoras+=e[i].precioFinal();
         }
         if(e[i] instanceof Television){
             sumaTelevisiones+=e[i].precioFinal();
         }
     }
        System.out.println("La suma del precio de los electrodomesticos es de "+ sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+ sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+ sumaTelevisiones);
     /*for (int i = 0; i < 10;i++)
     {
         Electrodomestico e1[i];

     }
        for (int i = 0; i < 10;i++)
        {

        }*/
    }
}
