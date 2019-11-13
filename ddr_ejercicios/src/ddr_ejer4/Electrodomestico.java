package ddr_ejer4;

public class Electrodomestico
{
    private final double precioBaseConst = 100;
    private final String colorConst = "blanco";
    private final char consumoEnergeticoConst = 'F';
    private final double pesoConst = 5;

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico(double precioBaseConstElectrodomestico, String colorConsteElectrodomestico, char consumoEnergeticoConstElectrodomestico, double pesoConstElectrodomestico)
    {
    precioBaseConstElectrodomestico = precioBaseConst;
    colorConsteElectrodomestico = colorConst;
    consumoEnergeticoConstElectrodomestico = consumoEnergeticoConst;
    pesoConstElectrodomestico = pesoConst;
    }

    public Electrodomestico(double precioElectrodomestico, double pesoElectrodomestico)
    {
        precioBase = precioElectrodomestico;
        peso = pesoElectrodomestico;
    }


    public Electrodomestico(double precioElectrodomestico, double pesoElectrodomestico,String colorElectrodomestico, char consumoEnergeticoElectrodomestico)
    {
        precioBase = precioElectrodomestico;
        peso = pesoElectrodomestico;
        color = colorElectrodomestico;
        consumoEnergetico = consumoEnergeticoElectrodomestico;
    }

    private void comprobarConsumoEnergetico()
    {
    char letra = ' ';
    if(letra != 'A' || letra != 'B' || letra =! 'C' || letra =! 'D' || letra =! 'E' || letra =! 'F')
        {
            letra = consumoEnergeticoConst;
            System.out.println("Ingresó una letra errónea, se pondrá el valor por defecto " + letra);
        }
    }

    public void comprobarColor(String color)
    {
        if(color.equals("blanco")  || color != "negro" ||color != "rojo" ||color != "azul" ||color != "gris")
        {
            color = colorConst;
            System.out.println("Ingresó un color erróne, se pondrá el valor por defecto " + color);
        }
    }
    public void precioFinal()
    {

    }


    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
}
