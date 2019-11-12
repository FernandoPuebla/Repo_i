package ddr_ejer1;
import java.util.Scanner;

public class Cuenta
{
    private String titular;
    private double cantidad;

    public Cuenta(String titularCuenta)
    {
        titular = titularCuenta;

    }
    public Cuenta(String titularCuenta,double cantidadCuenta)
    {
        titular = titularCuenta;
        cantidad = cantidadCuenta;
    }

    public void ingresar(double cantidadIngresada)
    {
        if (cantidadIngresada < 0)
        {
            cantidadIngresada = 0;
            System.out.println("Error! " + cantidadIngresada);
        }
        else
            {
                cantidad += cantidadIngresada;
                System.out.println("Ingresó la cantidad: $" + cantidadIngresada);
            }
    }

    public void retirar(double cantidadRetirada)
    {
        double resta = 0;
        resta = cantidad - cantidadRetirada;
        if (resta < 0 )
        {
            resta = 0;
            System.out.println("Se quedó con: $" + resta);
        }
        else
        {
            System.out.println("Quedan: $" + resta);
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override //No aparece el titular
    public String toString()
    {
        return "El titular " + titular + " tiene " + cantidad + " pesos";
    }
}
