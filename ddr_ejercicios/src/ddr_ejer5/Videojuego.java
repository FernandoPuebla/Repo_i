package ddr_ejer5;

public class Videojuego implements Entregable {
    private final static int HORAS_ESTIMADAS_DEF = 10;
    private final static int MAYOR = 1;
    private final static int MENOR = -1;
    private final static int IGUAL = 0;

    private static String titulo;
    private static int horasEstimadas;
    private static boolean entregado;
    private static String genero;
    private static String compania;

    public Videojuego()
    {
    horasEstimadasVideojuego = HORAS_ESTIMADAS_DEF;

    }
    public Videojuego(String tituloVideojuego, int horasEstimadasVideojuego)
    {
        tituloVideojuego = titulo;
        horasEstimadasVideojuego = horasEstimadas;
    }
    public Videojuego(String tituloVideojuego, int horasEstimadasVideojuego, String generoVideojuego, String companiaVideojuego)
    {
        tituloVideojuego = titulo;
        horasEstimadasVideojuego = horasEstimadas;
        generoVideojuego = genero;
        companiaVideojuego = compania;
    }

    @Override
   public String toString()
    {
        return "El videojuego es " + titulo
        + " su jugabilidad son de " + horasEstimadas + " su estado es "+ entregado +" y su genero "
        + genero + " y la compania creadora es " + compania;
    }

    public boolean equals(Videojuego a)
    {
        if(titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getCompania()))
        {
            return true;
        }
        return false;
    }

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

    @Override
    public void entregar() {
        entregado = true;

    }

    @Override
    public void devolver() {
    entregado = false;
    }

    @Override
    public boolean isEntregado() {
        if(entregado)
        {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object a) {
        int estado = MENOR;

        Videojuego ref = (Videojuego)a;
        if(horasEstimadas > ref.getHorasEstimadas())
        {
            estado = MAYOR;
        }else if(horasEstimadas == ref.getHorasEstimadas())
        {
            estado = IGUAL;
        }
        return 0;
    }
}
