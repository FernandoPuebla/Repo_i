package ddr_obj5;

public class Videojuego implements Entregable
{
    private static final int HRS_EST_DEF = 10;
    private static final boolean ENT_DEF = false;
    //PORQUE AGREGAR ESTOS?
    public final static int MAYOR = 1;
    public final static int MENOR = -1;
    public final static int IGUAL = 0;

    private String titulo;
    private int hrsEst;
    private boolean entregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this(" ", HRS_EST_DEF,  " ", " ");
    }

    public Videojuego(String tituloV, int hrsEstV) {
        titulo = tituloV;
        hrsEst = hrsEstV;
    }

    public Videojuego(String tituloV, int hrsEstV,  String generoV, String companiaV) {
        titulo = tituloV;
        hrsEst = hrsEstV;
        //entregado = entregadoV;
        genero = generoV;
        compania = companiaV;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", hrsEst=" + hrsEst +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    //SE IMPLEMENTAN LOS MÉTODOS
    @Override
    public void entregar() {
        entregado  = true;
    }

    @Override
    public void devolver() {
        entregado  = false;
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
        int estado=MENOR;

        //Hacemos un casting de objetos para usar el metodo get
        Videojuego ref=(Videojuego)a;
        if (hrsEst>ref.getHrsEst()){
            estado=MAYOR;
        }else if(hrsEst==ref.getHrsEst()){
            estado=IGUAL;
        }

        return 0;
    }
//FUNCION PORQUE IMPLEMENTÓ?
    public boolean equals(Videojuego a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getCompania())){
            return true;
        }
        return false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHrsEst() {
        return hrsEst;
    }

    public void setHrsEst(int hrsEst) {
        this.hrsEst = hrsEst;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
