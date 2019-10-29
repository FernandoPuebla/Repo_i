package com.company;

import javafx.scene.effect.Light;

import java.util.Scanner;

public class Main
{
//CORREGIR
    public static void main(String[] args)
    {
	/*Pide 2 números por teclado y calcula la potencia del primero elevado al segundo,
	pero sin utilizar multiplicación ni otros métodos.*/
        Scanner sc = new Scanner(System.in);
	    int n1 = 0, n2 = 0, res = 0, pot = 0,cant = 0;
        System.out.println("Ingrese un numero ");
        n1 = sc.nextInt();
        System.out.println("Ingrese su potencia ");
        n2 = sc.nextInt();

        System.out.println("El resultado de elevar " + n1 + " a la " + n2 + " es: ");
        cant = n1;
        pot = n2;
       //for (int i = 0; i < n2; i++)
        for(int i = 0; i < (cant-1);i++)
        {
                n1 += cant;
            //res += n1;
        }
        System.out.println(n1);
        for(int i = 0; i < (pot);i++)
        {
            res += n1;
            //res += n1;
        }
        System.out.println(res);
        /*while(i > 1)//for (int i = 0; i < n2; i++)
        {
            n2 = n1;
            res = n2 + n2;
            n1 = res;
            i--;
        }
        * */




    }
}
