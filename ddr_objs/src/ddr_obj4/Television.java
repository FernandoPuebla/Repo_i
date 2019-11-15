package ddr_obj4;

public class Television extends Electrodomestico
{
    private final static int RES_DEF = 20;
    private final static boolean SINT_DEF = false;

    private int resolucion;
    private boolean sintonizadorTNT;

    public Television()
    {
        this(PRECIO_DEF,PESO_DEF,CONSUMO_DEF,COLOR_DEF,RES_DEF,SINT_DEF);
    }

    public Television(int precioE, int pesoE, int resolucionT, boolean sintonizadorTNTT)
    {
        super(precioE, pesoE);
        resolucion = resolucionT;
        sintonizadorTNT = sintonizadorTNTT;
    }

    public Television(int precioE, int pesoE, char consumoE, String colorE, int resolucionT, boolean sintonizadorTNTT)
    {
        super(precioE, pesoE, consumoE, colorE);
        resolucion = resolucionT;
        sintonizadorTNT = sintonizadorTNTT;
    }

    @Override
    public int precioFinal() {
        int plus = super.precioFinal();
        if(resolucion>40)
        {
            plus += precio*0.3;//modificar
        }
        return plus;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTNT() {
        return sintonizadorTNT;
    }
}
