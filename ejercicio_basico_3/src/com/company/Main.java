package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	int numero = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa determina si el numero es par o impar y si es negativo o positivo");
        System.out.println("Ingrese un numero");
        numero = sc.nextInt();
        if(numero > 0)
        {
            System.out.println("Positivo");

        }else
            System.out.println("Negativo");
        if(numero%2 == 0)
            {
                System.out.println("Par");
            }
        else
            System.out.println("Impar");
    }
}
