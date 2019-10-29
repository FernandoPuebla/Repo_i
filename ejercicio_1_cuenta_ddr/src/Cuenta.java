public class Cuenta
{
    //Variables
    private String titular;
    private float cantidad;

    //Constructores
    public Cuenta(String cantidad)
    {
        this(getTitular(),0);
    }

    public Cuenta(String titular, float cantidad)
    {
        this.setTitular(titular);
        //Si la cantidad es menor que cero, se pone cero
        if( cantidad < 0)
        {
            this.setCantidad(0);
        } else
        {
            this.setCantidad(cantidad);
        }
    }
    //Métodos
    public String getTitular()
    {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    // Ingresa dinero a la cuenta si tienes dinero
    public void

}
