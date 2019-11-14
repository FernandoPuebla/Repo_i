package ddr_bas16;
import java.util.Scanner;

public class DdrEjer16
{
    private static int intentos = 0;
    private static String contrasenia = "contra";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int i;

        System.out.println("Ingrese la contrasenia ");
        contrasenia = sc.next();
        while(!contrasenia.equals("contra"))
        {
            System.out.println("Ingrese una contrasenia valida");
            contrasenia = sc.next();
            intentos++;
            //System.out.println("int" + intentos);
            if(intentos == 4)
            break;
        }
        System.out.println("Enhorabuena");
        /*do
        {
            System.out.println("Ingrese una contrasenia valida");
                contrasenia = sc.next();
                intentos++;
        }while(intentos == 3 || !contrasenia.equals("contra") );*/

    }
}
