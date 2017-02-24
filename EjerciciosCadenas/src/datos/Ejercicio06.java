package datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
//	Crear una clase que tome como cadena a cifrar el argumento que se haya pasado por la
//	línea de comandos, la pase a mayúsculas, la cifre usando una clave aleatoria entre 0 y
//	10. Por último, muestre en pantalla la cadena original, la clave de cifrado y la cadena
//	cifrada. 
	
	private static Scanner sc  = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduzca la cadena: ");
		String cadena = sc.nextLine().toUpperCase();
		Random azar = new Random();
		int clave = azar.nextInt(11);
		System.out.println("La clave de cifrado es "+clave+" y la cadena cifrada es: "+ cifrado(cadena, clave));
		sc.close();
	}

	private static String cifrado(String cadena, int clave) {
		String cadCif = "";
		int aux;
		for (int i = 0; i < cadena.length(); i++) {
			aux = cadena.charAt(i);
			aux += clave;
			cadCif += (char)aux;
		}
		return cadCif;
	}

}
