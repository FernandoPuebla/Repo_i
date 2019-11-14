package ddr_bas28;

import java.util.Scanner;

public class EliminaEspacios
{
    static Scanner sc = new Scanner(System.in);
    private static String cadena;
    public static void main(String[] args)
    {
        System.out.println("Este programa elimina los espacios de la cadena que introduce. Introduzca la cadena");
        cadena = sc.nextLine();
        System.out.println("Su cadena con espacios es: " + cadena);

        System.out.println("Su cadena sin espacios es: " +  cadena.trim());
    }
}
