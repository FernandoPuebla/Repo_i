package ddr_obj4;

public class Electrodomestico
{
    protected static final String COLOR_DEF = "blanco";
    protected static final char CONSUMO_DEF = 'F';
    protected static final int PRECIO_DEF = 100;
    protected static final int PESO_DEF = 5;

    protected int precio;
    protected String color; //colores disponibles blanco,negro, rojo, azul, gris
    protected char consumo; //letras entre A y F
    protected int peso;

    public Electrodomestico()
    {
    this(PRECIO_DEF,PESO_DEF,CONSUMO_DEF,COLOR_DEF);
    }
    public Electrodomestico(int precioE, int pesoE)
    {
        int precio = precioE;
        int peso = pesoE;
    }
    public Electrodomestico(int precioE, int pesoE,char consumoE,String colorE )
    {
        int precio = precioE;
        int peso = pesoE;
        char consumo = consumoE;
        String color = colorE;
    }

    private void comprobarConsumoEnergetico(char letra)
    {
        letra = consumo;
        switch (letra)
        {
            case 'A':
                //precio += 100;//precio = 100;
                System.out.println("Su tarifa" + letra + " es de " + 100);
                break;
            case 'B':
                //precio = 80;//precio += 80;
                System.out.println("Su tarifa es de " + precio);
                break;
            case 'C':
                //precio = 60;//precio += 60;
                System.out.println("Su tarifa es de " + precio);
                break;
            case 'D':
                //precio = 50;//precio += 50;
                System.out.println("Su tarifa es de " + precio);
                break;
            case 'E':
                //precio = 30;//precio += 30;
                System.out.println("Su tarifa es de " + precio);
                break;
            case 'F':
                //precio = 10;//precio += 10;
                System.out.println("Su tarifa es de " + precio);
                break;
            default:
                System.out.println("Ingresó una tarifa incorrecta, se le asignará la tarifa por defecto " + PRECIO_DEF);//precio += 10;
            break;
        }
    }

    private void comprobarColor(String colorC)
    {
        colorC = color;
        switch (colorC)
        {
            case "blanco":
                System.out.println("Su lavadora es " + colorC);
                break;
            case "negro":
                System.out.println("Su lavadora es " + colorC);
                break;
            case "rojo":
                System.out.println("Su lavadora es " + colorC);
                break;
            case "azul":
                System.out.println("Su lavadora es " + colorC);
                break;
            case "gris":
                System.out.println("Su lavadora es " + colorC);
                break;
            default:

                System.out.println("Ingresó un color inválido,se le asignará el color por defecto  " + COLOR_DEF);
        }
    }
    public int precioFinal()//void
    {
        switch (consumo)
        {
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
                break;
            case 'D':
                precio += 50;
                break;
            case 'E':
                precio += 30;
                break;
            case 'F':
                precio += 10;
                break;
            default:
                precio += 10;
                break;
        }
        if(peso >= 0 && peso <= 19)
        {
             precio += 10;
        } else if(peso >= 20 && peso <= 49)
        {
            precio += 50;
        } else if(peso >= 50 && peso <= 79)
        {
            precio += 80;
        } else if(peso >= 80)
        {
            precio += 100;
        }
       return precio;
    }


    public int getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public int getPeso() {
        return peso;
    }
}
