public class IndicesMatriz
{
   public static int[][] numeros = new int[2][3];
   /*
    numeros[0][0] = 100;
    numeros[0][1] = 200;
    numeros[0][2] = 300;

    numeros[1][0] = 400;
    numeros[1][1] = 500;
    numeros[1][2] = 600;
*/
    public static void main(String[] args)
    {
        numeros[0][0] = 100;
        numeros[0][1] = 200;
        numeros[0][2] = 300;

        numeros[1][0] = 400;
        numeros[1][1] = 500;
        numeros[1][2] = 600;

        for (int f = 0; f < numeros.length; f++)
        {

            for (int c = 0; c < numeros[f].length; c++)
            {
                System.out.print(numeros[f][c] + " ");
            }
            System.out.println();
        }
    }
}


