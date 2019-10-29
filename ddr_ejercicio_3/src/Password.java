public class Password
{
    private final static int LONG_DEF = 8;
    private int longitud;
    private String contraseña;

    public Password()
    {
    }
    public Password()
    {
        longitud = 8;
        contraseña =  "asdf";
    }
}

static boolean esFuerte()
{

}

public String generarPassword()
{
    String password = "";
    for(int i = 0; i < longitud;i++)
    {
        int eleccion = ((int)Math.floor(Math.random()*3+1));

        if (eleccion == 1)
        {
        char minisculas = (char)((int)Math.floor(Math.random()*(123-97)+97))   ;
        }else
            {
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                    }
            }
    }
        return password;
}