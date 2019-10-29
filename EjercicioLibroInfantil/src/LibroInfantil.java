public class LibroInfantil extends Libro
{
    private int edadRecomendada = 18;

    public boolean esRecomendable(int edadNynio)
    {
    if(edadNynio >= edadNynio)
    {
        return true;
    }
    else
        return false;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
}
