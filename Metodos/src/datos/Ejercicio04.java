package datos;

import java.util.Scanner;

public class Ejercicio04 {
//	 Leer por teclado una serie de 10 números enteros. 
//	 La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados.
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	boolean creciente = false, descreciente = false;
	int aux = 0;
	for (int i = 0; i<10; i++){
		System.out.println("Nº: ");
		int numero =sc.nextInt();
		if (i == 0){
			//Primer valor de los 10
			aux = numero;
		}else{
			//Resto de los casos
			if (numero > aux)
				creciente = true;
			else
				descreciente = true;
			aux = numero;
		}
	}	
	if ( creciente && descreciente)
		System.out.println("Desordenado");
	else if (creciente)
		System.out.println("Creciente");
	else
		System.out.println("Descreciente");
	sc.close();
	}

}
