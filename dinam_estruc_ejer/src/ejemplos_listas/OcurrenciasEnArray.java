package ejemplos_listas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OcurrenciasEnArray
{
    public static void main(String[] args)
    {
        int[] listaNumeros = {1,4,7,8,9,2,7,15,4,6,9,9,8};
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int x=0;x < listaNumeros.length;x++)
        {
            int clave = listaNumeros[x];
            if (hm.containsKey(clave))
                hm.put(clave, hm.get(clave)+1);
            else
                hm.put(clave,1);
        }
        Iterator <Map.Entry< Integer,Integer >> it = hm.entrySet().iterator();
        String vez;

        while (it.hasNext()) {
            Map.Entry<Integer,Integer> e = it.next();
            vez = (e.getValue()>1)?" veces":" vez";
            System.out.println("El número " + e.getKey() + " aparece " + e.getValue() + vez);
        }
    }
}
