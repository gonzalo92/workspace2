package EjerciciosInicial;

import java.util.Scanner;

public class Ejercicio7_Operacion {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		int multiplicacion;
		int division;
		int resta;
		int suma;
		String operacion;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el numero 1 ");
		numero1= teclado.nextInt();
		System.out.println("Dame el numero 2 ");
		numero2= teclado.nextInt();
	    System.out.println("Dame un signo: ");
	    operacion = teclado.next();
	    
	    
		
		suma = numero1 + numero2 ;
		resta= numero1 - numero2 ;
		multiplicacion = numero1 * numero2;
		division= numero1 / numero2;
		
		if(operacion.equals("+")){
			System.out.println("El resultado es " + suma);
		}else if(operacion.equals("-")){
			System.out.println("El resultado es " + resta);
		}else if(operacion.equals("*")){
			System.out.println("El resultado es " + multiplicacion);
			
		}else if(operacion.equals("/")){
			System.out.println("el resultado es " + division);
		}else{
			System.out.println("No has metido el signo bien ");
		}
		 
		
	}

}
