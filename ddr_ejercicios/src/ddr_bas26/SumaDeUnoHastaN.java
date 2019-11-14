package ddr_bas26;

import java.util.Scanner;

public class SumaDeUnoHastaN
{
    static Scanner sc = new Scanner(System.in);
    private static int tope = 0, num = 0;

    public static void main(String[] args) {
        System.out.println("Este programa suma los numeros desde el 1 hasta donde desee. " +
                "Ingrese hasta qué número desea sumar");
        tope = sc.nextInt();
        while (tope == 1)
        {
            System.out.println("Ingrese un numero mayor que 1");
            tope = sc.nextInt();
        }
        for (int i = 1; i<= tope;i++)
        {
            num += i;
        }
        System.out.println("El resultado es: " + num);
    }
}
