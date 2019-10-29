package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// Pide 5 números por teclado, súmalos y guárdalos en un array, luego imprime la suma y los números en orden inverso
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Ingrese el numero " + (i+1) + " ");
            array[i] = sc.nextInt();
            suma += array[i];
        }
        System.out.println("La suma de los numeros es " + suma + " Los numeros son");
        for (int i = array.length-1; i >= 0; i--)
        {
            System.out.println(array[i]);
        }
    }
}
