package ddrejercicios;

public class CuentaSolucionApp
{
    public static void main(String[] args)
    {
        CuentaSolucion cuenta_1 = new CuentaSolucion("DiscoDurodeRoer");
        CuentaSolucion cuenta_2 = new CuentaSolucion("Fernando", 300);

        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);

        //Retiramos dinero en las cuentas
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);

        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros
    }
}
