package ddr_mat3;

public class SumMat
{
    public static void main(String[] args)
    {
        int mat1[][] = new int[3][3];
        int mat2[][] = new int[3][3];
        int res[][] = new int[3][3];

        for (int i = 0; i < mat1.length;i++)
        {
            for (int j = 0; j < mat1[0].length;j++)
            {
                mat1[i][j] = (int) (Math.random()*6);
                mat2[i][j] = (int) (Math.random()*6);
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("Matriz 1");
        for (int i = 0; i < mat1.length;i++)
        {
            for (int j = 0; j < mat1[0].length;j++)
            {
                System.out.print(mat1[i][j] + " ");
            } System.out.println("");
        }

        System.out.println("Matriz 2");
        for (int i = 0; i < mat2.length;i++)
        {
            for (int j = 0; j < mat2[0].length;j++)
            {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Matriz de resultados");
        for (int i = 0; i < mat1.length;i++)
        {
            for (int j = 0; j < mat1[0].length;j++)
            {
                System.out.print(res[i][j] + " ");;
            }
            System.out.println("");
        }
    }
}
