package datos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio04LeerEntero {

	
	// Crear un programa que lea por teclado una tabla de 10 números enteros y
	// la desplace una posición hacia abajo: el primero pasa a ser el segundo,
	// el segundo pasa a ser el tercero y así­ sucesivamente. El último pasa a
	// ser el primero.
	private static int [] tabla = new int[10];
	public static void main(String[] args) {
		inicializarTabla();
		mostrarTabla();
		moverTabla();
		mostrarTabla();
	}
	private static void moverTabla() {
		int ultimo = tabla[tabla.length-1];
		for (int i = tabla.length-1; i > 0; i--) {
			tabla[i] = tabla[i -1];
		}
		tabla[0] = ultimo;
	}
	private static void mostrarTabla() {
		System.out.println("TABLA: "+ Arrays.toString(tabla));
		
	}
	private static void inicializarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50);
		}
		
	}

}
