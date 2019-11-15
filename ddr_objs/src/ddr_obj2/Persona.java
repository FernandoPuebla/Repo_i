package ddr_obj2;

import java.util.Scanner;

public class Persona
{
    private final String NOMBRE_DEF = "";
    private final int EDAD_DEF = 0;
    private final char SEXO_DEF = 'H';
    private final double PESO_DEF = 0;
    private final int ALTURA_DEF = 0;
    private final int PESO_IDEAL = 0;
    private final int PESO_DEBAJO = 0;
    private final int SOBREPESO = 0;

    private String nombre;
    private int edad;
    //private int DNI;
    private char sexo;
    private double peso;
    private int altura;

    public Persona(char sexoP)
    {
        sexoP = SEXO_DEF;
    }
    public Persona(String nombreP, int edadP, char sexoP)
    {
        nombre = nombreP;
        edad = edadP;
        sexo = sexoP;
    }
    public Persona(String nombreP, int edadP, char sexoP, double pesoP, int alturaP)
    {
        nombre = nombreP;
        edad = edadP;
        sexo = sexoP;
        generaDNI();//DNI = DNIP;
        peso = pesoP;
        altura = alturaP;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nombreM;
        int edadM;
        char sexoM;
        double pesoM;
        int alturaM;

        System.out.println("Ingrese el nombre, edad, sexo, peso y altura de la persona");
        System.out.print("Nombre: ");
        nombreM = sc.next();
        System.out.print("Edad: ");
        edadM = sc.nextInt();
        System.out.print("Sexo: ");
        sexoM = sc.next().charAt(0);
        System.out.print("Peso: ");
        pesoM = sc.nextDouble();
        System.out.print("Altura: ");
        alturaM = sc.nextInt();

        Persona p1 = new Persona(nombreM, edadM, sexoM, pesoM, alturaM);
        Persona p2 = new Persona(nombreM, edadM, sexoM);
        Persona p3 = new Persona(sexoM);

        p1.calcularIMC();
        p2.calcularIMC();
        p3.calcularIMC();

        p1.esMayorDeEdad();
        p2.esMayorDeEdad();
        p3.esMayorDeEdad();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

    public int calcularIMC()
    {
        int pesoIdeal = (int) (peso / (Math.pow(altura, 2)));

        if (pesoIdeal < 20)
        {
            System.out.println("Está en su peso ideal");
            return PESO_IDEAL;
        }else if (pesoIdeal >= 20 && pesoIdeal <=25)
        {
            System.out.println("Está debajo de su peso ideal");
            return PESO_DEBAJO;
        }else if (pesoIdeal > 25)
        {
            System.out.println("Tienes sobrepeso");
            return SOBREPESO;
        }
        return -2;
    }
    public boolean esMayorDeEdad()
    {
        if (edad >=18)
        {
            return true;
        }
            return false;
    }
    public char comprobarSexo(char sexoC)
    {
        if (sexoC == 'M')
        {
            return sexoC;
        }
        else
            return SEXO_DEF;

    }
    private int generaDNI()
    {
        return (int) (Math.random()*8);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + generaDNI() +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
