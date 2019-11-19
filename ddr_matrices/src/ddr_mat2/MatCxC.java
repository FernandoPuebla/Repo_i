package ddr_mat2;

import java.util.Scanner;

public class MatCxC
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.print("Ingrese un valor para las columnas ");

        x = sc.nextInt();

        int mat[][] = new int[5][x];

        for(int i = 0; i < mat.length;i++)
        {
            for(int j = 0; j < mat[0].length;j++)
            {
                //System.out.print("Ingresa un numero entre 1 y 9: ");
                mat[i][j] = generaNumAleatorio(0,9);//sc.nextInt();
                System.out.print(mat[i][j] + " ");
            }System.out.println(" ");
        }

    }
    public static int generaNumAleatorio(int minimo,int maximo){

        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

    }

}
