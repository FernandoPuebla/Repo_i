package com.company;

import java.util.Scanner;
//REVISAR
public class Main {

    public static void main(String[] args)
    {
        int numero = 0, residuo = 0;
        char decision = ' ';
        Scanner sc = new Scanner(System.in);
        while (decision != 'n')
        {
            System.out.println("Este programa determina si el numero ingreso es primo y si deseas seguir ingresando más ");
            System.out.println("Ingrese un numero ");
            numero = sc.nextInt();

            for(int i = 2; i < numero; i++)
            {
                residuo = numero%2;
                if(residuo != 0)
                {
                    System.out.println("El numero es primo");
                }
            }

            System.out.println("Desea ingresar otro ?, presione y, para salir presione cualquier tecla");
            decision = sc.next().charAt(0);
        }



    }
}
