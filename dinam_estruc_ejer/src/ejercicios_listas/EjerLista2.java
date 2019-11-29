package ejercicios_listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjerLista2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, aux,cant = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        do {
            System.out.print("Ingrese un número, si desea salir ingrese un número menor que cero: ");
            n = sc.nextInt();
            al.add(n);
        }
        while(n >= 0);
        for (int i = 0; i < al.size(); i++)
        {
            aux = al.get(i);
            for (int j = 0; j < al.size(); j++)
            {
                if (aux == al.get(j))
                {
                    cant++;
                    System.out.println(al.get(i) + " cant " + cant);
                    break;
                }
            }
            System.out.println(" je " + cant);
        }

    }


}
