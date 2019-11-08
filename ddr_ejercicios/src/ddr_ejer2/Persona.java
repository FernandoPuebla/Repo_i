package ddr_ejer2;

public class Persona
{
    private final int pesoIdeal = -1;
    private final int debajoPeso = 0;
    private final int sobrePeso = 1;

    private String nombre = " ";
    private int edad = 0;
    private String DNI;
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;

    public Persona()
    {

    }
    public Persona(String nombrePersona, int edadPersona, char sexoPersona)
    {
        nombrePersona = nombre;
        edadPersona = edad;
        sexoPersona = sexo;
    }
    public Persona(String nombrePersona, int edadPersona,String DNIPersona, char sexoPersona,double pesoPersona, double alturaPersona)
    {
        nombrePersona = nombre;
        edadPersona = edad;
        //DNIPersona = DNI;
        sexoPersona = sexo;
        pesoPersona = peso;
        alturaPersona = altura;
    }

    public int calcularIMC(double IMC)
    {
        IMC = (peso/(altura*altura));
        if(IMC < 20)
        {
            return pesoIdeal;
        }
        else if(IMC >= 20 && IMC <= 25)
        {
            return debajoPeso;
        }
        else if (IMC > 25)
        {
            return sobrePeso;
        }
    }
    public boolean esMayorDeEdad()
    {

    }
    comprobarSexo()
    {

    }
    toString()
    {

    }
    generaDNI()
    {

    }


}
