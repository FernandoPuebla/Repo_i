package ddr_obj14;

public class NoPerecedero extends Productos
{
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    private int tipo;

    public NoPerecedero(String nombre, double precio, int tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " tipo=" + tipo + '}';
    }


}
