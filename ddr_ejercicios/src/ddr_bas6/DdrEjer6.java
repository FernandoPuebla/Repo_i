package ddr_bas6;

import java.util.Scanner;

public class DdrEjer6
{
    static Scanner sc = new Scanner(System.in);
    private static int numero;

    public static void main(String[] args)
    {
        System.out.println("Ingresa un numero para ver si es divisible entre 2");
           numero = sc.nextInt();
           if (numero%2 == 0)
           {
               System.out.println("El numero " + numero + " es divisible entre 2");
           }
           else System.out.println("No es divisible entre 2");
    }
}
