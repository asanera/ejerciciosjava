package datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {
	private static Scanner sc = new Scanner(System.in);

	private static int[] tabla = new int[5];

	public static void main(String[] args) {
		rellenarTabla();
		mostrarTabla();
		ordenarTabla();
		mostrarTabla();

		sc.close();
	}

	private static void ordenarTabla() {
		// Metodo de ordenacion por intercambio
		for (int i = 0; i < tabla.length - 1; i++) {
			for (int j = i + 1; j < tabla.length; j++) {
				if (tabla[i] > tabla[j]) {
					// Intercambiamos los valores
					int aux = tabla[i];
					tabla[i] = tabla[j];
					tabla[j] = aux;

				}
			}
		}

	}

	private static void mostrarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");

		}
		System.out.println();
	}

	private static void rellenarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50);
		}
	}

}
