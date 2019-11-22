package ddr_mat10;

import java.util.Scanner;

public class Encuesta
{
    private final static int DEF1 = 1;
    private final static int DEF2 = 2;
    private static int sexo;
    private static int trabajo;
    private static double sueldo;
    private static double porcH;
    private static double porcM;
    private static double porcHT;
    private static double porcMT;
    private static double suelHT;
    private static double suelMT;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        for(int i = 0; i < 10;i++)
        {
            Datos();
        SumarSexo();
        SumarTrabajo();
        System.out.println(sueldo);
        SueldoPromedio();
        }
    }

    private static void Datos()
    {
            System.out.println("Por favor marque su sexo, 1 para H, 2 para M");
            sexo = (int) (Math.random() *2+1);
            System.out.println("Por favor marque 1 si trabaja, 2 si no trabaja");
            trabajo = (int) (Math.random() *2+1);
            System.out.println("Por favor ingrese su sueldo, debe estar entre 600 y 2000, redondearlo hacia arriba");
            sueldo = Math.floor(Math.random()*(600-2000+1)+2000);

    }
    private static void SumarSexo()
    {
        int tH = 0,tM = 0,total = 0;
        if (sexo == 1)
        {
            tH++;
            total++;
        }

        else if (sexo == 2)
        {
            tM ++;
            total++;
        }
        porcH = tH/total;
        porcM = tM/total;
        System.out.println("Hay " + porcH + " hombres");
        System.out.println("Hay " + porcM + " mujeres");
    }
    private static void SumarTrabajo()
    {
        int tH = 0,tM = 0,total = 0;
        if (sexo == 1 && trabajo == 1)
        {
            tH++;
            total++;
        }

        else if (sexo == 2 && trabajo == 1)
        {
            tM++;
            total++;
        }
        porcHT = tH/total;
        porcMT = tM/total;
        System.out.println("Hay " + porcHT + " hombres trabajadores");
        System.out.println("Hay " + porcMT + " mujeres trabajadoras");
    }
    private static void SueldoPromedio()
    {
        int tH = 0,tM = 0,sH = 0,sM = 0;
        if (sexo == 1)
        {
            sH += sueldo;
            tH++;
        }

        else if (sexo == 2)
        {
            sM += sueldo;
            tM++;
        }
        suelHT = sH/tH;
        suelMT = sM/tM;
        System.out.println("El sueldo promedio de hombres es " + suelHT);
        System.out.println("El sueldo promedio de mujeres es  " + suelMT);
    }


}
