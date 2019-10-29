import java.util.Scanner;

public class Calculadora
{
    Scanner teclado = new Scanner(System.in);
    public static void SUMA(int num1, int num2) {
        System.out.println("La suma es: " + (num1 + num2));
    }

    public static int RESTA(int num1, int num2) {
        return num1 - num2;
    }

    public static int MULTI() {
        int n1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce num1 ");
        n1 = teclado.nextInt();
        System.out.println("Introduce num2 ");
        num2 = teclado.nextInt();
        return n1 * num2;
    }

    public static void DIV() {
        int n1, num2, div;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce num1 ");
        n1 = teclado.nextInt();
        do {
            System.out.println("Introduce num2 distinto de 0 ");
            num2 = teclado.nextInt();
        } while (num2 == 0);
        div = n1 / num2;
        System.out.println("a div e: " + div);

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, num2, opcion, result;
        do {
            System.out.println("1-SUMAR ");
            System.out.println("2-RESTAR ");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR ");
            System.out.println("0-SALIR");
            System.out.println("Introduce opcion ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("Introduce num1 ");
                n1 = teclado.nextInt();
                System.out.println("Introduce num2 ");
                num2 = teclado.nextInt();
                SUMA(n1, num2);
            }

            if (opcion == 2) {
                System.out.println("Introduce num1 ");
                n1 = teclado.nextInt();
                System.out.println("Introduce num2 ");
                num2 = teclado.nextInt();
                System.out.println("A resta e; " + RESTA(n1, num2));
            }
            if (opcion == 3) {
                result = MULTI();
                System.out.println("El producto es; " + result);
            }
            if (opcion == 4) {
                DIV();
            }

        } while (opcion != 0);
    }
}
