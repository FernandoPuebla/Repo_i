package ddr_obj9;

public class Peliculas
{
    private String titulo;
    private int duracion;
    private int edadMin;
    private String director;

    public Peliculas(String tituloP, int duracionP, int edadMinP, String directorP)
    {
        titulo = tituloP;
        duracion = duracionP;
        edadMin = edadMinP;
        director = directorP;
    }

    public int getEdadMin() {
        return edadMin;
    }
}
