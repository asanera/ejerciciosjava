package datos;

import java.util.Scanner;

public class Ejercicio07Maximo {
//	2. Diseñar un método que tenga como parámetros dos números, y que calcule el máximo.
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {

		System.out.println("Nº: ");
		int num = sc.nextInt();
		System.out.println("Nº: ");
		int num2 = sc.nextInt();
		
		System.out.println("El mayor es: "+ orden(num, num2));
		sc.close();
	}

	private static int orden(int num, int num2) {
		if (num > num2)
			return num;
		else return num2;
		
	}

}
