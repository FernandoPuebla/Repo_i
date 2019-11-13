package ddr_ejer4;

public class Lavadora extends Electrodomestico
{
    private int carga;

    private final int cargaConst = 5;

    public Lavadora()
    {

    }
    public Lavadora(double precio, double peso)
    {
    precio = pre;
    peso = getPeso();
    }
    public Lavadora(int cargaLavadora, double precioElectrodomestico, double pesoElectrodomestico,String colorElectrodomestico, char consumoEnergeticoElectrodomestico)
    {
        cargaLavadora = getCarga();
        precioElectrodomestico = getPrecioBase();
        pesoElectrodomestico = getPeso();
        colorElectrodomestico = getColor();
        consumoEnergeticoElectrodomestico = getConsumoEnergetico();

    }
    public void precioFinal(int carga)
    {
        if(carga < 30)
        {

        }
    }

    public int getCarga() {
        return carga;
    }
}
