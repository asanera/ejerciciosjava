package datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02Media {
	// Leer 10 números por teclado y a continuación realizar la media de los
	// números positivos, la media de los negativos y contar el número de ceros.
	private static Scanner sc  = new Scanner (System.in);
	private static int contPos = 0, contNeg = 0, contCero = 0, sumaPos = 0, mediaPos, sumaNeg = 0, mediaNeg;
	private static int[]tabla = new int[10];
	
	public static void main(String[] args) {
	rellenaTabla();
	divideTabla();
	muestraTabla();
		
		sc.close();

	}
	private static void muestraTabla() {
		System.out.println(Arrays.toString(tabla));
		System.out.println("Hay " + contCero + " ceros");
		System.out.println("Hay " + contNeg + " numeros negativo y su media es "+ mediaNeg);
		System.out.println("Hay " + contPos + " numeros positivo y su media es "+ mediaPos);
	}
	private static void divideTabla() {
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == 0)
				contCero++;
			else if (tabla[i] > 0){
				contPos++;
				sumaPos += tabla[i];
				mediaPos = sumaPos / contPos;
			}
			else{
				contNeg++;
				sumaNeg += tabla[i];
				mediaNeg = sumaNeg/ contNeg;
				
			}
		}		
	}
	private static void rellenaTabla() {
		int num;
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("introduzca el "+(i+1)+"º número: ");
			 num = sc.nextInt();
			 tabla[i] = num;
		}
		
	}

}
