package ddr_obj9;

public class SalaCineApp
{

    public static void main(String[] args)
    {
      SalaCine sala1 = new SalaCine("starwars",50);
      Peliculas peli1 = new Peliculas("Star Wars", 150, 18, "George Lucas");
      Espectador morro1 = new Espectador("Pepe", 19,51);
      sala1.generarAsientos();

      if(morro1.getDinero() >= sala1.getPrecio() && morro1.getEdad() > peli1.getEdadMin())
      {
          System.out.println("El morro puede pasar");
      }else System.out.println("Afuera morro, porque tienes " + morro1.getDinero() + " pesos, y la entrada cuesta " + sala1.getPrecio() + " pesos");

    }
}
