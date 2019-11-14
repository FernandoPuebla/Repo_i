package ddr_bas22;

import java.util.Scanner;

public class ContarVocales
{
    static Scanner sc = new Scanner(System.in);
    private static String cadena = "La lluvia de Sevilla es una maravilla";

    public static void main(String[] args)
    {
        int contador=0;
        for (int i=0;i<cadena.length();i++){
            //Comprobamos si el caracter es una vocal
            if(cadena.charAt(i)=='a' ||
                    cadena.charAt(i)=='e' ||
                    cadena.charAt(i)=='i' ||
                    cadena.charAt(i)=='o' ||
                    cadena.charAt(i)=='u'){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" vocales");
    }
}
