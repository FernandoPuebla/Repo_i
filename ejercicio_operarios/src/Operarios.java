import java.util.Scanner;

public class Operarios
{
//Se desea guardar los sueldos de 5 operarios en un vector. Realizar la creación y carga del vector en el constructor.
    private static Scanner sc = new Scanner(System.in);
        private static int[] sueldos = sueldos = new int[5];

        public Operarios()
        {
            for (int i = 0 ; i < sueldos.length; i++)
            {
                System.out.println("Ingrese el sueldo del operario " + (i+1));
                sueldos[i] = sc.nextInt();
                //System.out.println("Operario " + (i+1) + "gana " + sueldos[i]);
            }
        }

    public static void main(String[] args)
    {
        Operarios operadores = new Operarios();
        for (int i = 0 ; i < sueldos.length; i++)
        {
            System.out.println("Operario " + (i+1) + " gana " + sueldos[i]);
        }
    }
}
