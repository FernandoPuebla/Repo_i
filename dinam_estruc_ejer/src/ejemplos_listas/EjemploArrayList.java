package ejemplos_listas;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploArrayList
{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Victor");
        al.add("Von");
        al.add("Strangulo");
        Iterator<String> it= al.iterator();
        /*while(it.hasNext())
        {
            System.out.println(it.next());
        }
         */

        al.set(1,"re");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

}
