package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	int n1 = 0, n2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa determina entre 2 numeros el mayor, el menor o si son iguales");

        System.out.println("Ingrese el numero 1");
        n1 = sc.nextInt();
        System.out.println("Ingrese el numero 2");
        n2 = sc.nextInt();

        if (n1 == n2)
        {
            System.out.println("Ambos son iguales");
        }
        else if( n1 > n2)
        {
            System.out.println("El mayor es "+ n1 +" y el menor es " + n2);
        }
        else
            {
                System.out.println("El mayor es "+ n2 +" y el menor es " + n1);
            }

    }
}
