package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio06 {

	public static void main(String[] args) {
		File fichero = new File("fejercicio06.txt");
		File ficheroSalida = new File("medicionesMin.txt");
		if (fichero.exists()) {

			FileReader fr = null;
			BufferedReader br = null;

			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fr = new FileReader(fichero);
				br = new BufferedReader(fr);
				
				fw = new FileWriter(ficheroSalida);
				bw = new BufferedWriter(fw);
				
				String linea;
				while ((linea = br.readLine()) != null) {
					String []partes = linea.split(" ");
					
					int min = Integer.MIN_VALUE;
					if (partes.length >1){
						 min = Integer.parseInt(partes[1]);
						for (int i = 2; i < partes.length; i++) {
							if (Integer.parseInt(partes[i])<min) {
								min = Integer.parseInt(partes[i]);
							}
						}
					}
					if(min  == Integer.MIN_VALUE)
						bw.write(partes[0]);
					else{
						bw.write(partes[0] + " "+min);
						bw.newLine();
						bw.flush();
						
					}
				}
				

			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());

			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					fr.close();
					br.close();
					fw.close();
					bw.close();
				} catch (IOException e) {

					e.printStackTrace();
				}

			}

		} else
			System.out.println("El fichero no existe");
	}

}
