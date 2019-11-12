package ddr_ejer5;

public class Serie
{
    private final static int numerodeTemporadasDef = 3;
    private final static boolean entregadoDef = false;
    private final static int MAYOR = 1;
    private final static int MENOR = -1;
    private final static int IGUAL = 0;

    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie()
    {
    }
    public Serie(String tituloSerie, String creadorSerie)
    {
        tituloSerie = getTitulo();
        creadorSerie = getCreador();
    }
    public Serie(String tituloSerie, int numeroDeTemporadasSerie,String generoSerie,String creadorSerie)
    {
        tituloSerie = getTitulo();
        numeroDeTemporadasSerie = getNumeroDeTemporadas();
        generoSerie = getGenero();
        creadorSerie = getCreador();
    }

   /* @Override
   public String toString()
    {

        return ;
    }
    */

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
}
