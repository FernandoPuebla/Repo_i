package ejemplometodo;

public class Main
{

    public static void main(String[] args)
    {
	int x = 1;
	int y = 2;
	int sum = add(x,y);
        System.out.println(sum);
        String firstName = "Pedro";
        String secondName = "Mercado";
         String result = addStrings(firstName,secondName);
        System.out.println(result);
    }

    public static int add(int a, int b)
    {
        return  a + b;
    }
    public static String addStrings(String a, String b)
    {
        return a + " " + b;
    }
}
