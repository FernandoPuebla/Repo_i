package ddr_mat6;

public class MatTxTAleaNoRep
{
    public static void main(String[] args) {
        matNoRep();

    }

    public static void matNoRep()
    {
        int mat[][] = new int [3][3];
        int n = 0;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                mat[i][j] = (int) Math.floor(Math.random()*6);
                System.out.print(mat[i][j] + " ");

            }System.out.println(" ");
        }

    }
}
