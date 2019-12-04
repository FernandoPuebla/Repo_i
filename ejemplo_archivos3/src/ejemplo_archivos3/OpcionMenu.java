package ejemplo_archivos3;

public enum OpcionMenu 
{
	SALDO_CERO(1),
	SALDO_CREDITO(2),
	SALDO_DEBITO(3),
	FIN(4);
	
	private final int valor;
	OpcionMenu(int valorOpcion)
	{
		valor = valorOpcion;
	}
	public int obtenerValor() 
	{
		return valor;
	}
}
