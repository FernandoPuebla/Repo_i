package ddr_obj9;

public class Espectador
{
    private String nombre;
    private int edad;
    private int dinero;
    private int lugar = 1;

    public Espectador(String nombreE, int edadE, int dineroE)
    {
        nombre = nombreE;
        edad = edadE;
        dinero = dineroE;
    }

    public int getEdad() {
        return edad;
    }

    public int getDinero() {
        return dinero;
    }

    public int getLugar() {
        return lugar;
    }
}
