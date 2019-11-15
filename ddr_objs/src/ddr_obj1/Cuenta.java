package ddr_obj1;

public class Cuenta
{
    private String titular;
    private double cantidad;

    public Cuenta(String titularCuenta)
    {
        titular = titularCuenta;
    }

    public Cuenta(String titularCuenta, double cantidadCuenta)
    {
        titular = titularCuenta;
        cantidad = cantidadCuenta;
    }

    public static void main(String[] args)
    {
        Cuenta cuenta1 = new Cuenta("Fernando");
        Cuenta cuenta2 = new Cuenta("Fer", 500);

        cuenta1.ingresar(500);
        cuenta1.retirar(100);
        //cuenta1.toString();
        cuenta2.ingresar(200);
        cuenta2.retirar(300);
        //cuenta2.toString();
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }

    public void ingresar(double cantidadIngresar)
    {
        if (cantidadIngresar > 0)
        cantidad += cantidadIngresar;
        //System.out.println("Ingresó " + cantidadIngresar + " a su cuenta, usted tiene " + cantidad);
    }

    public void retirar(double cantidadRetirar)
    {
        if (cantidadRetirar > cantidad)
        {
            cantidad = 0;
          //  System.out.println("Le quedan " + cantidad);
        }
        //System.out.println("Retiró " + cantidadRetirar + " a su cuenta, usted tiene " + cantidad);
    }

    @Override
    public String toString() {
        return "La Cuenta es de: "+ titular + " y tiene una cantidad de " + cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
