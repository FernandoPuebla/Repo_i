package ddr_ejer2;

public class Persona
{
    private final static int PESOIDEAL = -1;
    private final static int DEBAJOPESO = 0;
    private final static int SOBREPESO = 1;
    private final static char SEXODEF = 'H';

    private String nombre = " ";
    private int edad = 0;
    private String DNI;
    private char sexo;
    private double peso = 0;
    private double altura = 0;

    public Persona(int pesoIdealP, int debajoPesoP, int sobrePesoP, char sexoP)
    {
        pesoIdealP = PESOIDEAL;
        debajoPesoP = DEBAJOPESO;
        sobrePesoP = SOBREPESO;
        sexoP = SEXODEF;
    }
    public Persona(String nombrePersona, int edadPersona, char sexoPersona)
    {
        nombre = nombrePersona;
        edad = edadPersona;
        sexo = sexoPersona;
    }
    public Persona(String nombrePersona, int edadPersona, char sexoPersona,double pesoPersona, double alturaPersona)
    {
        nombre = nombrePersona;
        edad = edadPersona;
        //DNI = DNIPersona;
        generaDNI();
        sexo = sexoPersona;
        //comprobarSexo();
        peso = pesoPersona;
        altura = alturaPersona;
    }

    /*public Persona(String nombre, int edad, char sexo, double peso, double altura) {
    }*/

    public int calcularIMC()
    {
        double IMC = peso/ Math.pow(altura,2);
        if(IMC < 20)
        {
            System.out.println("La persona está en su peso ideal " + IMC);
            return PESOIDEAL;
        }
        else if(IMC >= 20 && IMC <= 25)
        {
            System.out.println("La persona está debajo de peso ideal " + IMC);
            return DEBAJOPESO;
        }
        else if (IMC > 25)
        {
            System.out.println("La persona tiene sobrepeso  " + IMC);
            return SOBREPESO;
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
        String sexoS;
        if (this.sexo != SEXODEF) {
            sexoS = "mujer";
        } else {
            sexoS = "hombre";
        }
        return "La persona de nombre: " + nombre + " tiene " + edad
                + " años de edad, con DNI" + DNI + " y sexo " + sexoS
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
