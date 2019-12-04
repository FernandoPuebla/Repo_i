package ejercicios_archivos_resueltos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjerRes2 
{
	static String nombre;
public static void main(String[] args) 
{
	opcionMenu();
	
	}
private static void opcionMenu() 
{
	Scanner sc = new Scanner(System.in);
	int opcion;
	System.out.println("Escoja una opcion" + '\t'
	+ "1-Elegir nombre de fichero" + '\t' + "2-Mostrar Fichero" + '\t' + "3-Salir");
	opcion = sc.nextInt();
	switch(opcion) 
	{
	case 1:elegirNombre();
		break;
	case 2:mostrarFichero();
		break;
	case 3:System.out.println("Adios");
		break;
	}
}
public static String elegirNombre() 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Declare un nombre");
	nombre = sc.next();
	return nombre;
	}
public static String devolverNombre() 
{
	return nombre;
	}
public static void crearFichero() 
{
	FileWriter fw = null;
	try 
	{
		fw = new FileWriter(elegirNombre()  + ".txt");
		PrintWriter pw = new PrintWriter(fw);
		escribirFichero(pw);
	}catch(Exception e) 
	{
		System.out.println(e.getMessage());
	}finally 
	{
		try {
			if(fw != null) 
			{
				fw.close();
			}
		}catch (Exception e) 
			{
			System.out.println(e.getMessage());
			}
		}
	}
public static void escribirFichero(PrintWriter pw) throws Exception
{
	int n = 0,cont = 0;
	System.out.println("Numeros pares");
	while(cont<= 100) 
		{
		if(n % 2 == 0) 
			{
			pw.println(n);//System.out.println(n + " " + cont);
			cont++;
			}
		n++;
		}
}
public static void mostrarFichero() 
{
	FileReader fr = null;
	try 
	{
			File fichero = new File(devolverNombre() + ".txt");
			fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			leerFichero(br);
		}catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}finally 
		{
			if(fr != null) 
			{
				try 
				{
					fr.close();
				}catch(Exception e) 
				{
					System.out.println(e.getMessage());
				}
			}
		}
	}
	public static void leerFichero(BufferedReader br) throws Exception
	{
		String linea;
		linea = br.readLine();
		while(linea != null) 
		{
			System.out.println(linea);
			linea = br.readLine();
		}
	}
}

