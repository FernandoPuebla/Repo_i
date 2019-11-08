package ejerciciospracticos;

import java.util.Scanner;

public class FiguraConObjetos
{
    static Scanner sc = new Scanner(System.in);

    public FiguraConObjetos()
    {

    }

    public void areacuadrado(int ladoC)
    {
        System.out.println("Para calcular el area del cuadrado ingrese un valor para el lado");
        int area = 0;
        ladoC = sc.nextInt();
        area = ladoC * ladoC;
        System.out.println("El area del cuadrado es: " + area);
    }
    public void arearect(int ladoT, int ladoR)
    {
        System.out.println("Ingrese un valor para el largo");
        int area = 0;
        ladoT = sc.nextInt();
        System.out.println("Ingrese un valor para el ancho");
        ladoR = sc.nextInt();
        area = ladoR * ladoT;
        System.out.println("El area del rectángulo es: " + area);
    }
    public void areatrian(int ladoT, int ladoR)
    {
        System.out.println("Ingrese un valor para el largo");
        int area = 0;
        ladoT = sc.nextInt();
        System.out.println("Ingrese un valor para el ancho");
        ladoR = sc.nextInt();
        area = (ladoR * ladoT) / 2;
        System.out.println("El area del triángulo es: " + area);
    }
}
