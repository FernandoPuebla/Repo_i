package ddr_bas8;

import java.util.Scanner;

public class DdrEjer8
{
    private static char car;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Este programa devuelve el codigo dado el ascii, ingrese un caracter");
        car = sc.next().charAt(0);
        int numero = (int) car;
        System.out.println(numero);
    }
}
