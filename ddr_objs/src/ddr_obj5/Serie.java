package ddr_obj5;

public class Serie implements Entregable
{
    private static final int NUM_TEMP = 3;
    private static final boolean ENT_DEF = false;
    //PORQUE AGREGAR ESTOS?
    public final static int MAYOR = 1;
    public final static int MENOR = -1;
    public final static int IGUAL = 0;

    private String titulo;
    private int numTemporadas;
    private boolean entregado;
    private String  genero;
    private String creador;

    public Serie()
    {
        this("", NUM_TEMP, "", "");
    }

    public Serie(String tituloS, String creadorS) {
        titulo = tituloS;
        creador = creadorS;
    }

    public Serie(String tituloS, int numTemporadasS, String generoS, String creadorS) {
        titulo = tituloS;
        numTemporadas = numTemporadasS;
        genero = generoS;
        creador = creadorS;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
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
//TIENES QUE IMPLEMENTAR LOS MÉTODOS AL IMPLEMENTAR
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
        if(entregado){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object a) {
        int estado=MENOR;

        //Hacemos un casting de objetos para usar el metodo get
        Serie ref=(Serie)a;
        if (numTemporadas>ref.getNumTemporadas()){
            estado=MAYOR;
        }else if(numTemporadas==ref.getNumTemporadas()){
            estado=IGUAL;
        }

        return estado;
    }
}
