package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Este programa realiza la serie de fibonacci hasta un numero pedido por teclado
	    int a = 0, b = 1,c = 0, numero = 0; //,b = 1,res = 0, ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        numero = sc.nextInt();

        /*while(numero != 0)
        {
            c = a + b;

            System.out.println("Los numeros son ");
            System.out.println(c + " ");

            a = b;
            b = c;
            numero--;
        }*/

	    for(int i = 0; i < numero; i++)
	    {
	        c = a + b;
            System.out.println("Los numeros son ");
            System.out.println(c + " ");
            a = b;
            b = c;
        }


    }
}
