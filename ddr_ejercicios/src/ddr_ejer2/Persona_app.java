package ddr_ejer2;

import java.util.Scanner;
import java.util.SortedSet;

public class Persona_app
{
    public static Scanner sc = new Scanner(System.in);

        private static String nombre;
        private static int edad;
        private static char sexo;
        private static double peso;
        private static double altura;

    public static void main(String[] args)
    {
        System.out.println("Ingrese el nombre ,edad, sexo ,peso y altura de la persona");
        System.out.println("Nombre : ");
        nombre = sc.next();
        System.out.println("edad : ");
        edad = sc.nextInt();
        System.out.println("sexo : ");
        sexo = sc.next().charAt(0);
        System.out.println("peso : ");
        peso = sc.nextDouble();
        System.out.println("altura : ");
        peso = sc.nextDouble();
       // Persona persona1 = new Persona;
    }



}
