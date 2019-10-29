import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial
{

    public static void main(String[] args)
    {
        int factorial = 1;
        int numero = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero del que desea calcular el factorial");
        numero = sc.nextInt();
    for(int i = factorial; i <= numero;i++)
        {
        factorial = factorial*i;
        }
        System.out.println("El factorial es " + factorial);
    }
}
