package ejemplo_archivos3;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CrearArchivoTexto 
{
private Formatter salida;

public void abrirArchivo() 
{
	try 
	{
		salida = new Formatter("clientes.txt");
	}catch(SecurityException securityException) 
	{
		System.err.println("No tiene acceso de escritura a este archivo");
		System.exit(1);
	}catch( FileNotFoundException filesNotFoundException )
	{
		System.err.println("Error al crear el archivo");
		System.exit(1);
	}
}

public void agregarRegistros() 
{
RegistroCuenta registro = new RegistroCuenta();
Scanner entrada = new Scanner(System.in);
System.out.printf("%s\n%s\n%s\n%s\n\n", 
		"Para terminar la entrada, escriba el indicador de fin de archivo ",
		"cuando se le pida que escriba los datos de entrada.",
		"En UNIX/Linux/Mac OS X escriba <ctrl> d y oprima Intro",
		"En Windows escriba <ctrl> z y oprima Intro" );
System.out.printf("%s\n%s", 
		"Escriba el numero de cuenta (> 0), primer nombre, apellido paterno y saldo."
		,"? ");
while(entrada.hasNext()) 
{
try 
{
	registro.setCuenta(entrada.nextInt());
	registro.setPrimerNombre(entrada.next()); 
	registro.setApellidoPaterno(entrada.next()); 
	registro.setSaldo(entrada.nextDouble());
		
if(registro.getCuenta() > 0) 
{
	salida.format("%d %s %s %.2f\n", registro.getCuenta(), 
			registro.getPrimerNombre(), registro.getApellidoPaterno(),
	registro.getSaldo() );
}else 
{
	System.out.println("El numero de cuenta debe ser mayor que 0." );
	}
}catch(FormatterClosedException formatterClosedException) 
{
	System.err.println("Error al escribir en el archivo");
	return;
}
catch(NoSuchElementException elementException) 
{
	System.err.println("Entrada invalida. Intente de nuevo");
	entrada.hasNextLine();
	}
System.out.printf("%s %s\n%s", "Escriba el numero de cuenta (> 0),",
		"primer nombre, apellido paterno y saldo.", "? " );
}
	}
public void cerrarArchivo() 
{
	if ( salida != null )
	salida.close();
	}
}
