package datos;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Ejercicio05 {

//Crear una clase que permita cifrar cadenas de caracteres usando el algoritmo de cifrado
//simple consistente en asignar a cada carácter aquel que resulte de sumar un valor a su
//código ASCII. (La asignación será circular, es decir, si el valor es 2, al carácter “z” le
//corresponderá la “b”)
	
	
	private static Scanner sc = new Scanner (System.in);
	private static final  int clave = 25;
	
	public static void main(String[] args) {
		System.out.println("Introduzca la cadena: ");
		String cadena = sc.nextLine();
		String cadCif = cifrar(cadena);
		System.out.println("La cadena cifrada es "+ cadCif);
		System.out.println("La cadena descifrada es: "+ desencriptar(cadCif));
		sc.close();
	}
	private static String desencriptar(String cadCif) {
		String cadDes = "";
		int aux;
		for (int i = 0; i < cadCif.length(); i++) {
			aux = cadCif.charAt(i);
			aux -=clave;
			cadDes += (char)aux;
		}
		return cadDes;
	}
	private static String cifrar(String cadena) {
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
