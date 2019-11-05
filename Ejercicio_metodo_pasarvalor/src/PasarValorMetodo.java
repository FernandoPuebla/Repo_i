public class PasarValorMetodo
{

    public static void main(String[] args)
    {
     PasarValorMetodo prueba = new PasarValorMetodo();
     prueba.hablar("Je je je");
        // hablar("Hola que hace");// Funciona
    }

    public static void hablar(String texto) //Declaro un parámetro en la función hablar llamado texto de tipo String
    {
        System.out.println(texto);
    }

}
