package ddr_bas12;

public class DdrEjer12
{
    public static void main(String[] args) {
        System.out.println("Este programa meustra los numeros del 1 al 100 que son divisible entre 2 y 3");
        int num = 0;

        while(num < 100)
        {
            if (num % 2 == 0)
            {
                if ( num % 3 ==0)
                {
                    System.out.println(num);
                }
            }
            num++;
        }
    }
}
