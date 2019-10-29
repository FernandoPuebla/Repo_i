public class EjemploArrays
{
    public static void main(String[] args)
    {
     int[] array = new int[10];
     array[3] = 5;
     int[][] matrix = new int[5][3];
     matrix[2][2] = 4;

     for (int i = 0; i < 10; i++)
     {
         System.out.println("La posicion" + i + " contiene "+  array[i]);
     }

        for (int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.println("La posicion" + i + " " + j + " contiene "+  matrix[i][j]);
            }

        }

    }
}
