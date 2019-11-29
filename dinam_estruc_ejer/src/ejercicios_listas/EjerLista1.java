package ejercicios_listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EjerLista1
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n,aux;
        char decision;
        List<Integer> lista= new ArrayList<Integer>();

        do
        {
            System.out.print("Ingrese el número a agregar ");
            n = sc.nextInt();
            lista.add(n);
            System.out.print("Presione s o S para salir ");
            decision = sc.next().charAt(0);
        }while(decision != 's' && decision != 'S');
        Iterator iter = lista.iterator();
        while (iter.hasNext())
        {
            System.out.print(iter.next() + " ");
        }

        aux = lista.get(3);
        lista.set(3,lista.get(1));
        lista.set(1,aux);
        System.out.println('\t');
        for(int i= 0; i < lista.size(); i++)
        {
            System.out.print(lista.get(i) + " ");
        }

    }
}
