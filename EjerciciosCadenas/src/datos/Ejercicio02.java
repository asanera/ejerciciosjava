package datos;

import java.util.Scanner;


public class Ejercicio02 {
	// REALIZAR UN PROGRAMA QUE RECIBA DOS CADENAS DE CARACTERES Y CUENTE EL
	// NÚMERO DE APARICIONES DE LA PRIMERA EN LA SEGUNDA
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
	System.out.println("Frase principal: ");
	String frase = sc.nextLine();
	
	System.out.println("Cadena a buscar: ");
	String buscar = sc.next();
	
	System.out.println("Numero de ocurrencias de "+ buscar +" en " + frase+ " es "+ocurrencias(frase, buscar));
	
	sc.close();

	}

	private static int ocurrencias(String frase, String buscar) {
		int cont = 0;
		
		int pos= frase.indexOf(buscar);
		if (pos != -1){
			do{
				cont++;
				pos = frase.indexOf(buscar, pos+buscar.length());
			}while(pos !=-1);
		}
		
		return cont;
	}

}
