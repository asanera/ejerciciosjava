package datos;

import java.util.Scanner;

public class Ejercicio07 {
	// (Clave Morse). El código Morse asigna una serie de puntos y guiones a
	// cada letra del alfabeto, cada dígito y algunos caracteres especiales.
	// Escriba una aplicación que lea una frase en español y que codifique la
	// frase en clave Morse. Además, escriba un programa que lea una frase en
	// clave Morse y que la convierta en su equivalente en español. Use un
	// espacio en blanco entre cada letra en clave Morse y tres espacios en
	// blanco entre cada palabra en clave Morse.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Cadena: ");
		String cadena = sc.nextLine();
		System.out.println("La cadena en morse es: " + convertirMorse(cadena));
	
		System.out.println("Introduzca el codigo morse");
		String codigo = sc.nextLine();
		System.out.println("La frase es :"+ converitrCadena(codigo));
		sc.close();

	}

	private static String converitrCadena(String codigo) {
		String frase = "";
		char colocaCaracter;
		String [] tmorse  =codigo.split(" ");
		for (int i = 0; i < tmorse.length; i++) {
			colocaCaracter = convertirCaracter(tmorse[i]);
			frase += colocaCaracter +" ";
		}
		
		return frase;
	}


	private static char convertirCaracter(String codigoMorse) {
		switch (codigoMorse) {
		case ".-":
			return 'a';
		case "-...":
			return 'b';
		case "-.-.":
			return 'c';
		case "-..":
			return 'd' ;
		case ".":
			return 'e';
		case "..-.":
			return 'f';
		case "--.":
			return 'g';
		case "....":
			return 'h';
		case "..":
			return 'i' ;
		case ".---":
			return 'j' ;
		case "-.-":
			return 'k';
		case ".-..":
			return 'l';
		case "--":
			return 'm';
		case "-.":
			return 'n';
		case "--.---":
			return 'ñ';
		case "---":
			return 'o';
		case ".--.":
			return 'p';
		case "--.-":
			return 'q';
		case ".-.":
			return 'r';
		case "...":
			return 's';
		case "-":
			return 't';
		case "..-":
			return 'u';
		case "...-":
			return 'v';
		case ".--":
			return 'w';
		case "-..-":
			return 'x';
		case "-.--":
			return 'y';
		case "--..":
			return 'z';
		default:
			return ' ';
		}
		
	}

	private static String convertirMorse(String cadena) {
		String codMorse = "";
		String colocaCaracte;
		char caracter;

		for (int i = 0; i < cadena.length(); i++) {
			caracter = cadena.toLowerCase().charAt(i);
			colocaCaracte = compruebaCaracter(caracter);
			codMorse += colocaCaracte + " ";
		}

		return codMorse;
	}

	private static String compruebaCaracter(char caracter) {
		switch (caracter) {
		case 'a':
			return ".-";
		case 'b':
			return "-...";
		case 'c':
			return "-.-.";
		case 'd':
			return "-..";
		case 'e':
			return ".";
		case 'f':
			return "..-.";
		case 'g':
			return "--.";
		case 'h':
			return "....";
		case 'i':
			return "..";
		case 'j':
			return ".---";
		case 'k':
			return "-.-";
		case 'l':
			return ".-..";
		case 'm':
			return "--";
		case 'n':
			return "-.";
		case 'ñ':
			return "--.-";
		case 'o':
			return "---";
		case 'p':
			return ".--.";
		case 'q':
			return "--.-";
		case 'r':
			return ".-.";
		case 's':
			return "...";
		case 't':
			return "-";
		case 'u':
			return "--.";
		case 'v':
			return "..-";
		case 'w':
			return "-..";
		case 'x':
			return "-..-";
		case 'y':
			return "-.--";
		case 'z':
			return "--..";
		default:
			return "  ";
		}

	}

}
