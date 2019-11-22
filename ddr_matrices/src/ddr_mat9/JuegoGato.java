package ddr_mat9;

import java.util.Scanner;

public class JuegoGato
{
    //NO IMPRIME EL EMPATE
    private final static char CRUZ = 'x',CIRC = 'o', DEF = '-';
    private static char gato[][] = new char[3][3];
    private static char jug1,jug2;
    private static boolean ganador = false;

    public static void main(String[] args)
    {
        int c = 0;
        crearTablero();
        elegirJugador();
        for (int i = 0;i < 4;i++)
        {
            c = i;
            marcar(jug1);
            if(c == 4)
            {
                System.out.println("Empate");
                break;
            }
            contarFilas();
            if(ganador == true)
            {
                break;
            }
            contarCols();
            if(ganador == true)
            {
                break;
            }
            contarDiagPrin();
            if(ganador == true)
            {
                break;
            }
            contarDiagInv();
            if(ganador == true)
            {
                break;
            }
            marcar(jug2);
            contarFilas();
            if(ganador == true)
            {
                break;
            }
            contarCols();
            if(ganador == true)
            {
                break;
            }
            contarDiagPrin();
            if(ganador == true)
            {
                break;
            }
            contarDiagInv();
            if(ganador == true)
            {
                break;
            }
        }
    }

    public static void crearTablero()
    {
        for (int i = 0; i < gato.length;i++)
        {
            for (int j = 0; j < gato[0].length;j++)
            {
                gato[i][j] = DEF;
                System.out.print(gato[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void elegirJugador()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija una marca jugador 1: x / o");
        jug1 = sc.next().charAt(0);
        while(jug1 != CRUZ && jug1 != 'X' && jug1 != CIRC && jug1 != 'O')
        {
            System.out.println("Ingrese una marca válida, x | o");
            jug1 = sc.next().charAt(0);
        }
        if(jug1 == CRUZ || jug1 == 'X')
        {
            System.out.println("El jugador 1 eligió: " + jug1);
            jug2 = CIRC;
            System.out.println("El jugador 2 es: " + jug2);
        }else if(jug1 == CIRC || jug1 == 'O')
        {
            System.out.println("El jugador 1 eligió: " + jug1);
            jug2 = CRUZ;
            System.out.println("El jugador 2 es: " + jug2);
        }
    }
    public static void marcar(int jug)
    {
        Scanner sc = new Scanner(System.in);
        int fil = 0, col = 0;
        char marca;
        System.out.println("Seleccione donde desea colocar su marca, las filas y columnas se cuentan de izq a der y de arriba a abajo empezando por 1");
        System.out.print("Fila ");
        fil = (sc.nextInt() - 1);
        while(fil < 0)
        {
            System.out.println("Ingrese un valor mayor que 0");
            fil = (sc.nextInt() - 1);
        }
        System.out.print("Columna ");
        col = (sc.nextInt() - 1);
        while(col < 0)
        {
            System.out.println("Ingrese un valor mayor que 0");
            col = (sc.nextInt() - 1);
        }

        if (jug == CRUZ)
        {
            while(gato[fil][col] == CIRC || gato[fil][col] == CRUZ)
            {
                System.out.println("Fila ocupada, escoga otra fila");System.out.println("Seleccione donde desea colocar su marca, las filas y columnas se cuentan de izq a der y de arriba a abajo empezando por 1");
                System.out.print("Fila ");
                fil = (sc.nextInt() - 1);
                while(fil < 0)
                {
                    System.out.println("Ingrese un valor mayor que 0");
                    fil = (sc.nextInt() - 1);
                }
                System.out.print("Columna ");
                col = (sc.nextInt() - 1);
                while(col < 0)
                {
                    System.out.println("Ingrese un valor mayor que 0");
                    col = (sc.nextInt() - 1);
                }
            }
            gato[fil][col] = CRUZ;
        }
        else  if (jug == CIRC)
        {
                while(gato[fil][col] == CIRC || gato[fil][col] == CRUZ)
                {
                    System.out.println("Fila ocupada, escoga otra fila");System.out.println("Seleccione donde desea colocar su marca, las filas y columnas se cuentan de izq a der y de arriba a abajo empezando por 1");
                    System.out.print("Fila ");
                    fil = (sc.nextInt() - 1);
                    while(fil < 0)
                    {
                        System.out.println("Ingrese un valor mayor que 0");
                        fil = (sc.nextInt() - 1);
                    }
                    System.out.print("Columna ");
                    col = (sc.nextInt() - 1);
                    while(col < 0)
                    {
                        System.out.println("Ingrese un valor mayor que 0");
                        col = (sc.nextInt() - 1);
                    }
                }
            gato[fil][col] = CIRC;
        }
        for (int i = 0; i < gato.length;i++)
        {
            for (int j = 0; j < gato[0].length;j++)
            {
                System.out.print(gato[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void contarFilas()
    {
        int contCruz = 0, contCirc = 0;
        for (int i = 0; i < gato.length;i++)
        {
            for (int j = 0; j < gato[0].length;j++)
            {
                if(gato[i][j] == CRUZ)
                {
                    contCruz++;
                }
                else if(gato[i][j] == CIRC)
                {
                    contCirc++;
                }
            }if(contCruz == 3)
                {
            System.out.println("Ganaste " + CRUZ);
            ganador = true;
            break;
                }else if(contCirc == 3)
        {
            System.out.println("Ganaste " + CIRC);
            ganador = true;
            break;
        }
            else {contCruz = 0; contCirc = 0;}
        }
    }
    public static void contarCols()
    {
        int contCruz = 0, contCirc = 0;
        for (int i = 0; i < gato.length;i++)
        {
            for (int j = 0; j < gato[0].length;j++)
            {
                if(gato[j][i] == CRUZ)
                {
                    contCruz++;
                }
                else if(gato[j][i] == CIRC)
                {
                    contCirc++;
                }
            }if(contCruz == 3)
        {
            System.out.println("Ganaste " + CRUZ);
            ganador = true;
            break;
        }else if(contCirc == 3)
            {
                System.out.println("Ganaste " + CIRC);
                ganador = true;
                break;
            }
        else {contCruz = 0;contCirc = 0;}
        }
    }
    public static void contarDiagPrin() {
        int contCruz = 0, contCirc = 0;
        for (int i = 0; i < gato.length; i++) {
            if (gato[i][i] == CRUZ) {
                contCruz++;
            } else if (gato[i][i] == CIRC) {
                contCirc++;
            }
        }if (contCruz == 3) {
            System.out.println("Ganaste " + CRUZ);
            ganador = true;
        }else  if (contCirc == 3) {
            System.out.println("Ganaste " + contCirc);
            ganador = true;
        }
        else {contCruz = 0;contCirc = 0;}
    }
    public static void contarDiagInv() {
        int contCruz = 0,contCirc = 0, j = (gato.length-1);
        for (int i = 0; i < gato.length; i++) {
            if (gato[i][j] == CRUZ) {
                contCruz++;
            }else if (gato[i][j] == CIRC) {
                contCirc++;
            }
                j--;

        }if (contCruz == 3) {
            System.out.println("Ganaste " + CRUZ);
            ganador = true;
        }else if (contCirc == 3) {
            System.out.println("Ganaste " + contCirc);
            ganador = true;
        } else {contCruz = 0;contCirc = 0;}
    }


}


