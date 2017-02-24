package datos;

import java.util.Scanner;

public class Ejercicio06ModuloEjecutandose {
//	1. Realizar un método, que se le pase como parámetro un número N, y muestre por pantalla N veces, el mensaje: “Módulo Ejecutándose”
	private static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		moduloEjectuta(numero);
      sc.close();
	}
	private static void moduloEjectuta(int numero) {
		for (int i = 1; i <= numero; i++)
			System.out.println("Modulo Ejecutandose");
	}

}
