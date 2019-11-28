package ddr_obj13;

public class Repartidor extends Empleados
{
    private String zona;

    public Repartidor(String nombre, int edad, int salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + " zona=" + zona;
    }

    @Override
    public boolean plus() {
        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("zona 3")) {
            //Con super. llamo a un metodo de la clase padre
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario((int) nuevoSalario);
            System.out.println("Se le añadido el plus, al empleado "+super.getNombre());
            return true;
        }
        return false;
    }

    /*public void plus() {
    if (edad < 25 && zona.equals("zona 3"))
        {
            salario += PLUS;
        }
    }
     */

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
