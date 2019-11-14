package ddr_bas18;

import java.util.Scanner;

public class DdrEjer18
{
    static Scanner sc = new Scanner(System.in);
    private static int a;
    private static int b;
    private static int ran;

    public static void main(String[] args)
    {
        System.out.println("Ingresa 2 numeros, el programa generará 10 numeros aleatorios entre estos");
        System.out.println("Primer numero");
        a = sc.nextInt();
        System.out.println("Segundo numero");
        b = sc.nextInt();
        for (int i=0;i<10;i++)
        {
            //Generamos un numero aleatorio
            ran = (int)Math.floor(Math.random()*(a-b) + b);  //Revisar
            System.out.println(ran);
        }
    }
}

