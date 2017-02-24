package datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05Eliminar {
	// Leer por teclado una tabla de 10 elementos numéricos enteros y una
	// posición (entre 0 y 9). Eliminar el elemento situado en la posición dada
	// sin dejar huecos.
	private static int[] tabla = new int[10];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		inicializarTabla();
		mostrarTabla();
		int posicion = -1;
		do {
			System.out.println("Posicion: ");
			posicion = sc.nextInt();
		} while (posicion <0|| posicion >9);
		eliminarElemento(posicion);
		mostrarTabla();
		sc.close();
		
	}

	private static void eliminarElemento(int posicion) {
		for (int i = posicion; i < tabla.length -1; i++) {
			tabla[i] = tabla[i+1];
		}
		tabla[tabla.length -1] = 0;
	}

	private static void mostrarTabla() {
		System.out.println("Tabla: " + Arrays.toString(tabla));

	}

	private static void inicializarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50);
		}
	}

}
