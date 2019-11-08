package ejemplomatrices;

public class Main {

    public static void main(String[] args)
    {
	    int row = 2;
	    int col = 5;
	    int[][]x = new int [row][col];
	    //int[][]x = {{1,2,3},{4,5,6},{7,8,9}}
        x[0][1] = 1;
        System.out.println(x[0][1]);
    }
}
