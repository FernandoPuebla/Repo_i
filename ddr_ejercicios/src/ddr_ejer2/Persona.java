package ddr_ejer2;

public class Persona
{
    private final static int pesoIdeal = -1;
    private final static int debajoPeso = 0;
    private final static int sobrePeso = 1;

    private String nombre = " ";
    private int edad = 0;
    private String DNI;
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;

    public Persona(char sexoP)
    {
    sexoP = sexo;
    }
    public Persona(String nombrePersona, int edadPersona, char sexoPersona)
    {
        nombrePersona = nombre;
        edadPersona = edad;
        sexoPersona = sexo;
    }
    public Persona(String nombrePersona, int edadPersona,int DNIPersona, char sexoPersona,double pesoPersona, double alturaPersona)
    {
        nombrePersona = nombre;
        edadPersona = edad;
        //DNIPersona = DNI;
        generaDNI();
        sexoPersona = sexo;
        //comprobarSexo();
        pesoPersona = peso;
        alturaPersona = altura;
    }

    public int calcularIMC()
    {
        double IMC = (peso/(altura*altura));
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
        return 2;
    }
    public boolean esMayorDeEdad()
    {
    if (edad > 18)
    {
        System.out.println("Es mayor de edad");
        return true;
    }
    else
        System.out.println("No es mayor de edad");
        return false;
    }
    private void comprobarSexo(char sexoComprobado)
    {
        if (sexoComprobado == 'M' || sexoComprobado == 'H')
        {
            System.out.println("El sexo es " + sexoComprobado);
        }
        else
            sexoComprobado = sexo;
        System.out.println("El sexo introducido fue erróneo, se muestra el sexo por defecto " + sexoComprobado);
    }
    @Override
    public String toString()
    {

        return "La persona de nombre: " + nombre + " tiene " + edad
                + " de edad " + " con DNI" + DNI + " y sexo " + sexo
                + " pesa " + peso + " kgs " + " y mide " + altura + " cms";
    }
    private void generaDNI()
    {
        //DNI = Math.random()*9;
        final int divisor = 23;

        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);

        //Pasamos el DNI a String
        DNI = Integer.toString(numDNI) + letraDNI;
    }
    private char generaLetraDNI(int res)
    {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
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

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
