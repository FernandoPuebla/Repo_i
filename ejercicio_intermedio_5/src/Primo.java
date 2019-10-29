import java.util.Scanner;

public class Primo
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int num, div;
        boolean primo = true;
        System.out.println("numero?");
        num = teclado.nextInt();
        for (div = 2; div < num; div++) {
            if (num % div == 0)
                primo = false;
            System.out.println(primo);
        }
        if (primo)
            System.out.println("numero " + num + " primo");
        else
            System.out.println("numero " + num + " no es primo");

    }
}
