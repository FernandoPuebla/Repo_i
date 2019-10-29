package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	int a = 0,b = 0, suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula la suma de 2 numeros");
        System.out.println("Ingrese numero 1");
        a = sc.nextInt();
        System.out.println("Ingrese numero 2");
        b = sc.nextInt();
        suma = a + b;
        System.out.println("La suma es " + suma);
    }
}
