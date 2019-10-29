package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	    int pares = 0, impares = 0, numero = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa calcula la suma de numeros pares e impares hasta un numero pedido");
        System.out.println("Ingrese el limite");

        numero = sc.nextInt();

        for(int i = 0;i <= numero; i++)
        {
            if(i%2 == 0)
            {
                pares = pares + i;
            }
        }
        for(int i = 1;i <= numero; i++)
        {
            if(i%2 != 0)
            {
                impares = impares + i;
            }

        }
        System.out.println("La suma de los pares es " + pares);
        System.out.println("La suma de los impares es " + impares);

    }
}
