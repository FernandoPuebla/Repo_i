package ddr_bas7;

import java.util.Scanner;

public class DdrEjer7
{
    private static Scanner sc = new Scanner(System.in);
    private static int numero;

    public static void main(String[] args)
    {
        System.out.println("Este programa obtiene el caracter ascii según su número, ingrese un numero");
        numero = sc.nextInt();
        char caractAscii =(char)numero;
        System.out.println(caractAscii);
    }
}
