package ddr_bas4;

import javax.swing.*;
import java.util.Scanner;
import static javax.swing.JOptionPane.*;

public class DdrBas4
{

    public static void main(String[] args)
    {

        //Nos aparece un cuadro de dialogo
        String nombre= showInputDialog("Introduce tu nombre");

        System.out.println("Bienvenido "+ nombre);
        /*
        Con Scanner
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre ");
        nombre = sc.next();
        System.out.println("Bienvenido " + nombre);
        * */
    }
}
