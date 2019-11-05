import java.util.Scanner;

public class EjercicioArray
{
   // private static int value = 7;
    private static int[] values = new int[4]; //Declaración de Array
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Ingrese datos para el array ");
        for (int i = 0; i < values.length; i++)
        {
            System.out.println("Ingrese el dato " + (i+1));
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < values.length; i++)
        {
            System.out.println("El dato " + (i+1) + " es " + values[i]);
        }
//        System.out.println("values" + values[0]);
    }


}
