package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numCarac = 0, numLineas = 0, numPalabras = 0;
		
		File fichero = new File("ficheroEnt.txt");
		if (fichero.exists()) {
			FileReader fr = null;
			BufferedReader br = null;
			
			try {
				fr = new FileReader(fichero);
				br = new BufferedReader(fr);
				
				String linea;
				while ((linea = br.readLine()) != null) {
					numLineas++;
					
					String [] partes = linea.split(" ");
					numPalabras += partes.length;
					
					for (int i = 0; i < partes.length; i++) {
						numCarac += partes[i].length();
					}
				}							
				System.out.println("Nº LÍNEAS: " + numLineas);
				System.out.println("Nº PALABRAS: " + numPalabras);
				System.out.println("Nº CARACTERES: " + numCarac);
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					br.close();
					fr.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		} else {
			System.out.println("Fichero No Existe");
		}
	}

}