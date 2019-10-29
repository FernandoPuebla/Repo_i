public class Libro
{
    protected String titulo;
    protected String ISBN;
    protected boolean abierto  = false;
    protected  int numPaginas;
    protected int paginaActual = 0;

    public void abrir()
    {
        setAbierto(true);
        System.out.println("El libro se ha abierto");
    }

    public void cerrar()
    {
        setAbierto(false);
        System.out.println("El libro ha sido cerrado");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }
}
