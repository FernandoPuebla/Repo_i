package ddr_obj13;

public abstract class Empleados
{
    protected final int PLUS = 300;

    private String nombre;
    private int edad;
    private int salario;

    public Empleados(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "PLUS=" + PLUS +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    public abstract boolean plus(); // MÉTODO ABSTRACTO, OBLIGA A LAS CLASES HIJAS QUE IMPLEMENTEN ESTA FUNCION
}
