package datos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	// 1. Rellena una tabla de 20 elementos de tipo entero de manera aleatoria.(ok)
	
	// Recorre la tabla comprobando cada uno
	// de sus elementos: si el elemento es par se debe sustituir su valor por el
	// doble del mismo y si el elemento es
	// impar se debe sustituir su valor por el triple del mismo.
	
	public static void main(String[] args) {
	int [] tEntero  = cargaTabla();
	System.out.println("Tabla Cargada:");
	System.out.println(Arrays.toString(tEntero));
	System.out.println("Tabla Cargada  con triples y dobles:");
	compruebaElemento(tEntero);
	System.out.println(Arrays.toString(tEntero));
	}

	private static void compruebaElemento(int[] tEntero) {
		
		for (int i = 0; i < tEntero.length; i++) {
			if (tEntero[i]%2 ==0)
				tEntero[i] = tEntero[i]*2;
			else
				tEntero[i] = tEntero[i]*3;
		}
		
	}

	private static int[] cargaTabla() {
		int[] tEntero= new int[20];
		for (int i = 0; i < tEntero.length; i++) {
			tEntero[i] = new Random().nextInt(20);
		}
		return tEntero;
	}

}
