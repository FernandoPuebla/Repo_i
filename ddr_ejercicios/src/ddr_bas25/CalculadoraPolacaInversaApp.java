package ddr_bas25;
import com.sun.org.apache.xerces.internal.util.SymbolTable;
import java.util.Scanner;

public class CalculadoraPolacaInversaApp
{
    static Scanner sc = new Scanner(System.in);
    private static int a = 0 ;
    private static int b = 0;
    private static int sum = 0;
    private static int resta = 0 ;
    private static int mult = 0;
    private static int div = 0;
    private static int pot = 0;
    private static int mod = 0;
    private static String signo = "";

    public static void main(String[] args) {
        System.out.print("Ingrese el n1: ");
        a = sc.nextInt();
        System.out.print("Ingrese el n2: ");
        b = sc.nextInt();
        System.out.println("Ingrese un signo: +,-,*,/,^,%");
        signo = sc.next();

        switch (signo)
        {
            case "+":
                sum = a+b;
                System.out.println("La suma es " + sum);
                break;
            case "-":
                resta = a-b;
                System.out.println("La resta es " + resta);
                break;
            case "*":
                mult = a*b;
                System.out.println("La multiplicación es " + mult);
                break;
            case "/":
                div = a/b;
                System.out.println("La división es " + div);
                break;
            case "%":
                mod= a%b;
                System.out.println("El módulo es " + mod);
                break;
            case "^":
                pot = (int)Math.pow(a,b);
                System.out.println("La potencia es " + pot);
                break;
        }


    }
}
