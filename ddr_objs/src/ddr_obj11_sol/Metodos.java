package ddr_obj11_sol;

public class Metodos
{
    /**
     * Genera un numero aleatorio entre un minimo y un maximo
     * @param minimo
     * @param maximo
     * @return
     */
    public static int generaNumeroAleatorio(int minimo, int maximo){
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
}
