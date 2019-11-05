import java.util.Scanner;

public class EjercicioMatriz
{
    public static int[][] matriz = new int[2][3];
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Ingrese elementos a la matriz" );//+ matriz.length);

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)  // matriz[0].length es para ponerme en las columnas, 3, cuando vale 0 la fila accedemos a la cantidad de elementos de la fila cero y así sucesivamente para cada valor de la columna
            {
                //System.out.println( matriz[0].length);
                System.out.println("Ingrese el elemento " + (i+1) + " " + (j+1) + " a la matriz");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)  // matriz[0].length es para ponerme en las columnas, 3, cuando vale 0 la fila accedemos a la cantidad de elementos de la fila cero y así sucesivamente para cada valor de la columna
            {
                System.out.println("El elemento" + (i+1) + " " + (j+1) + " es " + matriz[i][j]);
            }
        }
    }
}
