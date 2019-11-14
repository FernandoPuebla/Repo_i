package ddr_bas28;
import javax.swing.*;

public class Sol28
{
    String texto= JOptionPane.showInputDialog(null,
            "Inserta una frase",
            "Inserción",
            JOptionPane.INFORMATION_MESSAGE);

    //usado para almacenar el texto final
    String texto_sin_espacios="";

    char caracterActual;

    //recorro el array
       /* for(int i=0;i<texto.length();i++){

    caracterActual=texto.charAt(i);

    //Cuando es un espacio no lo copia a la cadena
    if(caracterActual!=' '){
        texto_sin_espacios+=String.valueOf(caracterActual);
    }

}

         JOptionPane.showMessageDialog(null,
                 "La frase tiene sin espacios es "+texto_sin_espacios,
        "Resultado",
    JOptionPane.INFORMATION_MESSAGE);*/
}
