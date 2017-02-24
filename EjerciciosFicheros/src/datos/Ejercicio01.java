package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nombre Fichero: ");
		String nombreFichero = sc.next();

		escribirEnFichero(nombreFichero);

		leerDeFichero(nombreFichero);

		sc.close();
	}

	private static void leerDeFichero(String nombreFichero) {
		File fichero = new File(nombreFichero);
		if (fichero.exists()) {
			FileReader fr = null;
			BufferedReader br = null;

			try {
				fr = new FileReader(fichero);
				br = new BufferedReader(fr);

				// Leer del Fichero

				// 1ª Forma
				String linea;
				while ((linea = br.readLine()) != null) {
					// System.out.println(linea);
					String[] partes = linea.split(";");
					System.out.println("Nombre: " + partes[0]);
					System.out.println("Edad: " + partes[1]);
					double media = 0;
					if (partes.length >= 3) {
						for (int i = 2; i < partes.length; i++) {
							media += Double.parseDouble(partes[i]);
						}
						media = media / partes.length - 2;
					}
					System.out.println("Media: " + media);
				}

				// 2ª Forma
				// int c;
				// while ((c = br.read()) != -1) {
				// System.out.print((char)c);
				// }

			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					br.close();
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("Fichero No Existe");
		}

	}

	private static void escribirEnFichero(String nombreFichero) {
		File fichero = new File(nombreFichero);
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(fichero);
			bw = new BufferedWriter(fw);

//			// Escribir en el fichero
//			bw.write("Primera Línea");
//			bw.newLine();
//			bw.write("Segunda Línea");
//			bw.flush();
			
			String condicion = "", linea = "";
			do {
				System.out.println("Nombre: ");
				String nombre = sc.next();
				linea += nombre + ";";
				
				System.out.println("Edad: ");
				int edad = sc.nextInt();
				linea += edad + ";";
				
				double nota = 0;
				do {
					System.out.println("Nota: ");
					nota = sc.nextDouble();
					if (nota != -1)
						linea += nota + ";";
				} while (nota >= 0);
				
				bw.write(linea);
				bw.newLine();
				bw.flush();
				linea = "";
				
				System.out.println("¿Desea continuar (S/N)?");
				condicion = sc.next();
			} while (condicion.equalsIgnoreCase("S"));
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			// Cerramos
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
