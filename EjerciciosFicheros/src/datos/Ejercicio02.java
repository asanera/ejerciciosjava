package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio02 {
	//Crear un programa que copie el contenido de un archivo en otro utilizando
	//FileReader y FileWriter. Al final del archivo copiado se escribir
	public static void main(String[] args) {
		File ficheroEnt = new  File("ficheroEntr.txt");
		File ficheroSal = new File("FicheroSal.txt");
		
		if(ficheroEnt.exists()){
			if(!ficheroSal.exists()){
				try {
					ficheroSal.createNewFile();
				} catch (IOException e) {
				System.out.println(e.getMessage());
				}
			}
			FileReader fr = null;
			BufferedReader br = null;
			
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			try {
				fr = new FileReader(ficheroEnt);
				br = new BufferedReader(fr);

				fw = new FileWriter(ficheroSal);
				bw = new BufferedWriter(fw);
				
				String linea;
				while((linea = br.readLine())!=null){
					bw.write(linea);
					bw.newLine();
					bw.flush();
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}finally {
				
				try {
					bw.close();
					br.close();
					fr.close();
					fw.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
		

	}

}
