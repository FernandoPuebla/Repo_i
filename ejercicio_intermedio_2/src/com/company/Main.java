package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	/* Pide números por teclado hasta un máximo pedido por teclado.
	Se piden y se guardan en un array los números hasta que se responda que no o llegue al máximo.
	Por último se imprimen en orden y se pide un número para buscar. si está se imprime la posición de dicho número en el array.
	* */
        Scanner sc = new Scanner(System.in);
        int max = 0, num = 0;
        char decision = ' ';

        System.out.println("Ingresa la cantidad máxima de números que deseas");

        max = sc.nextInt();
        int[] array = new int[max];

        for (int i = 0; i< max; i++)
        {
            System.out.println("*Ingresa los números que deseas*");
            array[i] = sc.nextInt();
            System.out.println("- Para salir teclee N o n -");
            decision = sc.next().charAt(0);
            if(decision == 'N' || decision == 'n')
                break;
           // else continue;
        }
       // System.out.println("Hola");
        for (int i = 0; i < max; i++)
        {
            System.out.println("Los numeros son " + array[i]);
        }
        System.out.println("Desea buscar un numero?");
        decision = sc.next().charAt(0);
        if (decision == 's' || decision == 'S')
        {
            System.out.println("Teclee el numero que  desee buscar");
            num = sc.nextInt();
            for(int i = 0; i < max; i++)
            {
                if(num == array[i])
                {
                    System.out.println("El numero " + num + " está en la posición " + (i + 1));
                }
                else System.out.println("El numero " + num + " no se encuentra en la lista" );
            }
        }
        else System.out.println("Hasta pronto!");



/*        do
            {
                System.out.println("Ingresa la cantidad máxima de números que deseas");
                max = sc.nextInt();
                for (int i = 0; i < max;i++)
                {
                    System.out.println("Ingresa los números que deseas");
                    array[i] = sc.nextInt();
                }

            decision = sc.next().charAt(0);
            }while (decision != 'N' || decision != 'n' );
*/

    }
}
