package ddr_ejer4;

public class Television extends Electrodomestico
{
    private final int RESOLUCION_DEF = 20;
    private final int SINTONIZADORTNT_DEF= false;
    private int resolucion;
    private boolean sintonizadorTNT;

    public Television(double precioBaseConstElectrodomestico, String colorConsteElectrodomestico, char consumoEnergeticoConstElectrodomestico, double pesoConstElectrodomestico) {
        super(precioBaseConstElectrodomestico, colorConsteElectrodomestico, consumoEnergeticoConstElectrodomestico, pesoConstElectrodomestico);
    }

}
