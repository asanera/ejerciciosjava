package es_empresa;

public class Principal {

	private static int variable1;
	//Esta variable por defecto es public
	//esta variable es visible en toda la clase
	//Pero puede ser privada o protegida. Lo ideal es privada
	// es decir private int variable;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int variable2 = 0;
		//No lleva visibilidad privada, publica, o protegida
		//ES VISIBLE DENTRO DEL MÉTODO, NO SE VE FUERA DEL MÉTODO
		if (variable2 > 0){
			int variable3 = 1;
			//Solo es visible dentro de bloque declarado, es decir solo dentro de este if.
		}
	}
	private void metodo (){
		variable1 = 3;
		
	}
}
