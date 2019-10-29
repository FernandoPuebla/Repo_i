import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Coche
{
   /* private String marca;
    private String modelo;
    private int color;*/

    private List<Rueda> ruedas = null;
    private List<Motor> motores = null;
    private List<Puerta> puertas = null;

    public Coche()
    {
        ruedas = new ArrayList();
        for (int i= 0; i < 4; i++)
        {
            ruedas.add(new Rueda());

        }
        motores = new LinkedList();
        puertas = new ArrayList();

        motores.add(new Motor());

        for(int i = 0; i < 5;i++)
        {
            puertas.add(new Puerta());

        }
    }

}
