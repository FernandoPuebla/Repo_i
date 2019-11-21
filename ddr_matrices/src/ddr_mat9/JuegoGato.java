package ddr_mat9;

import java.util.Scanner;

public class JuegoGato
{
    private static char gato[][] = new char[3][3];
    private static char cruz = 'X', circ = 'O', def = '-';

    public static void main(String[] args) {
        crearTablero();
        marcar();
        contarFilas();
        contarCols();
        marcar();
        contarFilas();
        contarCols();
        marcar();
        contarFilas();
        contarCols();
    }



    public static void crearTablero()
    {
        for (int i = 0; i < 3;i++)
        {
            for (int j = 0; j < 3;j++)
            {
                gato[i][j] = def;
                System.out.print(gato[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void marcar()
    {
        int fil = 0, col = 0;
        char marca;
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione donde desea colocar X");
        System.out.print("Fila ");
        fil = sc.nextInt();
        System.out.print("Columna ");
        col = sc.nextInt();
        gato[fil][col] = 'X';
        for (int i = 0; i < 3;i++)
        {
            for (int j = 0; j < 3;j++)
            {
                System.out.print(gato[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void contarFilas()
    {
        int cont = 0;
        for (int i = 0; i < gato.length;i++)
        {
            for (int j = 0; j < gato[0].length;j++)
            {
                if(gato[i][j] == 'X')
                {
                    cont++;
                }
            }if(cont == 3)
                {
            System.out.println("Ganaste " + cont);
            break;
                }
            else cont = 0;
        }System.out.println("Hay " + cont +" Xs");
    }
    public static void contarCols()
    {
        int cont = 0;
        for (int i = 0; i < gato.length;i++)
        {
            for (int j = 0; j < gato[0].length;j++)
            {
                if(gato[j][i] == 'X')
                {
                    cont++;
                }
            }if(cont == 3)
        {
            System.out.println("Ganaste " + cont);
            break;
        }
        else cont = 0;
        }System.out.println("Hay " + cont +" Xs");
    }

}


