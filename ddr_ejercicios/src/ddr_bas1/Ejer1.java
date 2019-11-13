package ddr_bas1;

public class Ejer1
{
    private static double a = 1;
    private static double b = 2;
    private static double suma;
    private static double resta;
    private static double multiplicacion;
    private static double division;
    private static double modulo;

    public static void main(String[] args)
    {
        suma = a + b;
        resta = a - b;
        multiplicacion = a + b;
        division = a + b;
        modulo = a % b;
        System.out.println("Las operaciones son");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multipliacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);
    }

}
