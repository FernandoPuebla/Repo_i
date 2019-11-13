package ddr_bas13;

import java.util.Scanner;

public class DdrEjer13
{
    private static int numVentas;
    private static int ventas;
    private static int sum;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Este programa calcula la suma de un numero de ventas ingresado, ingrese cuantas ventas se harán");
        numVentas = sc.nextInt();
        for(int i = 0;i < numVentas;i++)
        {
            System.out.print("Ingrese el valor de la venta " + (i+1) + ": ");
            ventas = sc.nextInt();
            sum += ventas;
        }
        System.out.println("La suma de todas las ventas es " + sum);
    }
}
