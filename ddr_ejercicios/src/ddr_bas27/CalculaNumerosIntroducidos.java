package ddr_bas27;

import java.util.Scanner;

public class CalculaNumerosIntroducidos
{
    static Scanner sc = new Scanner(System.in);
    private static int n = 0;
    private static int cont = 0;
    public static void main(String[] args)
    {
        int i = 0;
        System.out.println("Este programa calcula la cantidad de números introducidos");
        while (i != -1)
        {
            System.out.print("Ingrese un numero ");
            n = sc.nextInt();
            cont++;
            System.out.print("Para salir ingrese -1: ");
            i = sc.nextInt();
        }
        System.out.println("Usted ingresó: " + cont + " numeros");


    }
}
