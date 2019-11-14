package ddr_bas34;

import java.util.Scanner;

public class SeparaPalabras
{
    static Scanner sc = new Scanner(System.in);
    private static String cadena;
    private static String aux;

    public static void main(String[] args)
    {
        System.out.println("Este programa separa las palabras de una frase, ingrese una frase");
        cadena = sc.next();
        for (int i = 0; i < cadena.length(); i++)
        {
            System.out.print((int)cadena.charAt(i)+" ");
        }

    }

}