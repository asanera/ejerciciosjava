package datos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio07Ordenacion {
	// Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
	// Se debe mostrar la posición en que se encuentra. Si no está, indicarlo
	// con un mensaje.
	
	public static void main(String[] args) {
		int[] tEnteros = cargaTabla();
		System.out.println("Sin ordenar");
		muestraTabla(tEnteros);
		System.out.println("Ordenado por mi");
		ordenaTablaManual(tEnteros);
		muestraTabla(tEnteros);
		System.out.println("Ordenado");
		ordenaTabla(tEnteros);
		muestraTabla(tEnteros);
		
	}

	private static void ordenaTablaManual(int[] tEnteros) {
		int aux;
		for (int i =1 ; i < tEnteros.length; i++) {
			for (int j = 0; j < tEnteros.length-1; j++) {
				if(tEnteros[j]>tEnteros[i]){
					aux = tEnteros[j];
					tEnteros[j] = tEnteros[i];
					tEnteros[i] = aux;
					
				}
			}
		}
		
	}

	private static void ordenaTabla(int[] tEnteros) {
	Arrays.sort(tEnteros);
		
	}

	private static void muestraTabla(int[] tEnteros) {
		System.out.println(Arrays.toString(tEnteros));
		
	}

	private static int[] cargaTabla() {
		int[] tEnteros = new int[10];
		for (int i = 0; i < tEnteros.length; i++) 
			tEnteros[i] = new Random().nextInt(50);
		
		return tEnteros;
	}

}
