public class Profesor
{
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private boolean especialista;

    public Profesor(String nombreProfesor, String apellidoProfesor, int edadProfesor,boolean casadoProfesor, boolean especialistaProfesor )
    {
        setNombre(nombreProfesor);
        setApellido(apellidoProfesor);
        setEdad(edadProfesor);
        setCasado(casadoProfesor);
        setEspecialista(especialistaProfesor);
    }
    public Profesor()
    {
        setNombre((""));
        setApellido("");
        setEdad(0);
        setCasado(false);
        setEspecialista(false);
    }

    public static void main(String[] args)
    {

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isEspecialista() {
        return especialista;
    }

    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
    }
}
