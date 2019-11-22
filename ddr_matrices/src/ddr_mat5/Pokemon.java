package ddr_mat5;

import java.util.Scanner;

public class Pokemon {//Tabla de tipos y tipos de Pokemon en constantes.java
    //Arrays : String tiposPokemon,String MENSAJES_EFICACIAS,double efectividadesPokemon
    public static Scanner sc = new Scanner(System.in);
    public static final int cantTiposDePokemon = Constantes.tiposPokemon.length;
    public static final int cantidadMensajesEficacias = Constantes.MENSAJES_EFICACIAS.length;
    public static final int filEfectividadesPokemon = Constantes.efectividadesPokemon.length;
    public static final int colEfectividadesPokemon = Constantes.efectividadesPokemon[0].length;

    public static void main(String[] args) {
        //mostrarDatosConstantes();
        mostrarDebilidades();
    }

    public static void mostrarDatosConstantes() {
        /*System.out.println("Son " + cantTiposDePokemon + " tipos de Pokemon");
        for (int i = 0; i < cantTiposDePokemon; i++) {
            System.out.print(Constantes.tiposPokemon[i] + ", ");
        }
        System.out.println('\n');
         */

        System.out.println("Son " + cantidadMensajesEficacias + " mensajes de eficacia");
        for (int i = 0; i < cantidadMensajesEficacias; i++) {
            System.out.print(Constantes.MENSAJES_EFICACIAS[i] + ", ");
        }
        System.out.println('\n');
        System.out.println("Son " + filEfectividadesPokemon + " filas de efectividad");
        System.out.println("Son " + colEfectividadesPokemon + " columnas de efectividad");
    }

    public static void mostrarDebilidades() {
        int cantidad, efec = 0;
        String tipo;
        System.out.println("Para mostrar sus debilidades, elija un tipo de Pokemon, son " + cantTiposDePokemon + " tipos de Pokemon");
        for (int i = 0; i < cantTiposDePokemon; i++) {
            System.out.print(Constantes.tiposPokemon[i] + ", ");
        }
        System.out.println('\t');
        System.out.print("Ingrese el tipo: ");
        tipo = sc.next();
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
                System.out.println("Los Pokemones que son eficaces contra este tipo son: ");
                for (int j = 0; j < filEfectividadesPokemon;j++)
                {
                    if(Constantes.efectividadesPokemon[efec][j] == 2 )
                    {
                        System.out.println(Constantes.tiposPokemon[j] + " ");
                        //System.out.println(" Es muy efectivo");
                    }
                }
                break;
            }
        }

    }
        public static void mostrarTodosLosEficaces () {

        }
        public static void mostratTodaLaInfo () {

        }
        public static void mostratTodaLaInfoRelativa () {

        }
        public static void mostratEficaciaDeUnTipoAOtro () {

        }
    }
