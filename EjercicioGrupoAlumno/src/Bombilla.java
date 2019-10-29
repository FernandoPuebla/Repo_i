public class Bombilla
{
    private boolean estado = false;

    public Bombilla()
    {
        estado = false;
    }
    public Bombilla(boolean estado)
    {
        this.estado = estado;
    }

    public void encender()
    {
        this.estado = true;

    }
    public void apagar()
    {
        this.estado = false;

    }
    public void consultarEstado()
    {
        if ( estado == true)
        {
            System.out.print("La bombilla está encendida");
        }
        else if( estado == false)
        {
            System.out.print("La bombilla está apagada");
        }
    }

}
