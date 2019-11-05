package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args)
    {
       //HashSet no tiene un orden
        //Set<String> set1 = new HashSet<String>();

        //LinkedHasSet mantiene el orden en que agregas items
        //Set<String> set1 = new LinkedHashSet<String>()

        //TreeSet lo ordena en un orden natural
        Set<String>  set1 = new TreeSet<String>();
        if (set1.isEmpty())
        {
            System.out.println("Set is empty at start");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");
        if (set1.isEmpty())
        {
            System.out.println("Set is empty after adding (no!)");
        }

        //Añadir items duplicados genera un error
        System.out.println(set1);

        //Iteración
        for (String elemnt: set1)
        {
            System.out.println(elemnt);
        }
        //Set contiene un item?
        if (set1.contains("aasdasd"))
        {
            System.out.println("Contiene aasdasd");
        }
        if (set1.contains("cat"))
        {
            System.out.println("Contiene cat");
        }
    }
}
