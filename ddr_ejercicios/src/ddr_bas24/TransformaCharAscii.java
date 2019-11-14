package ddr_bas24;

public class TransformaCharAscii
{
    private static String cadena = "La lluvia en Sevilla es una maravilla";
    private static byte[] ret;
    public static void main(String[] args)
    {
        ret = cadena.getBytes();
        System.out.println(ret);
    }

}
