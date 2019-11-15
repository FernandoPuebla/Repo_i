package ddr_obj6;

public class LibroApp
{
    public static void main(String[] args) {
        Libro libro1 = new Libro(123123,"AERAS", "REPE", 12);
        Libro libro2 = new Libro(3213123, "Rasd", "qwe" , 10);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        if (libro1.getNumPag() > libro2.getNumPag())
        {
            System.out.println("El libro1 tiene más páginas que el libro2");
        }else
            System.out.println("El libro2 tiene más páginas que el libro1");
    }


}
