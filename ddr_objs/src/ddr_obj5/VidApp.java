package ddr_obj5;

public class VidApp
{
    public static void main(String[]args){
        Serie series[]  = new Serie[5];
        Videojuego videojuegos[] = new Videojuego[5];

        series[0] = new Serie();
        series[1] = new Serie("Juego de tronos", "George R. R. Martin ");
        series[2] = new Serie("Los Simpsons", 25, "Humor", "Matt Groening");
        series[3] = new Serie("Padre de familia", 12 ,"Humor", "Seth MacFarlane");
        series[4] = new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");

        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("Assassins Creed", 30, "Aventura", "EAx");
        videojuegos[2] = new Videojuego("God of war 3", 12, "asd", "");
        videojuegos[3] = new Videojuego("Super Mario 3DS", 30, "Plataforma", "Nintendo");
        videojuegos[4] = new Videojuego("Final fantasy X", 200, "Rol", "Square Enix");
//entregamos algunos videojuegos y series
        series[1].entregar();
        series[4].entregar();
        videojuegos[0].entregar();
        videojuegos[3].entregar();

        //Recorremos los arrays para contar cuantos entregados hay, tambien los devolvemos

        int entregados=0;

        for(int i=0;i<series.length;i++){
            if(series[i].isEntregado()){
                entregados+=1;
                series[i].devolver();

            }
            if(videojuegos[i].isEntregado()){
                entregados+=1;
                videojuegos[i].devolver();
            }
        }

        System.out.println("Hay "+entregados+" articulos entregados");

        //Creamos dos objetos con la primera posicion de cada array
        Serie serieMayor=series[0];
        Videojuego videojuegoMayor=videojuegos[0];

        //Recorremos el array desde la posicion 1 (no 0), comparando el mayor con las posiciones del array
        for(int i=1;i<series.length;i++){
            if(series[i].compareTo(serieMayor)==Serie.MAYOR){
                serieMayor=series[i];
            }
            if(videojuegos[i].compareTo(videojuegoMayor)==Videojuego.MAYOR){
                videojuegoMayor=videojuegos[i];
            }

        }

        //Mostramos toda la informacion del videojuego y serie mayor
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }
}

