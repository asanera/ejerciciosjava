package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio07 {
//	Dado el siguiente fichero de conductores de camiones de la empresa Altair S.A.:
//		id01234; Antonio Perez Pozo; 1234ASD; 654321321; español; 200,2; 113,3; 98,4; 546,5
	
//		Genere un fichero por cada uno de los conductores, de nombre el identificador del conductor
//		sin el id, que muestre su información de la siguiente forma:
	
//		Nombre: Antonio Perez Pozo
//		Matrícula: 1234ASD
//		Teléfono: 654321321
//		Nacionalidad: español
//		Media Kilómetros: 239,6 km
	
	public static void main(String[] args) {
		File fichero = new File ("fejercicio7");
		if(fichero.exists()){
			FileReader fw = null;
			BufferedReader br = null;
			
			try {
				fw = new FileReader(fichero);
				br = new BufferedReader(fw);
				String linea;
				
				while ((linea = br.readLine())!=null) {
					
				}
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}				
		
			
		}else {
			System.out.println("El fichero no existe");
		}

	}

}
