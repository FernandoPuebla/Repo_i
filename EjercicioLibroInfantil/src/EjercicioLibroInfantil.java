public class EjercicioLibroInfantil
{
    public static void main(String[] args) {
        LibroInfantil l = new LibroInfantil();

        l.setEdadRecomendada(5);

        if( l.esRecomendable(7))
        {
            System.out.println("Recomendable");
        }
        else
            System.out.println("No es recomendable");
    }
}
