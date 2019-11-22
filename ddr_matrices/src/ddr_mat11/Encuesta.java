package ddr_mat11;

import java.util.Scanner;

public class Encuesta {
    private static Scanner sc = new Scanner(System.in);
    private static final int DEF1 = 1, DEF2 = 2;
    private static double sexo, trabajo, sueldo;
    private static double cantH, cantM, cantTot;
    private static double homConTrab, mujConTrab, suelHom, suelMuj;

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Datos();
            SumarSexo();
            SumarTrabajo();
            SueldoPromedio();
        }
    }

    private static void Datos() {
        System.out.print("Sexo 1 para H, 2 para M: ");
        sexo = (int) (Math.random() * 2 + 1);
        System.out.println(sexo);
        System.out.print("1 si trabaja, 2 si no trabaja: ");
        trabajo = (int) (Math.random() * 2 + 1);
        System.out.println(trabajo);
        if (trabajo == DEF1) {
            System.out.print("sueldo entre 600 y 2000, redondearlo hacia arriba: ");
            sueldo = Math.floor(Math.random() * (600 - 2000 + 1) + 2000);
            System.out.println(sueldo);
        } else {
            sueldo = 0;
            System.out.println("no tiene sueldo por que no trabaja");
        }
    }

    private static void SumarSexo() {
        double porcH, porcM;
        if (sexo == DEF1) {
            cantH++;
            cantTot++;
        } else if (sexo == DEF2) {
            cantM++;
            cantTot++;
        }
        porcH = (cantH / cantTot * 100);
        porcM = (cantM / cantTot * 100);
        System.out.println("El total de personas es de " + cantTot);
        System.out.println("El porcentaje de hombres es " + porcH + " %");
        System.out.println("El porcentaje de mujeres es " + porcM + " %");
    }

    private static void SumarTrabajo() {
        double cantHomConTrab, cantMujConTrab;
        if (sexo == DEF1 && trabajo == DEF1) {
            homConTrab++;
        } else if (sexo == DEF2 && trabajo == DEF1) {
            mujConTrab++;
        }
        cantHomConTrab = (homConTrab / cantH * 100);
        cantMujConTrab = (mujConTrab / cantM * 100);
        System.out.println("Hay " + cantHomConTrab + " % de hombres con trabajo");
        System.out.println("Hay " + cantMujConTrab + " % de mujeres con trabajo");
    }

    private static void SueldoPromedio() {
        double suelPromHom, suelPromMuj;
        if (sexo == DEF1 && trabajo == DEF1) {
            suelHom += sueldo;
        } else if (sexo == DEF2 && trabajo == DEF1) {
            suelMuj += sueldo;
        }
        suelPromHom = suelHom / homConTrab;
        suelPromMuj = suelMuj / mujConTrab;

        System.out.println("El promedio del sueldo de los hombres con trabajo es de $" + suelPromHom);
        System.out.println("El promedio del sueldo de las mujeres con trabajo es de $" + suelPromMuj);
    }
}
