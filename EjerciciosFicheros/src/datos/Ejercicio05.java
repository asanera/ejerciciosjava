package datos;

import java.awt.font.NumericShaper;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio05 {
//	Dado un fichero de texto, elaborar un algoritmo que efectúe el recuento del número de líneas de dicho fichero
//	que tienen cero caracteres, un carácter, dos, tres, etc. y presente por pantalla un listado que recoja estos
//	resultados. Sólo debe aparecer en el listado el número de líneas con j caracteres si hay al menos una línea
//	con j caracteres en el fichero.
//	Ejemplo: Si el contenido del fichero fuera:
//	FECHA DEL EXAMEN :
//	dia tres
//	de junio
//	el listado debería ser:
//	Caracteres : 0 Líneas : 1
//	Caracteres : 8 Líneas : 2
//	Caracteres : 17 Líneas : 1
//	Nota: Se considerará que la longitud máxima de una línea es de 255 caracteres
	
	public static void main(String[] args) {
	File fichero = new File("fejercicio05.txt");
	File ficheAux = new File("fauxEjercicio05,txt");
		if (fichero.exists()){
			if (!ficheAux.exists()){
				try {
					ficheAux.createNewFile();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			FileReader fr = null;
			BufferedReader br = null;
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fr = new FileReader(fichero);
				br = new BufferedReader(fr);
				
				fw = new FileWriter(ficheAux);
				bw = new BufferedWriter(fw);
						
				String linea;
				int numLineas = 0 , numChar;
				while((linea = br.readLine()) != null){
						numLineas++;
					    numChar = linea.length();
						bw.write(numLineas+";"+numChar+";");
						
				}
				fr.close();
				br.close();
				
				FileReader fra = new FileReader(ficheAux);
				BufferedReader bra = new BufferedReader(fra);
				String [] partes;
				partes =  bra.readLine().split(";");
				
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		}else
			System.out.println("El fichero no existe");

	}

}
