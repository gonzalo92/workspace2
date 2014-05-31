package Excepciones;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Modifica el ejercicio 1 para que si el usuario introduce algo que no es un número,
		//vuelva a repetirse el pedir el dividendo y divisor.
		int dividendo=0,divisor=0;
		Scanner sc = new Scanner(System.in);
		boolean hayerror = false;
	
		do{
			System.out.println("Dame dos numeros");
			try{
			    dividendo = sc.nextInt();
			    divisor = sc.nextInt();
			    System.out.print("Resultado: " + (dividendo/divisor));
			    hayerror = false;
			}
			catch(InputMismatchException e){
				System.err.println("Error, no es un numero entero");
				sc.nextLine();
				hayerror = true;
			}
		}while(hayerror);
		
		    
		
		
		
		

	}

}
