package ddr_obj12;

public class Revolver
{
    private int posicionActual;
    private int posicionBala;

    public Revolver() {
        posicionActual = (int) (Math.random()*6);
        posicionBala = (int) (Math.random()*6);
    }

    public boolean disparar()
    {
        if(posicionBala == posicionActual)
        {
            return true;
        }else return false;
    }
    public void siguienteBala()
    {
        if (posicionActual == 6) {
            posicionActual = 1; //posicion incial
        } else {
            posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posicionActual=" + posicionActual +
                ", posicionBala=" + posicionBala +
                '}';
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }
}
