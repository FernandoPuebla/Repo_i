package ddr_ejer5;

public class Videojuego
{
    private final static int HorasEstimadasDef = 10;
    private final static boolean entregadoDef = false;

    private static String titulo;
    private static int horasEstimadas;
    private static boolean entregado;
    private static String genero;
    private static String compania;

    public Videojuego()
    {
    //this(HorasEstimadasDef);
    }
    public Videojuego(String tituloVideojuego, int horasEstimadasVideojuego)
    {
        tituloVideojuego = getTitulo();
        horasEstimadasVideojuego = getHorasEstimadas();
    }
    public Videojuego(String tituloVideojuego, int horasEstimadasVideojuego, String generoVideojuego, String companiaVideojuego )
    {
        tituloVideojuego = getTitulo();
        horasEstimadasVideojuego = getHorasEstimadas();
    }

    /*@Override
    public String toString()
    {

    }*/



    public static String getTitulo() {
        return titulo;
    }

    public static void setTitulo(String titulo) {
        Videojuego.titulo = titulo;
    }

    public static int getHorasEstimadas() {
        return horasEstimadas;
    }

    public static void setHorasEstimadas(int horasEstimadas) {
        Videojuego.horasEstimadas = horasEstimadas;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Videojuego.genero = genero;
    }

    public static String getCompania() {
        return compania;
    }

    public static void setCompania(String compania) {
        Videojuego.compania = compania;
    }
}
