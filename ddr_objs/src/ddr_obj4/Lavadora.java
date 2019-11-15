package ddr_obj4;

public class Lavadora extends Electrodomestico
{
    private static final int CARGA_DEF = 5;

    private int carga;

    public Lavadora() {
        this(PRECIO_DEF,PESO_DEF,CONSUMO_DEF,COLOR_DEF, CARGA_DEF);
    }

    public Lavadora(int precioE, int pesoE, int cargaL)
    {
        super(precioE, pesoE);
        carga = cargaL;
    }

    public Lavadora(int precioE, int pesoE, char consumoE, String colorE, int cargaL)
    {
        super(precioE, pesoE, consumoE, colorE);
        carga = cargaL;
    }

    @Override
    public int precioFinal()
    {
        int plus = super.precioFinal();
        if(carga>30)
        {
            plus += 50; //precioFinal();
        }
        /*super.precioFinal();
        if(carga>30)
        {
            precioFinal();
        }*/return plus;
    }

    public int getCarga() {
        return carga;
    }
}
