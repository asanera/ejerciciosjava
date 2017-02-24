package datos;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Ejercicio2 {
	// 2. Se tiene una tabla de 20 posiciones de enteros comprendidos entre 1 y
	// 10, ambos inclusive. Escriba un método
	// dentro de un programa que calcule cuántos números distintos hay en la
	// tabla.
	public static void main(String[] args) {
		int [] tNumeros  = cargaTabla();
		System.out.println("Tabla:");
		System.out.println(Arrays.toString(tNumeros));
		
		int numDistintos = numerosDiferentes(tNumeros);
		System.out.println("Hay "+ (numDistintos)+ " numeros disitintos" );
	}
	private static int numerosDiferentes(int[] tNumeros) {
		 Arrays.sort(tNumeros);
		 int contador =0;
		 for (int i = 1; i < tNumeros.length; i++) {
			if(tNumeros[i]!= tNumeros[i-1])
				contador++;
		}
		return contador;
		
	}
	
	
	private static int[] cargaTabla() {
		int[] tNumeros= new int[20];

		for (int i = 0; i < tNumeros.length; i++) {
			tNumeros[i] = new Random().nextInt(10)+1;
			
		}
		return tNumeros;
	}

}
