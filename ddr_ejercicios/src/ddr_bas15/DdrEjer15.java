package ddr_bas15;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class DdrEjer15
{
    private static int num;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Este programa calcula si un numero es mayor o igual que cero, ingrese un numero");
        num = sc.nextInt();
        if (num < 0)
        {
            do
            {
                System.out.println("Ingrese un numero mayor que cero");
                num = sc.nextInt();
            }while(num < 0);
        }else System.out.println("El numero es mayor o igual a cero");



    }
}
