package ddr_bas20;

import java.util.Scanner;

public class DdrEjerPrimos
{
    static Scanner sc = new Scanner(System.in);
    private static int num;
    private static int vez = 0;
    public static void main(String[] args)
    {
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        System.out.println("inicia en: " + vez + " repeticiones");

        for(int i = 2; i <= num; i++)
        {
            if (num % i == 0)
            {
                vez += 1;
            }
        }
        System.out.println("repetidas: "+ vez);
        if (vez <= 1)
        {
            System.out.println("El numero es primo");
        }
        else
        {
            System.out.println("no primo");
        }
    }
}
