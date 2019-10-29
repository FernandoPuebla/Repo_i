package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// juego de piedra papel o tijera
        Scanner sc = new Scanner(System.in);
        char r1 = ' ',r2 = ' ';
        System.out.println("j1");
        r1 = sc.next().charAt(0);
        System.out.println("j2");
        r2 =sc.next().charAt(0);

        if(r1 == 'P' && r2 == 'P')
            System.out.println("Empate");

    }
}
