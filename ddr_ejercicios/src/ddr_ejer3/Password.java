package ddr_ejer3;
//Hay que terminar
public class Password {
    private final static int longitudDef = 8;

    private static double longitud;
    private static String contrasenia;

    public Password() {
        this(longitudDef);
    }

    public Password(double longitudPassword) {
        longitudPassword = getLongitud();
        contrasenia = generarPassword();
    }

    public static boolean esFuerte(String contraseniaEsFuerte) {
        int cuentanumeros = 0;
        int cuentaminusculas = 0;
        int cuentamayusculas = 0;
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i = 0; i < getContrasenia().length(); i++) {
            if (getContrasenia().charAt(i) >= 97 && getContrasenia().charAt(i) <= 122) {
                cuentaminusculas += 1;
            } else {
                if (getContrasenia().charAt(i) >= 65 && getContrasenia().charAt(i) <= 90) {
                    cuentamayusculas += 1;
                } else {
                    cuentanumeros += 1;
                }
            }
        }
        //Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
        if (cuentanumeros >= 5 && cuentaminusculas >= 1 && cuentamayusculas >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static String generarPassword() {
        String password = "";
        for (int i = 0; i < getLongitud(); i++) {
            //Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
            int eleccion = ((int) Math.floor(Math.random() * 3 + 1));

            if (eleccion == 1) {
                char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
                password += minusculas;
            } else {
                if (eleccion == 2) {
                    char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
                    password += mayusculas;
                } else {
                    char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
                    password += numeros;
                }
            }
        }
        return password;
    }

    public static double getLongitud() {
        return longitud;
    }

    public static void setLongitud(double longitud) {
        Password.longitud = longitud;
    }

    public static String getContrasenia() {
        return contrasenia;
    }
}
