package ddr_bas30;

import java.util.Scanner;

public class MinuscMayusc
{
    static Scanner sc = new Scanner(System.in);
    private static String cadena;
    private static String deseo;
    public static void main(String[] args)
    {
        System.out.println("Ingrese una cadena a convertir");
        cadena = sc.nextLine();
        System.out.println("Si desea mayusc teclee may, si quiere minusc teclee min");
        deseo = sc.next();
        switch (deseo)
        {
            case "may":
                System.out.println(cadena.toUpperCase());
                break;
            case "min":
                System.out.println(cadena.toLowerCase());
                break;
        }
    }
}
