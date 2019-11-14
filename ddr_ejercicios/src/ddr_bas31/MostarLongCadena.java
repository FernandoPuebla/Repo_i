package ddr_bas31;

import java.util.Scanner;

public class MostarLongCadena
{
    static Scanner sc = new Scanner(System.in);
    private static String cadena;

    public static void main(String[] args)
    {
        System.out.println("Ingrese una cadena para determinar su largo");
        cadena = sc.next();
        System.out.println("El largo es de " + cadena.length());
    }

}
