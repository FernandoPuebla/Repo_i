package ddr_obj13;

public class Comercial extends Empleados
{
    private double comision;

    public Comercial(String nombre, int edad, int salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }
    /*public void plus()
    {
        if (edad > 30 && comision > 200)
        {
            salario += PLUS;
        }
    }
     */

    @Override
    public String toString() {
        return super.toString() + "COMISION =" + comision;
    }

    @Override
    public boolean plus() {
        if (super.getEdad() > 30 && this.comision > 200) {
            //Con super. llamo a un metodo de la clase padre
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario((int) nuevoSalario);
            System.out.println("Se le añadido el plus, al empleado " + super.getNombre());
            return true;
        }
        return false;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
