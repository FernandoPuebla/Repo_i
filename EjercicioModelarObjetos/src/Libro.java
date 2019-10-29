public class Libro
{
    protected String titulo;
    protected String ISBN;
    protected boolean abierto = false;
    protected int numPaginas = 0;
    protected int paginaActuall = 0;

    public void abrir()
    {
        abierto = true;
        System.out.println("Has abierto el libro");
    }

    public void cerrar()
    {
       abierto = false;
        System.out.println("Has cerrado el libro");
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

    public int getPaginaActuall() {
        return paginaActuall;
    }

    public void setPaginaActuall(int paginaActuall) {
        this.paginaActuall = paginaActuall;
    }
}
