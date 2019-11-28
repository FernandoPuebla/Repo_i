package ddr_obj13;

public class EmpleadosApp
{
    public static void main(String[] args) {
        Comercial empleadoComercial1 = new Comercial("Fer",24,100,50.5);
        Repartidor empleadoRepartidor1 = new Repartidor("nando",30,200,"zona 2");

        empleadoComercial1.plus();
        empleadoRepartidor1.plus();
        System.out.println(empleadoComercial1);
        System.out.println(empleadoRepartidor1);
    }

}
