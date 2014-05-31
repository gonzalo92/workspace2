package Excepciones;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Modifica el ejercicio 3 para que si el usuario tiene más de 5 errores muestre el mensaje
		//"Demasiados fallos. Vuelve a intentarlo otro día".uelva a repetirse el pedir el dividendo y divisor.
		int dividendo=0,divisor=0;
		Scanner sc = new Scanner(System.in);
		boolean hayerror = false;
	for(int i = 5; i <=5; i--){
		
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

}
