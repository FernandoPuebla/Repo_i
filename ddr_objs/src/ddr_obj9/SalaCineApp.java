package ddr_obj9;

public class SalaCineApp
{

    public static void main(String[] args)
    {
      SalaCine sala1 = new SalaCine("starwars",50);
      Peliculas peli1 = new Peliculas("Star Wars", 150, 18, "George Lucas");
      Espectador morro1 = new Espectador("Pepe", 15,0);
      sala1.generarAsientos();


    }
}
