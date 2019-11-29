package ejemplos_listas;

import java.util.ArrayList;
import java.util.Vector;

public class AniadirElementosFinalArrayList
{
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Irene");
        vector.add("María");
        ArrayList<String> al = new ArrayList<String>();
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");
        al.addAll(vector);
        for(int x=0;x<al.size();x++) {
            System.out.println(al.get(x));
        }

    }
}
