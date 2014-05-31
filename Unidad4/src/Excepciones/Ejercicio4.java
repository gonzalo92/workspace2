package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int dividendo=0,divisor=0;
		Scanner sc = new Scanner(System.in);
		boolean hay_error = false;
	for(int i = 0; i <= 5 ; i++){
		do{
			System.out.println("Dame dos numeros");
			try{
			    dividendo = sc.nextInt();
			    divisor = sc.nextInt();
			    System.out.print("Resultado: " + (dividendo/divisor));
			    hay_error = false;
			}
			catch(InputMismatchException e){
				System.err.println("Error, no es un numero entero");
				sc.nextLine();
				hay_error = true;
			}
		}while(hay_error);
	  }
		
	}

}
