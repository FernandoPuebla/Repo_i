package ddr_ejer3;

import java.util.Scanner;

public class PasswordApp
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int tamanio, longitud;
//Introducimos el tamaño del array y la longitud del password
        System.out.println("Ingrese el tamaño del arreglo");
        tamanio = sc.nextInt();

        System.out.println("Introduce la longitud del password");
        longitud = sc.nextInt();

        //Creamos los arrays
        Password[] listaPassword=new Password[tamanio];
        boolean[] fortalezaPassword=new boolean[tamanio];

        //Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su fortaleza.
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Password(longitud);
           // fortalezaPassword[i]= Password.esFuerte();
            System.out.println(Password.getContrasenia()+" "+fortalezaPassword[i]);
        }
    }


}
