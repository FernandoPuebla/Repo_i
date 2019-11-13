package ddr_ejer4;

public class Lavadora extends Electrodomestico
{
    private final int CARGA_CONST = 5;
    private int carga;

    public Lavadora()
    {
        this(PRECIO_BASE_CONST,);
    }
    public Lavadora(double precioLavadora, double pesoLavadora)
    {
    precio = precioLavadora;
    peso = pesoLavadora;
    }
    public Lavadora(int cargaLavadora, double precioElectrodomestico, double pesoElectrodomestico,String colorElectrodomestico, char consumoEnergeticoElectrodomestico)
    {
        cargaLavadora = getCarga();
        precioElectrodomestico = getPrecioBase();
        pesoElectrodomestico = getPeso();
        colorElectrodomestico = getColor();
        consumoEnergeticoElectrodomestico = getConsumoEnergetico();

    }
    public double precioFinal()
    {
        double carga = super.precioFinal();
        if(carga  30)
        {

        }
        return carga;
    }

    public int getCarga() {
        return carga;
    }
}
