package datos;

import java.util.Scanner;


public class Ejercicio01 {

	private static  Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
	System.out.println("Introduzca una cadena");
	String cadena = sc.next();
	System.out.println("Cadena en mayuscula");
	System.out.println(cadena.toUpperCase());//--> Mayuscula
	System.out.println("Cadena en minuscula");
	System.out.println(cadena.toLowerCase());//-->Minuscula
	
	//Saca los dos primeros caracteres
	if (cadena.length()>=2){
		System.out.println(cadena.substring(0,2));
		System.out.println(cadena.substring(cadena.length()-2));
		}
	//Repeticiones del ultimo caracter
	int cont = 0;
	for (int i = 0; i < cadena.length(); i++) {
		if(cadena.charAt(i) ==cadena.charAt(cadena.length()-1)){//-->devuelve el caracter en la posicion entre parentesis
			cont++;
		}
	}
		System.out.println("Nº De ocurrencias del caracter "+ (cadena.length()-1) +": "+ cont);
		

		// TODAS LAS OCURRENCIAS DEL PRIMER CARÁCTER EN MAYUSCULA
		System.out.println(cadena.replaceAll(cadena.substring(0,1),cadena.substring(0,1).toUpperCase()));
		
		StringBuffer cad = new StringBuffer(cadena);
		//***Por delante y detras
		cad.insert(0,"***");
		cad.append("***");
		System.out.println(cad);
		
		//INVERTIDA
		System.out.println(cad.reverse());
		sc.close();
	}

}
