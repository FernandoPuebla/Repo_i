package ddr_obj7;

public class Raices
{
    private int a;
    private int b;
    private int c;

    public Raices(int aR,int bR,int cR)
    {
        a = aR;
        b = bR;
        c = cR;
    }

    public static void main(String[] args) {
        Raices poli = new Raices(3,2,1);
        poli.calcular();
    }


    public void obtenerRaices()
    {
        calcular();
    }
    public void obtenerRaiz()
    {
        calcular();
    }
    public double getDiscriminante()
    {
        double discriminante;

        discriminante = Math.pow(b,2)-(4*a*c);

        return discriminante;
    }
    public boolean tieneRaices()
    {
        if((int)getDiscriminante() >= 0)
        {
            return true;
        }        else return false;
    }
    public boolean tieneRaiz()
    {
        if((int)getDiscriminante() == 0)
        {
            return true;
        }        else return false;
    }
    public void calcular()
    {
        double raiz1,raiz2;

        if(tieneRaiz() == true)
        {
            raiz1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
            System.out.println("Su raíz es: " + raiz1);
        }else if (tieneRaices() == true)
        {
            raiz1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
            raiz2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);
            System.out.println("Su raíz 1 es: " + raiz1);
            System.out.println("Su raíz 2 es: " + raiz2);
        }else
            System.out.println("No tiene solución");
    }

}
