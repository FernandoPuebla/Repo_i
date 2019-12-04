package ejemplo_archivos3;

public class RegistroCuenta {
	private int cuenta;
	private String primerNombre,apellidoPaterno;
	private double saldo;
	
	public RegistroCuenta() 
	{
		this(0, "", "", 0.0);
	}

	public RegistroCuenta(int cta, String nombre, String apellido, double sal) {
		setCuenta(cta);
		setPrimerNombre(nombre);
		setApellidoPaterno(apellido);
		setSaldo(sal);
	}

	public int getCuenta() {
		return cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
