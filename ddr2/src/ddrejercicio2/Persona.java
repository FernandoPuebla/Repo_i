package ddrejercicio2;

import javax.jws.soap.SOAPBinding;

public class Persona
{
    private String nombre = " ";
    private int edad = 0;
    private String DNI;
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;

    public Persona()
    {

    }
    public Persona(String nombrePersona,int edadPersona, char sexoPersona)
    {
        nombrePersona = nombre;
        edadPersona = edad;
        sexoPersona = sexo;
    }
    public Persona(String nombrePersona,int edadPersona,String DNIPersona, char sexoPersona, double pesoPersona, double alturaPersona)
    {
        nombrePersona = nombre;
        edadPersona = edad;
        //DNIPersona = DNI;
        sexoPersona = sexo;
        pesoPersona = peso;
        alturaPersona = altura;
    }



    public static int calcularIMC()
    {
    double pesoActual =

    }
    public static boolean esMayorDeEdad()
    {
        if ()
    }
    public static boolean comprobarSexo(char sexo)
    {
        char sexoC = sexo;
    if (sexoC != 'H')
    }
    @Override
    public static toString()
    {
        System.out.println("El sujeto" + ...);
    }

    public static generaDNI()
    {

    }



}


