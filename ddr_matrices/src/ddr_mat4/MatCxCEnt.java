package ddr_mat4;

import java.util.Scanner;

public class MatCxCEnt
{
   private static int mat[][] = new int[4][4];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.print("Seleccione lo que desee hacer\n" +
                "1- Rellena toda la tabla manualmente,2- suma de una fila que desees, 3- suma de una columna que desee,\n" +
                "4- suma la diagonal principal, 5- suma la diagonal inversa, 6 - la media de todos los valores de la matriz\n" +
                "Opcion ");
        opcion = sc.nextInt();
        /*while(opcion!=1)
        {
            System.out.println("Debes rellenar la matriz");
            opcion = sc.nextInt();
        }
        System.out.println("Rellene la tabla por favor");
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat.length; j++)
            {
                System.out.print("Valor [" + (i+1) + "][" + (j+1) + "] ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz ");
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat.length; j++)
        {
            System.out.print(mat[i][j] + " ");
        } System.out.println( " ");
        }
*/
        switch (opcion)
        {
            case 1:
                generarMatriz();
                break;
            case 2:
                generarMatriz();
                sumarFila();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }
    public static void generarMatriz()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rellene la tabla por favor");
        for(int i = 0; i < mat.length; i++)
        {
        for(int j = 0; j < mat.length; j++)
            {
            System.out.print("Valor [" + (i+1) + "][" + (j+1) + "] ");
            mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz ");
    for(int i = 0; i < mat.length; i++)
        {
        for(int j = 0; j < mat.length; j++)
            {
            System.out.print(mat[i][j] + " ");
            } System.out.println( " ");
        }
    }

    public static void sumarFila()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclee la fila que desee sumar ");
        int fila = sc.nextInt();
        int sum = 0;
        for (int i = fila; i < fila; i++)
        {
            sum += mat[0][i];System.out.println("El resultado es " + sum);
        }
        System.out.println("El resultado es " + sum);
    }
{

}

}
