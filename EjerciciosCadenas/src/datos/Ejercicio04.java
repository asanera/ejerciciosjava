package datos;

import java.util.Scanner;

public class Ejercicio04 {
	// Un palíndromo es una secuencia de caracteres que se lee igual al derecho
	// y al revés. Por ejemplo, cada
	// uno de los siguientes enteros de cinco dígitos es un palíndromo: 12321,
	// 55555, 45554. Escriba una
	// aplicación que lea un entero de cinco dígitos y determine si es un
	// palíndromo.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Numero: ");
		int numero = sc.nextInt();

		if (esPalindromo(numero))
			System.out.println(numero + " es Palíndromo");
		else
			System.out.println(numero + " no es Palíndromo");

		sc.close();
	}

	private static boolean esPalindromo(int numero) {
		boolean palindromo = true;
		
		String numCad = String.valueOf(numero);
		
		//V1
		if(!numCad.equals(new StringBuffer(numCad).reverse().toString()))
			palindromo = false;
		//V2
		for (int i = 0; i < numCad.length()/2; i++) {
			if(numCad.charAt(i)!= numCad.charAt(numCad.length()-1-i))
				palindromo = false;
		}
		
		return palindromo;
	}

}
