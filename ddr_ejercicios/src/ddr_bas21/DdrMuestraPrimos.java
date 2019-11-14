package ddr_bas21;
import java.util.Scanner;

public class DdrMuestraPrimos
{
    static Scanner sc = new Scanner(System.in);
    private static int vez;

    public static void main(String[] args)
    {
        System.out.println("Este programa muestra los 100 numeros primos entre 1 y 100");
        for(int i = 2; i <= 100; i++)
        {
            vez = 0;
            for (int j = 2; j<= 100; j++)
            {
                if(i % j == 0)// && vez <=1)
                {
                   vez++;
                    //System.out.println(i);
                }//System.out.println(i);
            }
            if(vez <=1)
                {
                    System.out.println(i);
                }
        }
    }
}
