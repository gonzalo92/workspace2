package For;

import java.util.Scanner;

public class Ejercicio1_Frases {

	public static void main(String[] args) {
		//Escribe un programa que pida cinco frases y las visualice.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime 5 frases: ");
		String frase =teclado.nextLine();
		
		for(int i = 1 ; i <=5 ;i++){
			System.out.println(frase);
			frase= teclado.nextLine();
		}

	}

}
