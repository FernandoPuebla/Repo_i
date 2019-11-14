package ddr_bas19;

import java.util.Scanner;

public class DdrEjer19
{
    static Scanner sc = new Scanner(System.in);
    private static int num, n;
    private static int i;

    public static void main(String[] args)
    {
        System.out.println("Ingrese un numero para calcular sus cifras");
        num = sc.nextInt();
        n = num;

        while (num < 0)
                {
                    System.out.println("Ingrese un numero mayor entero positivo");
                    num = sc.nextInt();
                    n = num;
                }
                if(num == 0)
            {
                System.out.println("El numero 0 tiene 1 cifra" );
            }
            else
                {
                    while(num != 0)
                    {
                        num = num / 10;
                        i++;
                    }
                    if (i == 1)
                    {
                        System.out.println("El numero " + n + " tiene " + i + " cifra ");
                    }
                    else
                        System.out.println("El numero " + n + " tiene " + i + " cifras ");
                }
    }
}

