package ddr_bas33;

import java.util.Scanner;

public class ExtraeLetras
{
    static Scanner sc = new Scanner(System.in);
    private static String cadena;

    public static void main(String[] args) {
        System.out.println("Este programa extrae letras. Ingrese letras");
        cadena = sc.next();
        System.out.println(cadena.substring(3,5));
    }

}
