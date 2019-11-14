package ddr_bas32;

import java.util.Scanner;

public class ComparaPalabras
{
    static Scanner sc = new Scanner(System.in);
    private static String cadena1;
    private static String cadena2;

    public static void main(String[] args)
    {
        System.out.println("Este programa compara si 2 cadenas son iguales");
        System.out.println("Ingrese cadena 1");
        cadena1 = sc.next();
        System.out.println("Ingrese cadena 2");
        cadena2 = sc.next();
            if(cadena1.equals(cadena2) == true)
            {
                System.out.println("Las cadenas son iguales");
            }
            else System.out.println("Las cadenas no son iguales");

    }
}
