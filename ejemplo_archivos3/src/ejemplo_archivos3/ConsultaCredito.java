package ejemplo_archivos3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsultaCredito 
{
	private OpcionMenu tipoCuenta;
	private Scanner entrada;
	private OpcionMenu opciones[] = 
		{OpcionMenu.SALDO_CERO,
		OpcionMenu.SALDO_CREDITO,OpcionMenu.SALDO_DEBITO,
		OpcionMenu.FIN };
	private void leerRegistros() 
	{
		RegistroCuenta registro = new RegistroCuenta();
		String ruta = "C:\\Users\\FernandoPueb_5dvr3\\Documents\\clientes.txt";
		try 
		{
			entrada = new Scanner(new File(ruta));
			while(entrada.hasNext()) 
			{
				registro.setCuenta(entrada.nextInt());
				registro.setPrimerNombre(entrada.next());
				registro.setApellidoPaterno(entrada.next());
				registro.setSaldo(entrada.nextDouble());
				if(debeMostrar(registro.getSaldo()))
					System.out.printf("%-10d%-12s%-12s%10.2f\n",
					registro.getCuenta(), registro.getPrimerNombre(),
					registro.getApellidoPaterno(),registro.getSaldo());
				  }
			}
			catch ( NoSuchElementException elementException) 
			{
				System.err.println( "El archivo no esta bien formado." );
				entrada.close();
				System.exit( 1 );
			}catch ( IllegalStateException stateException)
			{
				System.err.println( "Error al leer del archivo." );
				System.exit( 1 );
			}
			catch ( FileNotFoundException fileNotFoundException )
			{
				System.err.println( "No se puede encontrar el archivo." );
				System.exit( 1 );
			}finally 
			{
				if ( entrada != null )
					entrada.close();
			}
		}
		private boolean debeMostrar(double saldo) 
		{
			if ( ( tipoCuenta == OpcionMenu.SALDO_CREDITO )
					&& ( saldo < 0 ) )
				return true;
			else if ( ( tipoCuenta == OpcionMenu.SALDO_DEBITO )
					&& ( saldo > 0 ) )
				return true;
			else if ( ( tipoCuenta == OpcionMenu.SALDO_CERO )
					&& ( saldo == 0 ) )
				return true;
			return false;
		}
		
		private OpcionMenu obtenerSolicitud() 
		{
			Scanner textoEnt = new Scanner(System.in);
			int solicitud = 1;
			System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
					"Escriba solicitud", " 1 - Lista de cuentas con saldos de cero",
					" 2 - Lista de cuentas con saldos con credito",
					" 3 - Lista de cuentas con saldos con debito", 
					" 4 - Finalizar ejecucion" );
		
try 
{
	do
	{
		System.out.print( "\n? " );
		solicitud = textoEnt.nextInt();

	}while( ( solicitud < 1 ) || ( solicitud > 4 ) );
	}
catch(NoSuchElementException elementException)
{
	System.err.println( "Entrada invalida." );
	System.exit( 1 );

}
return opciones[solicitud -1];
}
	public void procesarSolicitudes() 
	{
		tipoCuenta = obtenerSolicitud();
		while ( tipoCuenta != OpcionMenu.FIN ) 
		{
			switch(tipoCuenta) 
			{
			case SALDO_CERO:
				System.out.println("\nCuentas con saldos de cero:\n");
				break;
			case SALDO_CREDITO:
				System.out.println("\nCuentas con saldos:\n");
				break;
			case SALDO_DEBITO:
				System.out.println("\nCuentas con saldos con debito:\n");
				break;
			}
			leerRegistros();
			tipoCuenta = obtenerSolicitud();
		}
	}	
}


