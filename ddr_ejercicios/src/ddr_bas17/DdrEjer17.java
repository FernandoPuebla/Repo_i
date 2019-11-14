package ddr_bas17;

import java.util.Scanner;

public class DdrEjer17
{
    static Scanner sc = new Scanner(System.in);
    private static String dia;
    public static void main(String[] args)
    {
        System.out.println("Este programa determina si un dia es laboral o no. Ingrese un día");
        dia = sc.next();
    switch (dia)
    {
        /*case "lunes":
            System.out.println("Hay que trabajar");
            break;
        case "martes":
            System.out.println("Hay que trabajar");
            break;
        case "miércoles":
            System.out.println("Hay que trabajar");
            break;
        case "jueves":
            System.out.println("Hay que trabajar");
            break;
        case "viernes":
            System.out.println("Hay que trabajar");
            break;
        case "sábado":
            System.out.println("No voy a trabajar");
            break;
        case "domingo":
            System.out.println("No voy a trabajar");
            break;*/
        case "lunes":
        case "martes":
        case "miercoles":
        case "jueves":
        case "viernes":
            System.out.println("Es un dia laboral");
            break;
        case "sabado":
        case "domingo":
            System.out.println("Es un dia festivo");
        default:
            System.out.println("Introduce un dia de la semana");


    }

    }
}
