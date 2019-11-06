package Application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Ingresa un número");
        int value = sc.nextInt();
        while (value != 5)
        {
            System.out.println("Ingrese un número diferente");
            value = sc.nextInt();
        }
        System.out.println("Obtuviste un 5");
         */
        //Se puede suplantas lo comentado por un do... while

        int value = 0;
        do {
            System.out.println("Ingrese un número diferente");
            value = sc.nextInt();
            } while (value != 5);
        System.out.println("Obtuviste un 5");
    }
}
