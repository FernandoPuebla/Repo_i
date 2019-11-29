package ejemplos_listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjemploLista {

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Marco");
        list.add("Polo");
        list.add("Repe");

        Iterator iter = list.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
