package ddrejercicios;

import java.util.Scanner;

public class Cuenta
{
    static Scanner sc = new Scanner(System.in);
    private static String titular;
    private static double cantidad;

    public Cuenta(String titularCuenta)
    {
        titularCuenta = getTitular();
    }
    public Cuenta(String titularCuenta, double cantidadCuenta)
    {
        cantidadCuenta = getCantidad();
    }

    public static void main(String[] args)
    {


    }

    public void ingresar(double cantidad)
    {
        if (cantidad > 0)
        cantidad += cantidad;

    }
    public void retirar(double cantidadActual)
    {

        if(cantidadActual - cantidad < 0)
        {
            cantidadActual = 0;
        }
        else
            {
                cantidadActual = cantidadActual-cantidadActual;
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

    @Override
    public String toString()
    {
        return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
    }

}
