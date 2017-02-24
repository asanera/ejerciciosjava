package datos;

import java.util.Random;
import java.util.Scanner;

public class ExplicacionMetodos {
	// Diseñar un método que tenga como parametros dos numeros, y que calcule el
	// maximo
	private static Scanner sc = new Scanner(System.in);

	private static int num1, num2;

	public static void main(String[] args) {
		System.out.println("Coloque un numero");
		num1 = sc.nextInt();
		System.out.println("Coloque el segundo numero");
		num2 = sc.nextInt();

		maximoEntreDosNumeros();
		//Demostrar como un metodo puede devolver una tabla
		int tabla[] = creaTabla();
		mostrarTabla(tabla);
		sc.close();
	}

	private static void mostrarTabla(int[] tabla) {
	for (int i = 0; i < tabla.length; i++) {
		System.out.println(tabla[i]);
	}
		
	}

	private static int[] creaTabla() {
		int [] t = new int [5];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Random().nextInt(50);
		}
		return t;
	}

	private static void maximoEntreDosNumeros() {

		if (num1 >= num2)
			mostrarMayor(num1);
		else
			mostrarMayor(num2);
	}

	private static void mostrarMayor(int num12) {
		System.out.println("El mayor es " + num12);

	}
}
