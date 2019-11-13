package ddr_bas9;

import java.util.Scanner;

public class DdrEjer9
{
    static Scanner sc = new Scanner(System.in);
    private static final double IVA = 0.21;
    private static double precio;
    private static double precioFinal;
    public static void main(String[] args)
    {
        System.out.println("Este programa calcula el precio después de IVA de un producto, ingrese el precio del producto");
        precio = sc.nextDouble();

        precioFinal = precio + (precio*IVA);
        System.out.println("El precio final con IVA es de :" + precioFinal);
    }
}
