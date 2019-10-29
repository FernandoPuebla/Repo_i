package com.company;

import java.util.Scanner;

public class Main
{
//CORREGIR
    public static void main(String[] args)
    {
	/*Pide por teclado un intervalo entre 2 numeros.
	* Luego imprime por pantalla el intervalo diciendo cuáles son primos y cuales no*/
        Scanner sc = new Scanner(System.in);
	    int n1 = 0, n2 = 0;

        System.out.println("Ingrese desde donde empieza");
        n1 = sc.nextInt();
        System.out.println("Ingrese donde termina");
        n2 = sc.nextInt();
        System.out.println("Son primos ");
        for(int i = n1 ; i < n2; i++)
        {
            for (int j = 2; j < n2; j++)
            {
                if (i%j != 0)
                {
                    System.out.print(i + " ");
                }
                break;
            }

        }


    }
}
