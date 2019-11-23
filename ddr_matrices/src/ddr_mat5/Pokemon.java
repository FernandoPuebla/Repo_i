package ddr_mat5;

import java.util.Scanner;
import java.lang.Double;

import static java.lang.Double.compare;

public class Pokemon {//Tabla de tipos y tipos de Pokemon en constantes.java
    //Arrays : String tiposPokemon,String MENSAJES_EFICACIAS,double efectividadesPokemon
    public static Scanner sc = new Scanner(System.in);
    public static final int cantTiposDePokemon = Constantes.tiposPokemon.length;
    public static final int cantidadMensajesEficacias = Constantes.MENSAJES_EFICACIAS.length;
    public static final int filEfectividadesPokemon = Constantes.efectividadesPokemon.length;
    public static final int colEfectividadesPokemon = Constantes.efectividadesPokemon[0].length;

    public static void main(String[] args) {
        int opcion;
        System.out.print("Elija la opción que desee" + '\n' + "1- mostrarDatosConstantes"
                + '\n' + "2- mostrarDebilidades" + '\n' + "3- mostrarTodosLosEficaces"
                + '\n' + "4- mostrarTodaLaInfoRelativa" + '\n' + "5- mostrarEficaciaDeUnTipoAOtro"
                + '\n' + "Opción: ");
        opcion = sc.nextInt();
        switch (opcion)
        {
            case 1: mostrarDatosConstantes();
                break;
                case 2:mostrarDebilidades();
                break;
            case 3:mostrarTodosLosEficaces();
                break;
            case 4: mostrarTodaLaInfoRelativa();
            break;
            case 5:mostrarEficaciaDeUnTipoAOtro();
                break;
        }

    }

    public static void mostrarDatosConstantes() {
        System.out.println("Son " + cantTiposDePokemon + " tipos de Pokemon");
        for (int i = 0; i < cantTiposDePokemon; i++) {
            System.out.print(Constantes.tiposPokemon[i] + ", ");
        }
        System.out.println('\n');

        System.out.println("Son " + cantidadMensajesEficacias + " mensajes de eficacia");
        for (int i = 0; i < cantidadMensajesEficacias; i++) {
            System.out.print(Constantes.MENSAJES_EFICACIAS[i] + ", ");
        }
        System.out.println('\n');
        System.out.println("Son " + filEfectividadesPokemon + " filas de efectividad");
        System.out.println("Son " + colEfectividadesPokemon + " columnas de efectividad");
    }

    public static void mostrarDebilidades() { //FALTA QUE SE PIDAN 2 TIPOS, FUNCIONA PARA UN TIPO
        int efec = 0, cant;
        String tipo, tipoAux;
        System.out.println("Para mostrar sus debilidades, elija un tipo de Pokemon, son " + cantTiposDePokemon + " tipos de Pokemon");
        for (int i = 0; i < cantTiposDePokemon; i++) {
            System.out.print(Constantes.tiposPokemon[i] + ", ");
        }
        System.out.println('\t');

        System.out.println("Ingrese cuántos tipos va a consultar");
        cant = sc.nextInt();
        if(cant == 1)
        {
            System.out.print("Ingrese el tipo: ");
            tipo = sc.next().toUpperCase();
            switch (tipo)
            {
                case "ACERO":
                    efec = 0;
                    break;
                case "AGUA":
                    efec = 1;
                    break;
                case "BICHO":
                    efec = 2;
                    break;
                case "DRAGON":
                    efec = 3;
                    break;
                case "ELECTRICO":
                    efec = 4;
                    break;
                case "FANTASMA":
                    efec = 5;
                    break;
                case "FUEGO":
                    efec = 6;
                    break;
                case "HADA":
                    efec = 7;
                    break;
                case "HIELO":
                    efec = 8;
                    break;
                case "LUCHA":
                    efec = 9;
                    break;
                case "NORMAL":
                    efec = 10;
                    break;
                case "PLANTA":
                    efec = 11;
                    break;
                case "PSIQUICO":
                    efec = 12;
                    break;
                case "ROCA":
                    efec = 13;
                    break;
                case "SINIESTRO":
                    efec = 14;
                    break;
                case "TIERRA":
                    efec = 15;
                    break;
                case "VENENO":
                    efec = 16;
                    break;
                case "VOLADOR":
                    efec = 17;
                    break;
            }

            for (int i = 0; i < cantTiposDePokemon; i++)
            {
                if (tipo.equals(Constantes.tiposPokemon[i]))
                {
                    System.out.println(Constantes.MENSAJES_EFICACIAS[0] + " contra");
                    for (int j = 0; j < filEfectividadesPokemon;j++)
                    {
                        if(Constantes.efectividadesPokemon[j][efec] == 2 )
                        {
                            System.out.println(Constantes.tiposPokemon[j] + " ");
                        }
                    }
                    break;
                }
            }
        }else if(cant == 2) // HAY QUE REVISAR PORQUÉ NO IMPRIME CUANDO SON 2, PROBABLEMENTE ES POR LA CONDICIÓN DEL IF
        {
             System.out.print("Ingrese el tipo 1: ");
             tipo = sc.next().toUpperCase();
            tipoAux = tipo;
            switch (tipoAux)
            {
                case "ACERO":
                    efec = 0;
                    break;
                case "AGUA":
                    efec = 1;
                    break;
                case "BICHO":
                    efec = 2;
                    break;
                case "DRAGON":
                    efec = 3;
                    break;
                case "ELECTRICO":
                    efec = 4;
                    break;
                case "FANTASMA":
                    efec = 5;
                    break;
                case "FUEGO":
                    efec = 6;
                    break;
                case "HADA":
                    efec = 7;
                    break;
                case "HIELO":
                    efec = 8;
                    break;
                case "LUCHA":
                    efec = 9;
                    break;
                case "NORMAL":
                    efec = 10;
                    break;
                case "PLANTA":
                    efec = 11;
                    break;
                case "PSIQUICO":
                    efec = 12;
                    break;
                case "ROCA":
                    efec = 13;
                    break;
                case "SINIESTRO":
                    efec = 14;
                    break;
                case "TIERRA":
                    efec = 15;
                    break;
                case "VENENO":
                    efec = 16;
                    break;
                case "VOLADOR":
                    efec = 17;
                    break;
            }
            System.out.print("Ingrese el tipo 2: ");
            tipo = sc.next().toUpperCase();
            switch (tipo)
            {
                case "ACERO":
                    efec = 0;
                    break;
                case "AGUA":
                    efec = 1;
                    break;
                case "BICHO":
                    efec = 2;
                    break;
                case "DRAGON":
                    efec = 3;
                    break;
                case "ELECTRICO":
                    efec = 4;
                    break;
                case "FANTASMA":
                    efec = 5;
                    break;
                case "FUEGO":
                    efec = 6;
                    break;
                case "HADA":
                    efec = 7;
                    break;
                case "HIELO":
                    efec = 8;
                    break;
                case "LUCHA":
                    efec = 9;
                    break;
                case "NORMAL":
                    efec = 10;
                    break;
                case "PLANTA":
                    efec = 11;
                    break;
                case "PSIQUICO":
                    efec = 12;
                    break;
                case "ROCA":
                    efec = 13;
                    break;
                case "SINIESTRO":
                    efec = 14;
                    break;
                case "TIERRA":
                    efec = 15;
                    break;
                case "VENENO":
                    efec = 16;
                    break;
                case "VOLADOR":
                    efec = 17;
                    break;
            }

            for (int i = 0; i < cantTiposDePokemon; i++)
            {
                if (tipo.equals(Constantes.tiposPokemon[i]) && tipoAux.equals(Constantes.tiposPokemon[i]))
                {
                    System.out.println("Los Pokemones que son eficaces contra este tipo son: ");
                    for (int j = 0; j < filEfectividadesPokemon;j++)
                    {
                        if(Constantes.efectividadesPokemon[j][efec] == 2 )
                        {
                            System.out.println(Constantes.tiposPokemon[j] + " x" + (Constantes.efectividadesPokemon[j][efec]*2));
                        }
                    }
                    break;
                }
            }

        }

    }
    public static void mostrarTodosLosEficaces () {
            int efec = 0, cant;
            String tipo;
        for (int i = 0; i < cantTiposDePokemon; i++) {
            System.out.print(Constantes.tiposPokemon[i] + ", ");
        }
        System.out.println('\5');
            System.out.println("Ingrese un tipo: ");
            tipo = sc.next().toUpperCase();
            switch (tipo)
            {
                case "ACERO":
                    efec = 0;
                    break;
                case "AGUA":
                    efec = 1;
                    break;
                case "BICHO":
                    efec = 2;
                    break;
                case "DRAGON":
                    efec = 3;
                    break;
                case "ELECTRICO":
                    efec = 4;
                    break;
                case "FANTASMA":
                    efec = 5;
                    break;
                case "FUEGO":
                    efec = 6;
                    break;
                case "HADA":
                    efec = 7;
                    break;
                case "HIELO":
                    efec = 8;
                    break;
                case "LUCHA":
                    efec = 9;
                    break;
                case "NORMAL":
                    efec = 10;
                    break;
                case "PLANTA":
                    efec = 11;
                    break;
                case "PSIQUICO":
                    efec = 12;
                    break;
                case "ROCA":
                    efec = 13;
                    break;
                case "SINIESTRO":
                    efec = 14;
                    break;
                case "TIERRA":
                    efec = 15;
                    break;
                case "VENENO":
                    efec = 16;
                    break;
                case "VOLADOR":
                    efec = 17;
                    break;
            }

            for (int i = 0; i < cantTiposDePokemon; i++)
            {
                if (tipo.equals(Constantes.tiposPokemon[i]))
                {
                    System.out.println(Constantes.MENSAJES_EFICACIAS[2]);
                    for (int j = 0; j < filEfectividadesPokemon;j++)
                    {
                        if(Constantes.efectividadesPokemon[efec][j] == 2 )
                        {
                            System.out.println(Constantes.tiposPokemon[j] + " ");
                        }
                    }
                    break;
                }
            }
        }
        //public static void mostrarTodaLaInfo () {}
        public static void mostrarTodaLaInfoRelativa () {
            int efec = 0;
            String tipo;
            for (int i = 0; i < cantTiposDePokemon; i++) {
                System.out.print(Constantes.tiposPokemon[i] + ", ");
            }
            System.out.println('\t');
            System.out.println("Ingrese un tipo: ");
            tipo = sc.next().toUpperCase();
            switch (tipo)
            {
                case "ACERO":
                    efec = 0;
                    break;
                case "AGUA":
                    efec = 1;
                    break;
                case "BICHO":
                    efec = 2;
                    break;
                case "DRAGON":
                    efec = 3;
                    break;
                case "ELECTRICO":
                    efec = 4;
                    break;
                case "FANTASMA":
                    efec = 5;
                    break;
                case "FUEGO":
                    efec = 6;
                    break;
                case "HADA":
                    efec = 7;
                    break;
                case "HIELO":
                    efec = 8;
                    break;
                case "LUCHA":
                    efec = 9;
                    break;
                case "NORMAL":
                    efec = 10;
                    break;
                case "PLANTA":
                    efec = 11;
                    break;
                case "PSIQUICO":
                    efec = 12;
                    break;
                case "ROCA":
                    efec = 13;
                    break;
                case "SINIESTRO":
                    efec = 14;
                    break;
                case "TIERRA":
                    efec = 15;
                    break;
                case "VENENO":
                    efec = 16;
                    break;
                case "VOLADOR":
                    efec = 17;
                    break;
            }

            for (int i = 0; i < cantTiposDePokemon; i++)
            {
                if (tipo.equals(Constantes.tiposPokemon[i]))
                {

                    for (int j = 0; j < filEfectividadesPokemon;j++)
                    {

                        if(Constantes.efectividadesPokemon[efec][j] == Constantes.EFICACIA_NA)
                        {
                            System.out.println(Constantes.tiposPokemon[j] + " " + Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_NA]);
                        }
                        else if(Constantes.efectividadesPokemon[efec][j] == Constantes.EFICACIA_DNE)
                        {
                            System.out.println(Constantes.tiposPokemon[j] + " " + Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_DNE]);
                        }else if(Constantes.efectividadesPokemon[efec][j] == Constantes.EFICACIA_NME)
                        {
                            System.out.println(Constantes.tiposPokemon[j] + " " + Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_NME]);
                        }else if(Constantes.efectividadesPokemon[efec][j] == Constantes.EFICACIA_NEUTRO)
                        {
                            System.out.println(Constantes.tiposPokemon[j] + " " + Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_NEUTRO]);
                        }else if(Constantes.efectividadesPokemon[efec][j] == Constantes.EFICACIA_EME)
                        {
                            System.out.println(Constantes.tiposPokemon[j] + " " + Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_EME]);
                        }else if(Constantes.efectividadesPokemon[efec][j] == Constantes.EFICACIA_DE)
                        {
                            System.out.println(Constantes.tiposPokemon[j] + " " + Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_DE]);
                        }

                    }
                    break;
                }
            }
        }
        public static void mostrarEficaciaDeUnTipoAOtro () {
            int efec = 0,efec1 = 0;
            String atacante, oponente;
            for (int i = 0; i < cantTiposDePokemon; i++) {
                System.out.print(Constantes.tiposPokemon[i] + ", ");
            }
            System.out.println('\t');
            System.out.println("Ingrese al atacante: ");
            atacante = sc.next().toUpperCase();
            switch (atacante)
            {
                case "ACERO":
                    efec = 0;
                    break;
                case "AGUA":
                    efec = 1;
                    break;
                case "BICHO":
                    efec = 2;
                    break;
                case "DRAGON":
                    efec = 3;
                    break;
                case "ELECTRICO":
                    efec = 4;
                    break;
                case "FANTASMA":
                    efec = 5;
                    break;
                case "FUEGO":
                    efec = 6;
                    break;
                case "HADA":
                    efec = 7;
                    break;
                case "HIELO":
                    efec = 8;
                    break;
                case "LUCHA":
                    efec = 9;
                    break;
                case "NORMAL":
                    efec = 10;
                    break;
                case "PLANTA":
                    efec = 11;
                    break;
                case "PSIQUICO":
                    efec = 12;
                    break;
                case "ROCA":
                    efec = 13;
                    break;
                case "SINIESTRO":
                    efec = 14;
                    break;
                case "TIERRA":
                    efec = 15;
                    break;
                case "VENENO":
                    efec = 16;
                    break;
                case "VOLADOR":
                    efec = 17;
                    break;
            }
            System.out.println("Ingrese al oponente: ");
            oponente = sc.next().toUpperCase();
            switch (oponente)
            {
                case "ACERO":
                    efec1 = 0;
                    break;
                case "AGUA":
                    efec1 = 1;
                    break;
                case "BICHO":
                    efec1 = 2;
                    break;
                case "DRAGON":
                    efec1 = 3;
                    break;
                case "ELECTRICO":
                    efec1 = 4;
                    break;
                case "FANTASMA":
                    efec1 = 5;
                    break;
                case "FUEGO":
                    efec1 = 6;
                    break;
                case "HADA":
                    efec1 = 7;
                    break;
                case "HIELO":
                    efec1 = 8;
                    break;
                case "LUCHA":
                    efec1 = 9;
                    break;
                case "NORMAL":
                    efec1 = 10;
                    break;
                case "PLANTA":
                    efec1 = 11;
                    break;
                case "PSIQUICO":
                    efec1 = 12;
                    break;
                case "ROCA":
                    efec1 = 13;
                    break;
                case "SINIESTRO":
                    efec1 = 14;
                    break;
                case "TIERRA":
                    efec1 = 15;
                    break;
                case "VENENO":
                    efec1 = 16;
                    break;
                case "VOLADOR":
                    efec1 = 17;
                    break;
            }
            if( Constantes.efectividadesPokemon[efec][efec1] == 0)
            {
                System.out.println(Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_NA]);
            }
            else if( Constantes.efectividadesPokemon[efec][efec1] == 1)
            {
                System.out.println(Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_NEUTRO]);
            }else if( Constantes.efectividadesPokemon[efec][efec1] == 2)
            {
                System.out.println(Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_EME]);
            }

        }
    }
