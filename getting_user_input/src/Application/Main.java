package Application;

import java.util.Scanner;

public class Main
{
    //Se pone estático porque los métodos estáticos necesitan de variables estáticas
    // Se crea un objeto sc de tipo Scanner
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Ingrese una línea de texto: ");
        String line = sc.nextLine();
        System.out.println("Ingresaste: " + line);

    }
}
