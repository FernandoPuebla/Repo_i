package com.company;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main
{

    public static void main(String[] args)
    {
	// (head) <- ooooooooooooo <-(taoil) FIFO(first in, first out)
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3); //max de 3 items

        q1.add(10);
        q1.add(20);
        q1.add(30);
        //q1.add(40);

        System.out.println("Head of the queue is " + q1.element());

        try {
            q1. add(40);

        } catch( IllegalStateException e)
        {
            System.out.println("Tried to add many items to the queue");
        }
        for(Integer value: q1)
        {
            System.out.println("Queue value: " + value);
        }
       /* Integer value;
        value = q1.remove();*/
        System.out.println("Removed from queue " + q1.remove());
        System.out.println("Removed from queue " + q1.remove());
        System.out.println("Removed from queue " + q1.remove());
        try
        {
            System.out.println("Removed from queue: " + q1.remove());
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Tried to remove too many items from queue");
        }
        ////////////////////////////////////////////////////////////////////
        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

        System.out.println("Queue 2 is peek: " + q2.peek());

        q2.add(10);
        q2.add(20);

        if (q2.offer(30) == false)
        {
            System.out.println("Offer failed to add third item");
        }

        for(Integer value: q2)
        {
            System.out.println("Queue value: " + value);
        }
        System.out.println("Queue 2 value is " + q2.poll());
        System.out.println("Queue 2 value is " + q2.poll());
        System.out.println("Queue 2 value is " + q2.poll());
    }
}
