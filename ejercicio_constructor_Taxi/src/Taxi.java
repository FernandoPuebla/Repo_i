public class Taxi
{
    private String ciudad; // Ciudad de cada objeto Taxi
    private String matricula; // Matrícula de cada objeto Taxi
    private String distrito; // Distrito asignado a cada objeto Taxi
    private int tipoMotor; //Tipo de motor asignado a cada objeto taxi 0 = desconocido, 1 = gasolina, 2 = diesel

    // Constructor, cuando se cree un objeto taxi se ejecutará el código que incluyamos en el constructor
    public Taxi(String valorMatricula,String valorDistrito, int valorTipoMotor)
    {
        ciudad = "México DF";
        matricula = valorMatricula;
        distrito = valorDistrito;
        tipoMotor = valorTipoMotor;
    }// Cierre del constructor

    public static void main(String[] args)
    {

    }


    //Método para obtener la matrícula taxi, el distrito, el tipo de motor
    public String getMatricula()
    {
        return matricula;
    }

    public String getDistrito()
    {
        return distrito;
    }

    public int getTipoMotor()
    {
        return tipoMotor;
    }


}
