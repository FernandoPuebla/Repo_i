package ddr_obj2;

import java.util.Locale;
import java.util.Scanner;

public class Sol2
{
    //Constantes
    /**
     * Sexo por defecto
     */
    private static final char SEXO_DEF = 'H';

    /**
     * El peso de la persona esta por debajo del peso ideal
     */
    public static final int INFRAPESO = -1;

    /**
     * El peso de la persona esta en su peso ideal
     */
    public static final int PESO_IDEAL = 0;

    /**
     * El peso de la persona esta por encima del peso ideal
     */
    public static final int SOBREPESO = 1;

    //Atributos
    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Edad de la persona
     */
    private int edad;

    /**
     * DNI de la persona, se genera al construir el objeto
     */
    private String DNI;

    /**
     * Sexo de la persona, H hombre M mujer
     */
    private char sexo;

    /**
     * Peso de la persona
     */
    private double peso;

    /**
     * Altura de la persona
     */
    private double altura;

    //Contructores
    /**
     * Constructor por defecto
     */
    public Sol2() {
        this("", 0, SEXO_DEF, 0, 0);
    }

    /**
     * Constructor con 3 parametroe
     *
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     */
    public Sol2(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    /**
     * Constructor con 5 parametros
     *
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     * @param peso de la persona
     * @param altura de la persona
     */
    public Sol2(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        this.sexo = sexo;
        comprobarSexo();
    }

    //Métodos privados
    private void comprobarSexo() {

        //Si el sexo no es una H o una M, por defecto es H
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEF;
        }
    }

    private void generarDni() {
        final int divisor = 23;

        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);

        //Pasamos el DNI a String
        DNI = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }

    //Métodos publicos
    /**
     * Modifica el nombre de la persona
     *
     * @param nombre a cambiar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica la edad de la persona
     *
     * @param edad a cambiar
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Modifica el sexo de la persona, comprueba que es correcto
     *
     * @param sexo a cambiar
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * Modifica el peso de la persona
     *
     * @param peso a cambiar
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Modifica la altura de la persona
     *
     * @param altura a cambiar
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el indice de masa corporal
     *
     * @return codigo numerico
     * <ul><li>-1: la persona esta por debajo de su peso ideal</li>
     * <li>0: la persona esta en su peso ideal</li>
     * <li>1: la persona esta por encima de su peso ideal</li></ul>
     */
    public int calcularIMC() {
        //Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(altura, 2));
        //Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }
    }

    /**
     * Indica si la persona es mayor de edad
     *
     * @return true si es mayor de edad y false es menor de edad
     */
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    /**
     * Devuelve informacion del objeto
     *
     * @return cadena con toda la informacion
     */
    @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);

        //Introducimos los datos
        System.out.println("Introduce el nombre");
        String nombre = sc.next();

        System.out.println("Introduce la edad");
        int edad = sc.nextInt();

        System.out.println("Introduce el sexo");
        char sexo = sc.next().charAt(0);

        System.out.println("Introduce el peso");
        double peso = sc.nextDouble();

        System.out.println("Introduce la altura");
        double altura = sc.nextDouble();

        //Creamos objetos con cada constructor
        Sol2 pers1 = new Sol2();
        Sol2 pers2 = new Sol2(nombre, edad, sexo);
        Sol2 pers3 = new Sol2(nombre, edad, sexo, peso, altura);

        //Los datos que no esten completos los insertamos con los metodos set
        pers1.setNombre("Laura");
        pers1.setEdad(30);
        pers1.setSexo('M');
        pers1.setPeso(60);
        pers1.setAltura(1.60);

        pers2.setPeso(90.5);
        pers2.setAltura(1.80);

        //Usamos metodos para realizar la misma accion para cada objeto
        System.out.println("Persona1");
        MuestraMensajePeso(pers1);
        MuestraMayorDeEdad(pers1);
        System.out.println(pers1.toString());

        System.out.println("Persona2");
        MuestraMensajePeso(pers2);
        MuestraMayorDeEdad(pers2);
        System.out.println(pers2.toString());

        System.out.println("Persona3");
        MuestraMensajePeso(pers3);
        MuestraMayorDeEdad(pers3);
        System.out.println(pers3.toString());
    }

    public static void MuestraMensajePeso(Sol2 p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Sol2.PESO_IDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Sol2.INFRAPESO:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Sol2.SOBREPESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }

    public static void MuestraMayorDeEdad(Sol2 p) {

        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }

}
