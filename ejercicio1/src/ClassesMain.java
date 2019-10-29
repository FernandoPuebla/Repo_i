public class ClassesMain
{
    public static void main(String[] args)
    {
        Car ferrari = new Car(); //Creando la clase
        ferrari.model = "Ferrari F430";
        ferrari.color = "Blue";  //Le damos un valor
        ferrari.seats = 4;
        ferrari.display();

        Car tesla = new Car();
        tesla.model = "Nikola T5";
        tesla.color = "Red";
        tesla.seats = 2;
        tesla.display();

        Car audi = new Car();
        audi.model = "Audi Sq5";
        audi.color = "Silver";
        audi.seats = 4;
        audi.display();

        //Object declaration and memory allocation
        Car test; //declara el objeto
        test = new Car();   //aloja memoria en esa variable

        //Metodos para inicializar una variable
        Car c = new Car();
        Car c1 = new Car();
        c.initialize("Bugatti", "verde", 3);
        c.display();


    }

}
