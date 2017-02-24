package datos;

import java.util.Scanner;

public class Ejercicio02 {
	/*
	 * 10. Haga un programa que dados dos números introducidos por teclado
	 * indique si son amigos o no. El programa debe ofrecer la posibilidad de
	 * continuar. Nota: Dos números amigos son dos enteros positivos (n1, n2)
	 * tales que la suma de los divisores propios de uno de ellos es igual al
	 * otro (la unidad se considera divisor propio, pero no lo es el mismo
	 * número). Por ejemplo, 220 y 284 son amigos, ya que: Suma de divisores de
	 * 284: 1 + 2 + 4 + 71 + 142 = 220 Suma de divisores de 220: 1 + 2 + 4 + 5 +
	 * 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284. También son números amigos 17296
	 * y 18416
	 */

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("Introduzca un numero: ");
		num1 = sc.nextInt();

		System.out.println("Introduzca un numero: ");
		num2 = sc.nextInt();

		if (sonAmigos(num1, num2))
			System.out.println(num1 + " es amigo de " + num2);
		else
			System.out.println(num1 + " no es amigo de " + num2);
		sc.close();
	}

	private static boolean sonAmigos(int num1, int num2) {
		if (sumaDivisores(num1) == num2 && sumaDivisores(num2) == num1)
			return true;
		else
			return false;
	}

	private static int sumaDivisores(int num) {
		int suma = 0;
		
		for (int i = 1; i < num; i++) {
			if (num%i==0)
				suma +=i;
		}
		
		return suma;
	}

}




























