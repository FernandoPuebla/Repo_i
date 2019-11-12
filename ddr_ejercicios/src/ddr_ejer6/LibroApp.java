package ddr_ejer6;

public class LibroApp
{
    public static void main(String[] args)
    {
     Libro libro1 = new Libro(1111,"np","fer",23);
     Libro libro2 = new Libro(2222,"pn","pi",12);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        //Libro.setNumeroPaginas(70);

        if(libro1.getNumeroPaginas() > libro2.getNumeroPaginas())
        {
            System.out.println(libro1.getTitulo() + " tiene más páginas");
        }
        else
            System.out.println(libro2.getTitulo() + " tiene más páginas");
    }
}
