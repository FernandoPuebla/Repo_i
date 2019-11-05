package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        System.out.println(numbers.get(0));
        System.out.println("Iteración #1 ");
        //Iteración del for
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }
        System.out.println("Iteración 2 ");

        //Remover datos de un ArrayList
        numbers.remove(numbers.size()-1);

        //El muy lento para remover
        numbers.remove(0);

        for (Integer value: numbers)
        {
            System.out.println(value);
        }

        //List interface
       List<String> values = new ArrayList<String>();
    }
}