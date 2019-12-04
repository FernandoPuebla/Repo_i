package ejercicios_archivos_resueltos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjerRes1 
{
	public static void main(String[] args) 
	{
		mostrarMenu();
		}
	public static void mostrarMenu() 
	{
		Scanner sc = new Scanner(System.in);
		int opcion;
		do 
		{
			System.out.println("1-Crear fichero" + '\t' 
		+ "2-Mostrar Fichero" + '\t' + "3-salir");
			opcion = sc.nextInt();
			switch(opcion) 
			{
			case 1:
				crearFichero();
			break;
			case 2:
				mostrarFichero();
			break;
			case 3:
				System.out.println("Adios");
			break;
			default: System.out.println("Opcion incorrecta");
			break;
			}
		}while(opcion !=3);
	}

public static void crearFichero() 
{
	FileWriter fw = null;
    try {
        fw = new FileWriter("C:\\Users\\FernandoPueb_5dvr3\\Documents\\archivo.txt");
        PrintWriter pw = new PrintWriter(fw);
        escribirFichero(pw);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    } finally {
        try {
            if (fw != null) {
                fw.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
	}

public static void escribirFichero(PrintWriter pw) throws Exception {
    Scanner teclado = new Scanner(System.in);
    String opcion;
    System.out.println("Introduce tu nombre");
    opcion = teclado.nextLine();
    pw.println(opcion);
    System.out.println("Introduce tus apellidos");
    opcion = teclado.nextLine();
    pw.println(opcion);
    System.out.println("Introduce tu lugar de nacimiento");
    opcion = teclado.nextLine();
    pw.println(opcion);
}

public static void leerFichero(BufferedReader br) throws Exception {
    String linea;
    linea = br.readLine();
    while (linea != null) {

        System.out.println(linea);
        linea = br.readLine();

    }
}

public static void mostrarFichero() 
{
	FileReader fr = null;
    try {
        File fichero = new File("C:\\Users\\FernandoPueb_5dvr3\\Documents\\archivo.txt");
        fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);
        leerFichero(br);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    } finally {
        try {
            if (fr != null) {
                fr.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            }
        }
    }
}