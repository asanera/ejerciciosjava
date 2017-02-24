package datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03MezclaTabla {
	// Leer por teclado una serie de 10 números enteros. La aplicación debe
	// indicarnos si los números están ordenados de forma creciente,
	// decreciente, o si están desordenados.
	private static Scanner sc = new Scanner(System.in);

	private static int[] tabla = new int[20];
	private static int[] tabla1 = new int[10];
	private static int[] tabla2 = new int[10];

	public static void main(String[] args) {
		sc.close();
		rellenarTabla();
		mostrarTablas();
		mezclarTablas();
		mostrarTablas();

	}

	private static void mezclarTablas() {
		int j = 0; // Indice para movernos por tabla
		for (int i = 0; i < tabla.length; i++) {
			tabla[j] = tabla1[i];
			j++;
			tabla[j] = tabla2[i];
			j++;
		}

	}

	private static void mostrarTablas() {
		System.out.println("TABLA: " + Arrays.toString(tabla));
		System.out.println("TABLA: " + Arrays.toString(tabla1));
		System.out.println("TABLA: " + Arrays.toString(tabla2));
	}

	private static void rellenarTabla() {
		for (int i = 0; i < tabla1.length; i++) {
			
				tabla1[i] = new Random().nextInt(50);
				tabla2[i] = new Random().nextInt(50);
			

		}
	}

}
