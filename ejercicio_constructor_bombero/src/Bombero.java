public class Bombero
{
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private boolean especialista;

    public Bombero(String nombreBombero, String apellidosBombero, int edadBombero, boolean casadoBombero, boolean especialistaBombero)
    {
        setNombre(nombreBombero);
        setApellidos(apellidosBombero);
        setEdad(edadBombero);
        setCasado(casadoBombero);
        setEspecialista(especialistaBombero);
    }

    /*public static void main(String[] args)
    {
        Bombero bomb = new Bombero("José","Morelos",20,false,false);
        System.out.println(bomb.apellidos);
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
