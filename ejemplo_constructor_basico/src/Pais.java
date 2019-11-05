public class Pais
{

    private String nombre;
    private int cantidadHabitantes;

    public static void main(String[] args)
    {
        Pais mexico = new Pais("Mexico", 123123);
        System.out.println(mexico.nombre);
        System.out.println(mexico.cantidadHabitantes);
    }

    public Pais(String nombrePais,int cantidadHabitantes)
    {
        nombre = nombrePais;
        this.cantidadHabitantes  = cantidadHabitantes;
    }
}
