package datos;

import java.util.Scanner;

public class Pedirdia {
	// Pedir día, mes, año
	// Indicar di la fecha es correcta con mes de
	// 28, 30 y 31. Comprobar si el dia es es bisiesto
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Año: ");
		int anyo = sc.nextInt();
		//Compruebo si es bisiesto
		boolean esBisiesto = false;
		if ((anyo % 4 ==0) && (anyo %100 !=0 || anyo % 400 == 0)){
			esBisiesto = true;
		}
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		//variable para comprobar la fecha
		boolean fechaCorrecta = false;

		if (mes >= 1 && mes <=12){
			System.out.println("Día: ");
			int dia = sc.nextInt();

			switch (mes) {
			case 2:
				if (dia <= 1 && dia <= 29 && esBisiesto){
					fechaCorrecta = true;
				} else if ( dia >=1 && dia <=28 && !esBisiesto){
					fechaCorrecta = true;
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia >=1 && dia <= 31){
					fechaCorrecta = true;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia >=1 && dia <=30){
					fechaCorrecta = true;
				}
				break;
			default:
				break;
			}
			if (fechaCorrecta){
				System.out.println("Fecha Correcta: " + anyo + "/" + mes + "/" + dia);
			}
		}else {System.out.println("Error");
		}
	}

}
