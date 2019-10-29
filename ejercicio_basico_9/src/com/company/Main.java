package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	/*Pedir número por teclado y preguntar si quiere poner más
	 *Mostrar la suma de los positivos y negativos, suma de los pares e impares,
	 *cantidad de positivos y negativos,cantidad de pares e impares y media de todos los números */
	    int num = 0, pares = 0, impares = 0, negativos = 0, positivos = 0, cImp = 0, cPar = 0, media = 0, resMedia = 0, cNum = 0;
	    int cPos = 0, cNeg = 0;
	    char decision = ' ';
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            //suma de numeros
            //signo
            if (num > 0)
            {
                positivos += num;

            }
            else
                {
                    negativos -= num;

                }
            //par o impar
            if (num%2 == 0)
            {
                pares += num;

            }
            else
            {
                impares -= num;

            }
            //cantidad de pares e impares
            if (num%2 == 0)
            {
                cPar += 1;
            }
            else
            {
                cImp += 1;
            }
            //cantidad de positivos o negativos
            if (num > 0)
            {
                cPos += 1;

            }
            else
            {
                cNeg += 1;

            }
            //media
            media += num;
            cNum += 1;

            System.out.println("Desea ingresar otro dato?");
            decision = sc.next().charAt(0);//.charAt(0);
        }while(decision == 's' || decision == 'S');
        resMedia = media/cNum;
        System.out.println("La suma de nums positivos es: " + positivos);
        System.out.println("La resta de nums negativos es: " + negativos);
        System.out.println("La suma de nums pares es: " + pares);
        System.out.println("La suma de nums impares es: " + impares);
        System.out.println("La cantidad de nums positivos es: " + cPos);
        System.out.println("La cantidad de nums negativos es: " + cNeg);
        System.out.println("La cantidad de nums pares es: " + cPar);
        System.out.println("La cantidad de nums impares es: " + cImp);
        System.out.println("La media es: " + resMedia);
    }
}
