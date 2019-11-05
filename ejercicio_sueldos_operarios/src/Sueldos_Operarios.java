import java.util.Scanner;

public class Sueldos_Operarios
{
    private Scanner sc = new Scanner(System.in);
    private int[] sueldos;

    public Sueldos_Operarios()
    {
        //sc=new Scanner(System.in);
        sueldos=new int[5];
        for(int f=0;f<5;f++)
        {
            System.out.print("Ingrese valor de la componente:");
            sueldos[f]=sc.nextInt();
        }
    }
    public static void main(String[] ar) {
        Sueldos_Operarios op=new Sueldos_Operarios();
        op.imprimir();
    }
        public void imprimir() {
        for(int f=0;f<5;f++) {
            System.out.println(sueldos[f]);
        }
    }

}
