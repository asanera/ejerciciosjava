package es_empresa;

public class Conversion {

	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.142;
		long l;
		System.out.println("Conversión de enteros a bytes");
		b = (byte) i; // Casting o conversión explicita
		// Convierto en entero en tipo byte
		System.out.println("B: " + b + "I: " +i);
		
		System.out.println("Conversion de double a int");
		i = (int) d;
		System.out.println("D: " + d + " I: " + i);

		System.out.println("Conversión de int a long");
		l = i; //Casting o conversion IMPLÍCITA
		// en este caso, el tipo de destino es más amplio que el tipo de origen no hay problema
		// Además los dos tipos son compatible, no hay problemas
	}

}
