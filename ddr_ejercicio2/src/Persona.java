import java.util.Scanner;

public class Persona
{
    //Constantes
    private final static char SEXO_DEF = 'H';
    public static final int INFRAPESO = -1;
    public static final int PESO_IDEAL= 0;
    public static final int SOBREPESO = 1;

    //Declarar atributos
    private String nombre = " ";
    private int edad = 0
    private String DNI;
    private char sexo = 'M';
    private double peso = 0;
    private double altura = 0;

    //Declarar constructores
    public Persona()
    {
        this("",0,SEXO_DEF,0,0);
    }

    private Persona(String nombre, int edad, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexoDef, int i1, int i2)
    {
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();

    }

    //Métodos
    //REVISAR
    double calcularIMC(double peso, double altura)
    {
        //calcular si la persona está en su peso ideal
        double resultado = 0;
        if(resultado < 20)
        {
             resultado = -1;
            return resultado;
        }else if (resultado >= 20 && resultado <= 25)
        {
             resultado = 0;
            return  resultado;
        }else if (resultado >=  25)
        {
             resultado = 1;
            return resultado;
        }
        return resultado;
    }

    boolean esMayorDeEdad()
    {
        int mayordeedad;
        return mayordeedad;
    }

    void comprobarSexo(char sexo)
    {
        //verifica que el sexo introducido es correcto, si no es correcto sera H, no es visible al exterior
    }

   void toString()
    {
        //devuelve toda la información del objeto
    }

    void generarDNI()
    {
        //genera un numero aleatorio de 8 digitos, genera a partir de este su numero su letra correspondiente, se invoca al construir el bojeto

    }

}
