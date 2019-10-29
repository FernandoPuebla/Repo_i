package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// Este programa cuenta los digitos de un número
        //TRUENA A PARTIR DE 11 DÍGITOS
        Scanner sc = new Scanner(System.in);
        int n = 0, r = 0, c = 0;

        System.out.println("Ingrese un número ");
        n = sc.nextInt();
        do
        {
            r = n / 10;
            n = r;
            c = c + 1;
        }while(r != 0);

        System.out.println("Tiene " + c +" digitos");
    }
}
