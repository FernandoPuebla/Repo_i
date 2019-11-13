package ddr_bas2;

public class ddr_bas2
{
    private static double a = 1;
    private static double b = 2;

    public static void main(String[] args)
    {
        if (a > b)
        {
            System.out.println("El mayor es " + a);
        }
        else if (a < b)
        {
            System.out.println("El mayor es " + b);
        }
        else System.out.println("Son iguales");
    }
}
