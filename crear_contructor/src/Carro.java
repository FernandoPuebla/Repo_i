public class Carro
{
    //declaración de atributos
    private String modelo;
    private String color;
    private int asientos;

    //constructores
    private Carro(String modelo, String color, int asientos) // el constructor por defecto no tiene parámetros
    {
        this.modelo = "";
        this.color = "";
        this.asientos = 0;
    }

    public static void main(String[] args)
    {
        Carro coche = new Carro("Bugatti","dorado",4);
        coche.display();
    }
    //Métodos
    public void display()
    {
        System.out.println("El modelo es " + modelo);
        System.out.println("El color es " + color);
        System.out.println("Los asientos son " + asientos);
    }

}
