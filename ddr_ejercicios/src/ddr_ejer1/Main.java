package ddr_ejer1;

public class Main
{

    public static void main(String[] args)
    {
	Cuenta c1 = new Cuenta("Jaime");
	Cuenta c2 = new Cuenta("Jaime",1000);

	c1.ingresar(500);
	c2.ingresar(100);

	c1.retirar(100);
	c2.retirar(2000);

	System.out.println(c1);
	System.out.println(c2);
    }
}
