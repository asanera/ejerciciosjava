package datos;

import java.util.Scanner;

public class Ejercicio05NaturalPerfecto {
	// Un número natural se dice perfecto si es igual a la suma de sus divisores
	// propios (divisores menores que el número). Por ejemplo los números 6 y 28
	// son perfectos ya que 6 = 1 + 2 + 3 y 28 = 1 + 2 + 4 + 7 + 14, mientras
	// que el número 12 no es perfecto ya que los divisores propios de 12 son 1,
	// 2, 3, 4 y 6 y la suma de estos números es 16

	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		if (numero == sumaDivisores(numero))
			System.out.println(numero + " es perfecto");
		else
			System.out.println(numero + " no es perfecto");
		sc.close();

	}
	private static int sumaDivisores(int numero) {
		int suma = 0;
		
	    for (int i = 1; i < numero/2; i++) {
	    	if (numero%i==0);
			suma = suma +i;
		}
		
		return suma;
	}
 
}
