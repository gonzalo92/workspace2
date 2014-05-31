package EjerciciosParaPractica;

import java.util.Scanner;

public class Ejercicio2_Numero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame dos numeros");
		int numero1= teclado.nextInt();
		int numero2= teclado.nextInt();
		
		System.out.println("numero 1: "+ numero1);
		System.out.println("numero 2: "+ numero2);
		
		if(numero1==numero2){
			System.out.println("Dame otros dos numero");
			System.out.println("numero 1: "+ numero1);
			System.out.println("numero 2: "+ numero2);
		} if(numero1>numero2){
			System.out.print(numero1);
			
		}int numeo2 = teclado.nextInt();
		if(numero1< numeo2){
		}else{
			System.out.print(numero2);
		}

	}

}
