package ddr_obj12;

public class Jugador
{
    private int id = 1;
    private String nombre = "Jugador";
    private boolean vivo = true;

    public void disparar(Revolver r)
    {
        r.disparar();
        if(r.disparar())
        {
            vivo = false;
        }
        else vivo = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
