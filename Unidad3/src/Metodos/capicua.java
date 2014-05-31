package Metodos;

import java.util.Scanner;

public class capicua {

	public static void main(String[] args) {
		//Crea un método que nos diga si un número es capicúa (devuelve true en el caso de que lo sea y false si no lo es)
		
		
	}
	public static void capicua(int  cap){
		Scanner teclado = new Scanner(System.in);
		int capicua;
		do{
			int NumeroPrincipio = 0;
			capicua = NumeroPrincipio % 10;
			int NumeroFinal = teclado.nextInt();
			capicua = NumeroFinal *10;
			System.out.println("EL NUMERO ES CAPICUA");
					
		}while(true);
		
		 
		
	}

}
