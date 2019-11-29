package ejemplos_listas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EjemploMap
{
    public static void main(String[] args) {
        Map<String,String> hm = new HashMap<String,String>();
        hm.put("1","Luis");
        hm.put("2","Lucho");
        hm.put("3","Wis");

        Iterator it = hm.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
