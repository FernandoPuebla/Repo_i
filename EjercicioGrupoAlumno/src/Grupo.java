public class Grupo
{
    private String codigo;
    private Alumno[] alumnos = null;

    public Grupo()
    {
        alumnos = new Alumno[5];
        for (int i = 0; i < 5; i++)
        {
        alumnos[i] = new Alumno();
        }
    }

}
