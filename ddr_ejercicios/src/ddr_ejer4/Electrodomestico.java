package ddr_ejer4;

public class Electrodomestico
{
    private final double PRECIO_BASE_CONST = 100;
    private final String COLOR_CONST = "blanco";
    private final char CONSUMO_ENERGETICO_CONST = 'F';
    private final double PESO_CONST = 5;

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico(double precioBaseConstElectrodomestico, String colorConsteElectrodomestico, char consumoEnergeticoConstElectrodomestico, double pesoConstElectrodomestico)
    {
    precioBaseConstElectrodomestico = PRECIO_BASE_CONST;
    colorConsteElectrodomestico = COLOR_CONST;
    consumoEnergeticoConstElectrodomestico = CONSUMO_ENERGETICO_CONST;
    pesoConstElectrodomestico = PESO_CONST;
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

    private void comprobarConsumoEnergetico(char letra)
    {
    if(letra == (char)65 || letra == (char)66 || letra == (char)67 || letra == (char)68 || letra == (char)69 || letra == (char)70)
        {
            letra = CONSUMO_ENERGETICO_CONST;
            System.out.println("Ingresó una letra errónea, se pondrá el valor por defecto " + letra);
        }
    }

    public void comprobarColor(String color)
    {
        if(color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris"))
        {
            this.color.equals(color);
                    }
        else
        {
            color.equals (COLOR_CONST);
            System.out.println("Ingresó un color erróneo, se pondrá el valor por defecto " + color);
        }
    }
    public double precioFinal()
    {
        if (consumoEnergetico == (char)66)
        {
            precioBase = 100;
        }
        return 0;
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
