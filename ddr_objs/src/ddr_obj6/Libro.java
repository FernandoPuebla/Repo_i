package ddr_obj6;

public class Libro
{
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPag;

    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "El libro " + titulo + '\'' + "con ISBN " + ISBN + '\'' +
                "creado por el autor'" + autor + '\''+
                "tiene " + numPag + '\'' +
                "páginas";
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
}
