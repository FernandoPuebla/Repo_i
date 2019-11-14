package ddr_bas38;

import java.util.Scanner;

public class ComparaNumeros
{
    static Scanner sc = new Scanner(System.in);
    private static int numero;
    private static int aux = 0;
    private static int aux1 = 1;
    private static int mayor;
    private static int menor;
    private static int sumaT;
    private static int sumaP;
    private static int sumaN;
    private static int mediaT;

    public static void main(String[] args)
    {
        while (numero != -1)
        {
            System.out.println("Ingrese un número, si desea salir teclee -1");
            numero = sc.nextInt();

            if (aux < numero)
            {
                aux = numero;
                //System.out.println("Mayor " + aux);
            }else
                {
                  //  System.out.println("Mayor " + aux);
                }
            //Checar la condición de menor
            if (aux1 > numero)
            {
                aux1 = numero;
               // System.out.println("Menor " + aux1);
            }else
            {
                //System.out.println("Menor " + aux1);
            }

            if (numero > 0)
            {
                sumaP += numero;
                sumaT += numero;
            }
            if (numero < 0 && numero != -1)
            {
                sumaN += numero;
                sumaT += numero;
            }

        }
        System.out.println("La suma total es: " + sumaT
                            + " La suma de positivos: " + sumaP + " La suma de negativos: " + sumaN
                            + " El mayor numero ingresado es: " + aux
                            + " El menor numero ingresado es: " + aux1);

    }
}
