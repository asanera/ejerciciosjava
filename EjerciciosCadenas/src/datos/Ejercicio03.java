package datos;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class Ejercicio03 {
	// Escriba un método que, dada una cadena de caracteres, de la suma de todos
	// lo dígitos que hay en ella. Por ejemplo, si la cadena es abc12de3f4, dará
	// como resultado 10.
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Cadena: ");
		String cadena = sc.next();

		System.out.println("Suma V1: " + sumav1(cadena));
		System.out.println("Suma V2: " + sumav2(cadena));
		System.out.println("Suma V3: " + sumav3(cadena));
		sc.close();
	}

	private static int sumav3(String cadena) {
		int suma = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				suma += Character.getNumericValue(cadena.charAt(i));
			}
		}
		return suma;
	}

	private static int sumav2(String cadena) {
		int suma = 0;

		for (int i = 0; i < cadena.length(); i++) {
			try {
				int num = Integer.parseInt(cadena.substring(i, i + 1));
				suma += num;
			} catch (NumberFormatException e) {

			}
		}

		return suma;
	}

	private static int sumav1(String cadena) {
		int suma = 0;
		for (int i = 0; i < cadena.length(); i++) {
			int car = cadena.charAt(i);
			if (car >= 49 && car <= 57) {
				// Es un numero
				suma += car - '0';
				// 0 en ASCII es 48
			}
		}
		return suma;
	}

}
