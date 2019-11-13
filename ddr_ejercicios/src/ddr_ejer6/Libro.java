package ddr_ejer6;

public class Libro
{
    private int isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(int isbnLibro, String tituloLibro, String autorLibro, int numeroPaginasLibro)
    {
        isbn = isbnLibro;//setisbn(isbnLibro);
        titulo = tituloLibro;
        autor = autorLibro;
        numeroPaginas = numeroPaginasLibro;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    @Override
    public String toString()
    {
        return "El libro " + titulo +" con ISBN " + isbn +" creado por el autor " +
                autor + " tiene " + numeroPaginas + " páginas";
    }
}
