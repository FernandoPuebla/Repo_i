package ddr_obj9;

public class SalaCine
{
    private String pelicula;
    private int precio;
    private char car = 65;
    private int[][] asientos = new int[9][9];

    public SalaCine(String peliculaS, int precioS)
    {
        pelicula = peliculaS;
        precio = precioS;
    }

    public void generarAsientos()
    {
        for (int i = 7; i >= 0; i--)
        {
            for (int j = 8; j >= 0; j--)
            {
                asientos[i][j] = (int) (Math.random()*2);
                System.out.print( (i+1) + "" + (car++) + " " + asientos[i][j] + " ");
            }
            car = 65;
            System.out.println(" ");
        }
    }


    public int getPrecio() {
        return precio;
    }

    public int[][] getAsientos() {
        return asientos;
    }
}
