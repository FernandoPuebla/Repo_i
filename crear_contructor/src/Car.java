public class Car
{
    //Declaración de atributos
    public  String model;
    public  String color;
    public  int seats;

    //Declaración del constructor
    void Car(String model, String color, int seats)
    {
        this.model = model;
        this.color = color;
        this.seats = seats;
    }
    public  void main(String[] args)
    {
       // Car c = new Car(); //Inicializa un objeto

    }
    public static void display()
    {
        System.out.println("Model is: " + model );
        System.out.println("Color is: " + color );
        System.out.println("Seats is: " + seats );
    }
}
