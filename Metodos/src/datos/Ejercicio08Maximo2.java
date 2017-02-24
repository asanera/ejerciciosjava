package datos;

import java.util.Scanner;

public class Ejercicio08Maximo2 {
//	3. Ídem una versión que calcule el máximo de 3 números.
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {

		
		System.out.println("El mayor es: "+ orden());
		sc.close();
	}

	private static int orden() {
             int preguntas = 3, numero, aux = 0;
             
             for (int i = 0; i <preguntas; i++){
            	 System.out.println("Introduzca un número");
            	 numero = sc.nextInt();
            	 if (i==0)
            		 aux = numero;
            	 else if (numero > aux)
            		aux = numero;
             }
             return aux;
	}

}
