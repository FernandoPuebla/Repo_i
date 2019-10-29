package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	//Este codigo pide 5 números, los suma y muestra en orden inverso(Arrays)
        int numero = 0;
        int[] arreglo = new int[5];
        int[] arregloInvertido = new int[5];


        System.out.println("Ingrese 5 números ");
        for(int i = 0; i < 5;i++)
        {
            System.out.println("Numero " + (i+1));
            arreglo[i] = sc.nextInt();
            numero = numero + arreglo[i];

        }
        System.out.println("La suma de los numeros es " + numero);

        System.out.println("Los numeros son: ");
        for (int i = 4; i >= 0;i--)
        {
            System.out.println(arreglo[i]);
        }
    }
}
