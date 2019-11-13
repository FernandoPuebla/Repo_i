package ddr_ejer5;

public abstract class Serie implements Entregable
{
    private final static int NUM_DE_TEMP_DEF = 3;
    private final static boolean ENTREGADO_DEF = false;
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
        /*numDeTemporadasSerie = NUM_DE_TEMP_DEF;
        entregadoDefSerie = ENTREGADO_DEF;
        mayorSerie = MAYOR;
        menorSerie = MENOR;
        igualSerie = IGUAL;*/
    }
    public Serie(String tituloSerie, String creadorSerie)
    {
        tituloSerie = titulo;
        creadorSerie = creador;
    }
    public Serie(String tituloSerie, int numeroDeTemporadasSerie,String generoSerie,String creadorSerie)
    {
        tituloSerie = titulo;
        numeroDeTemporadasSerie = numeroDeTemporadas;
        generoSerie = genero;
        creadorSerie = creador;
    }

   @Override
   public String toString()
    {
        return "El titulo de la serie es " + titulo
        + " tiene " + numeroDeTemporadas + " temporadas "
        + " el genero es " + genero + " y su creador es " + creador;
    }


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
