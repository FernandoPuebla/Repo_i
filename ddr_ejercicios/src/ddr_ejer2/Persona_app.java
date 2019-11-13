package ddr_ejer2;

import java.util.Scanner;
import java.util.SortedSet;

public class Persona_app
{
    private static Scanner sc = new Scanner(System.in);
    private static String nombre;
    private static int edad;
    private static char sexo;
    private static double peso;
    private static double altura;

    public static void main(String[] args)
    {
        System.out.println("Ingrese el nombre ,edad, sexo ,peso y altura de la persona");
        System.out.print("Nombre : ");
        nombre = sc.next();
        System.out.print("edad : ");
        edad = sc.nextInt();
        System.out.print("sexo : ");
        sexo = sc.next().charAt(0);
        System.out.print("peso : ");
        peso = sc.nextDouble();
        System.out.println(" kg");
        System.out.print("altura : ");
        altura = sc.nextDouble();
        System.out.println(" cm");
       Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        System.out.println(persona1);
        persona1.calcularIMC();


    }



}
