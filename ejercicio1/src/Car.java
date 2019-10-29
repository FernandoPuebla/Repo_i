public class Car
{
    public String model;
    public String color;
    public int seats;

    public void display()
    {
        System.out.println("Model is : " + model);
        System.out.println("Color is : " + color);
        System.out.println("Seats are : " + seats);
    }
    public void initialize(String model_s,String color_t, int i)
    {
        model = model_s;
        color = color_t;
        seats = i;
    }


}
