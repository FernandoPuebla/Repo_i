package ddr_mat4;

import java.util.Scanner;

public class MatCxCEnt {
    private static int mat[][] = new int[4][4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.print("Seleccione lo que desee hacer\n" +
                "1- Rellena toda la tabla manualmente, 2- suma de una fila que desees, 3- suma de una columna que desee,\n" +
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
        switch (opcion) {
            case 1:
                generarMatriz();
                break;
            case 2:
                generarMatriz();
                sumarFila();
                break;
            case 3:
                generarMatriz();
                sumarCol();
                break;
            case 4:
                generarMatriz();
                sumarDiagPri();
                break;
            case 5:
                generarMatriz();
                sumarDiagInv();
                break;
            case 6:
                generarMatriz();
                mediaTotal();
                break;
        }
    }

    public static void generarMatriz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rellene la tabla por favor");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print("Valor [" + (i + 1) + "][" + (j + 1) + "] ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz ingresada");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void sumarFila() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclee la fila que desee sumar ");
        int fila = (sc.nextInt() - 1);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += mat[fila][i];
        }
        System.out.println("El resultado de la suma de la fila " + (fila + 1) + " es " + sum);
    }

    public static void sumarCol() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclee la fila que desee sumar ");
        int col = (sc.nextInt() - 1);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += mat[i][col];
        }
        System.out.println("El resultado de la suma de la columna" + (col + 1) + " es " + sum);
    }

    public static void sumarDiagPri() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += mat[i][i];
        }
        System.out.println("El resultado de la suma de la diagonal principal es " + sum);
    }

    public static void sumarDiagInv() {
        int sum = 0;
        int j = 3;
        for (int i = 0; i < 4; i++) {
            sum += mat[i][j];
            j--;
        }
        System.out.println("El resultado de la suma de la diagonal inversa es " + sum);
    }

    public static void mediaTotal() {
        double suma = 0, cont = 0, res = 0;
        for(int i = 0;i < mat.length;i++)
        {
            for (int j = 0; j < mat[0].length; j++)
            {
                suma += mat[i][j];
                cont++;
            }
        }
        res = suma/cont;
        System.out.println("La media de todos los valores es "+ res);
    }

}
