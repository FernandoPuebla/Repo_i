package com.company;

import java.util.Scanner;

public class Main {

   private static float a = 0, b = 0, resultado = 0;
   static Scanner sc =new Scanner(System.in);

    public static void suma()
    {
        resultado = a + b;
        System.out.println("El resultado es: " + (a + b));
    }
    public static void resta()
    {
        resultado = a - b;
        System.out.println("El resultado es: " + resultado);
    }
    public static void multiplicacion()
    {
        resultado = a * b;
        System.out.println("El resultado es: "+ resultado);
    }
    public static void division()
    {
        resultado = a / b;
        System.out.println("El resultado es: "+ resultado);
    }

    public static void main(String[] args)
    {
	    /* Aplicación de calculadora que muestre un menú con las opciones sumar, restar, multiplicar, dividir y salir.
            Cada opción será un método diferente:, suma, resta, multiplicacion, division,
        * */
        System.out.println("Ingrese el primer valor ");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo valor ");
        b = sc.nextInt();
	    suma();
	    resta();
	    multiplicacion();
	    division();


    }


}
