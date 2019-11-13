package ddr_ejer15;

public class Contacto
{
    private String nombre;
    private int tel;

    public Contacto(String nombre)
    {
        this.nombre = nombre;
    }

    public Contacto(String nombre, int tel)
    {
        this.nombre = nombre;
        this.tel = tel;
    }

    public boolean equals(Contacto c)
    {
        if(this.nombre.trim().equalsIgnoreCase(c.getNombre().trim()))
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", tel=" + tel +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
