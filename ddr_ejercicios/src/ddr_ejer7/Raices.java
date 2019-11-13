package ddr_ejer7;

public class Raices
{
    private int a;
    private int b;
    private int c;

    public Raices(int aRaices, int bRaices, int cRaices)
    {
        a = aRaices;
        b = bRaices;
        c = cRaices;

    }

    public void obtenerRaices()
    {
        if (tieneRaices() == true)
        {
            calcular();
        }
    }
    public void obtenerRaiz()
    {
        if (tieneRaiz() == true)
        {
            calcular();
        }
    }
    public double getDiscriminante()
    {
        int dis = (b*b)-(4*a*c);
        System.out.println("El discriminante es ");
        return dis;
    }
    public boolean tieneRaices()
    {
        if (getDiscriminante() >= 0)
        {
            System.out.println("Tiene 2 soluciones");
            return true;
        }
        else return false;
    }
    public boolean tieneRaiz()
    {
        if (getDiscriminante() == 0)
        {
            System.out.println("Tiene 1 solución");
            return true;
        }
        else return false;
    }
    public void calcular()
    {
       if(tieneRaiz())
       {
           double raiz = 0;
           raiz = -b + (getDiscriminante()/(2*a));
           System.out.println("La raiz es " + raiz);
       }else if(tieneRaices())
       {
           double raizPositiva = 0, raizNegativa = 0;
           raizPositiva = -b + (getDiscriminante()/(2*a));
           System.out.println("La raiz positiva es " + raizPositiva);
           raizNegativa = -b - (getDiscriminante()/(2*a));
           System.out.println("La raiz negativa es " + raizNegativa);
       }else
           {
               System.out.println("ERROR, no hay solución");
           }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
