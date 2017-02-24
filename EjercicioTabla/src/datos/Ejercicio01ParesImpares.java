package datos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;



public class Ejercicio01ParesImpares {

//	Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares.
	
	private static int[] tabla = new int [10];
	private static int[] tablaPares = new int [10];
	private static int[] tablaImpares = new int [10];
	
	static int contPares =0;
	static int contImpares = 0;
	
	public static void main(String[] args) {
	rellenarTabla();	
	mostrarTabla();
	dividirTabla();
	mostrarParesImpares();

	}

	private static void mostrarParesImpares() {
		System.out.println("Nº Pares: "+ contPares);
		
		
		for (int i = 0; i < contPares; i++) {
			System.out.print(tablaPares[i] + " ");
			
		}
		System.out.println("\nNº Impares: "+ contImpares);
		for (int i = 0; i < contImpares; i++) {
			System.out.print(tablaImpares[i] + " ");
		}
		
	}

	private static void dividirTabla() {
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i]%2==0){
				tablaPares[contPares] = tabla[i];
				contPares++;
			}else{
				tablaImpares[contImpares] = tabla[i];
				contImpares++;
			}
		}
		
	}

	private static void mostrarTabla() {
		System.out.println(Arrays.toString(tabla));
		
	}

	private static void rellenarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(100);
			
		}
		
	}

}
