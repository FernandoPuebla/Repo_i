package ddr_bas36;

import java.util.Scanner;

public class EnumModAnt
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana");
        String dia = sn.next();

        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());

        System.out.println(diaS.toString());

    }
    public enum DiasSemana
    {
        LUNES(true),
        MARTES(true),
        MIERCOLES(true),
        JUEVES(true),
        VIERNES(true),
        SABADO(false),
        DOMINGO(false);

        private boolean laborable;

        private DiasSemana(boolean laborable)
        {
            this.laborable = laborable;
        }

        @Override
        public String toString()
        {
            if(laborable)
            {
                return "El dia "+ this.name().toLowerCase() +" es laborable";
            }else
                {
                return "El dia "+  this.name().toLowerCase() +" no es laborable";
            }
        }
}
}
