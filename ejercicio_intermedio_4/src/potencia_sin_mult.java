import java.util.Scanner;

public class potencia_sin_mult
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int num2, num1, prod;
        int i, j, auxprod;

        System.out.println("numero1?");
        num1 = teclado.nextInt();
        System.out.println("numero2?");
        num2 = teclado.nextInt();
        prod = num1;

        for (i = 1; i < num2; i++)
        {
            auxprod = prod;
            for (j = 1; j < num1; j++)
            {
                prod += auxprod;
            }
        }
        System.out.println("potencia" + prod);
    }

}
