package ejerciciospracticos;

import java.util.Scanner;

public class Figura
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        cuadrado();
        rectangulo();
        triangulo();
    }

    public static void cuadrado()
    {
        int lado = 0,area = 0;
        System.out.print("Para calcular el área del cuadrado ingrese un valor para el lado ");
        lado = sc.nextInt();
        area = lado*lado;
        System.out.println("El area del cuadrado es " + area);
    }
    public static void rectangulo()
    {
        int ancho = 0, alto = 0,area = 0;
        System.out.print("Para calcular el área del cuadrado ingrese un valor para el ancho " + "\nAncho: ");
        ancho = sc.nextInt();
        System.out.print("Alto: ");
        alto = sc.nextInt();
        area = ancho*alto;
        System.out.println("El area del cuadrado es " + area);
    }
    public static void triangulo()
    {
        int ancho = 0, alto = 0,area = 0;
        System.out.print("Para calcular el área del cuadrado ingrese un valor para el ancho " + "\nAncho: ");
        ancho = sc.nextInt();
        System.out.print("Alto: ");
        alto = sc.nextInt();
        area = (ancho*alto) / 2;
        System.out.println("El area del cuadrado es " + area);
    }
}
