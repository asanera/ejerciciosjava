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
	

	private static int[] numCaracteres = new int[255];
	public static void main(String[] args) {
		File fichero = new File("fejercicio05.txt");
	
		if (fichero.exists()) {
	
			FileReader fr = null;
			BufferedReader br = null;
		
			try {
				fr = new FileReader(fichero);
				br = new BufferedReader(fr);
			
				String linea;
				
				while ((linea = br.readLine()) != null) {
					comprobarLinea(linea);

				}
				mostrarResultado();

			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());

			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					fr.close();
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}

			}

		} else
			System.out.println("El fichero no existe");

	}
	private static void mostrarResultado() {
		for (int i = 0; i < numCaracteres.length; i++) {
			if (numCaracteres[i]!=0){
				System.out.println("Caracteres: "+ i + " Lineas : " + numCaracteres[i]);
			}
		}
		
	}
	private static void comprobarLinea(String linea) {
		int num = linea.length();
		numCaracteres[num]++;
		
	}

}
