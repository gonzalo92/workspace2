package For;

import java.util.Scanner;

public class Ejercicio5_Dos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame dos numeros: ");
		int numero1= 1,numero2= 2,total=0;
		
		
		while(numero1>numero2){
			System.out.println("Escribe un numero: ");
			numero1=teclado.nextInt();
			System.out.println("Escribe un numero: ");
			numero2=teclado.nextInt();
			if(numero1>numero2){
				System.out.print("");
			}
		}
		
	}

}
