package ddr_obj3;

public class Password
{
    private final static int LONG_DEF = 8;//Con static lo reconoce y sin static no
    //private final String CONTRA_DEF = "";

    private int longitud;
    private String contrasenia;

    public Password()
    {
       this(LONG_DEF);
    }

    public Password(int longP)
    {
        longitud = longP;
        generarPassword();
    }
    public boolean esFuerte()
    {
        int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i=0;i<contrasenia.length();i++){
            if (contrasenia.charAt(i)>=97 && contrasenia.charAt(i)<=122){
                cuentaminusculas+=1;
            }else{
                if (contrasenia.charAt(i)>=65 && contrasenia.charAt(i)<=90){
                    cuentamayusculas+=1;
                }else{
                    cuentanumeros+=1;
                }
            }
        }
        //Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
        if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }

    }
    public String generarPassword()
    {
        String password="";
        for (int i=0;i<longitud;i++){
            //Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
            int eleccion=((int)Math.floor(Math.random()*3+1));

            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
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


    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }
}