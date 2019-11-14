package ddr_bas14;

import java.util.Scanner;

public class DdrEjer14
{
    static Scanner sc = new Scanner(System.in);
     private static double a;
     private static double b;
     private static double c;
     private static double disc;
     private static double raizP;
     private static double raizN;

    public static void main(String[] args) {
        System.out.println("Este programa una ecuación cuadrática");
        System.out.println("Ingresa el coeficiente a");

        a = sc.nextDouble();
        System.out.println("Ingresa el coeficiente b");
        b = sc.nextDouble();
        System.out.println("Ingresa el coeficiente c");
        c = sc.nextDouble();
        disc =  (Math.pow(b,2) - (4*a*c));
        System.out.println(disc);

        if (disc == Math.pow(b,2))
        {
            System.out.println("No es una ecuación cuadrática");
        }
        else
        {
            raizP = (-b + Math.sqrt(disc))/(2*a);
            raizN = (-b - Math.sqrt(disc))/(2*a);
            System.out.println("La raiz positiva es: " + raizP);
            System.out.println("La raiz negativa es: " + raizN);
        }

    }
}
