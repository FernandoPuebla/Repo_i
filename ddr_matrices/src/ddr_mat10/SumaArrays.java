package ddr_mat10;

public class SumaArrays {
    public static int[][] array1 = new int[2][3];
    public static int[][] array2 = new int[2][3];
    public static int[][] resultado = new int[2][3];

    public static void main(String[] args) {
        generaArrays();
        imprimirArrays();
        suma();
        imprimirSuma();
    }

    public static void generaArrays() {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j] = (int) (Math.random() * 10);
                array2[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void imprimirArrays() {
        System.out.println("Matriz 1");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void suma() {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                resultado[i][j] = array1[i][j] + array2[i][j];
            }
        }
    }

    public static void imprimirSuma() {
        System.out.println("Matriz resultante");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                resultado[i][j] = array1[i][j] + array2[i][j];
                System.out.print(resultado[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}