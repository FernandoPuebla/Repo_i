package ddr_bas5;

import java.util.Scanner;

public class DdrEjer5
{
    static Scanner sc = new Scanner(System.in);
    private static double area;
    private static double radio;
    //private static final double pi = 3.1416;

    public static void main(String[] args)
    {
        System.out.println("Este programa calcula el area de un circulo, Ingrese el radio");
        radio = sc.nextDouble();
        area = Math.PI * Math.pow(radio,2);
        System.out.println("El area es " + area);
    }
}
