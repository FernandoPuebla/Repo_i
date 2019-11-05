package com.company;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();//Puede ponerse List al principio en vez

        doTimings("ArrayList", arrayList);  //Para añadir o eliminar los últimos items de mi lista
        doTimings("LinkedList", linkedList); //Para eliminar o añadir items de donde sea en la lista

    }

    private static void doTimings(String type, List<Integer> list)
    {
        for (int i = 0; i< 1E5;i++)
        {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        /*//Añadir items a la lista
        for (int i = 0; i< 1E5;i++)
        {
            list.add(i);
        }*/
        //AñDIR ITEMS DE DONDE SEA EN LA LISTA
        for (int i = 0; i <1E5; i++)
        {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Tiempo que tomó " + (end - start) + "ms para " + type);

    }
}
