package ejemplo_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ejemplo 
{
	public static void main(String[] args) 
	{
		try {
			String ruta = "C:\\Users\\FernandoPueb_5dvr3\\Documents\\filename.xml";
			String contenido = "Contenido de ejemplo";
			
			File file = new File(ruta);
			
			//Si el archivo no existe
			if(!file.exists()) 
				{
				file.createNewFile();
				}FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(contenido);
				bw.close();
			}
		catch(Exception e){e.printStackTrace();}
	}
	
	
}