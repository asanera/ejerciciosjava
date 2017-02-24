package datos;

import java.util.Scanner;

public class MasaCorporal {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Construir un programa que pida la masa corporal, e indicar el estado
		// en que se encuentra.
		// 16 criterio al hospital, 16.17 infrapeso 17 .18 bajo peso, 18 a 25,
		// peso normal, 25, 30 sobrepeso, 30 a 35 sobrepeso cronico 35, 40
		// obesisad mórbida

		double peso, altura, masaCorporal;
		do {
			System.out.println("Indique su altura(en metros): ");
			altura = sc.nextDouble();
			System.out.println("Indique su peso(en kilogramos): ");
			peso = sc.nextDouble();
			if (peso <= 0 || altura <= 0)
				System.out.println("Error en los valores introducidos");
		} while (peso <= 0 || altura <= 0);
		masaCorporal = peso / Math.pow(altura, 2);
		System.out.println("Su masa corporal es " + masaCorporal);

		if (masaCorporal < 16)
			System.out.println("Deberias de ir al hospital y comer un buen puchero");
		else if (masaCorporal >= 16 && masaCorporal < 17)
			System.out.println("Usted tiene infrapeso");
		else if (masaCorporal >= 17 && masaCorporal < 18)
			System.out.println("Usted está bajo de peso");
		else if (masaCorporal >= 18 && masaCorporal < 25)
			System.out.println("Usted está fenomenal");
		else if (masaCorporal >= 25 && masaCorporal < 30)
			System.out.println("Usted tiene un poco de sobrepeso");
		else if (masaCorporal >= 30 && masaCorporal < 35)
			System.out.println("Usted tiene sobrepeso crónico");
		else if (masaCorporal >= 35)
			System.out.println("Usted tiene obesidad mórbida");

		sc.close();
	}

}
