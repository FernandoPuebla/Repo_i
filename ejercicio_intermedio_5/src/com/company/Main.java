package com.company;

import java.util.Scanner;
// CORREGIR
public class Main
{

    public static void main(String[] args)
    {
	   //Pide un numero por teclado y calcula si es primo o no
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.println("Teclea un numero ");
        numero = sc.nextInt();
        for(int i = 2; i < numero; i++)
        {
            System.out.println(i);
            if(numero%i == 0)
            {
                System.out.println("No es primo");
                break;
            }
            else
            {
                System.out.println("Es primo");
                break;
            }

        }

    }
}
