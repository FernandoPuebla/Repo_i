import java.util.Scanner;

public class EjercicioString
{
    public static String[] words = new String[10];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Ingrese cadenas de caracteres");

        for(int i = 0; i < words.length;i++)
        {
            System.out.println("Cadena " + (i+1));
            words[i] = sc.next();
        }
        for(int i = 0; i < words.length;i++)
        {
            System.out.println("La cadena " + (i+1) + " es " + words[i]);
        }
    }


}
