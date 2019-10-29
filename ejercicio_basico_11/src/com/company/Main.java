package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        // Pide por teclado el nombre, la edad y salario y muestra el salario
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        double salario = 0;
        String nombre;

        System.out.println("Ingrese el nombre del usuario");
        nombre = sc.next();
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        System.out.println("Ingrese el salario");
        salario = sc.nextInt();

        if (edad < 16)
        {
            System.out.println(nombre + "No tiene edad para trabajar");
        }
        if (edad > 19 && edad < 50)
        {
            salario = salario * 1.05;
            System.out.println("El salario de " + nombre + " es de " + salario);
        }
        if (edad > 51 && edad < 60)
        {
            salario = salario * 1.10;
            System.out.println("El salario de " + nombre + " es de " + salario);
        }
        if (edad > 60)
        {
            salario = salario * 1.15;
            System.out.println("El salario de " + nombre + " es de " + salario);
        }
    }
}
