package Excepciones;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Ejemplo1_Excepciones {

	public static void main(String[] args) {
		int dividendo=0,divisor=0;
		Scanner sc = new Scanner(System.in);
		try{
		    dividendo = sc.nextInt();
		    divisor = sc.nextInt();
		}
		catch(InputMismatchException e){
			System.err.println("Error, no es un numero entero");
			System.exit(0);
		}
		catch(NoSuchElementException e){
			System.out.println("Error, no se puede leer de teclado");
			System.exit(0);
		}
		    
		try{
		    System.out.print("Resultado: " + (dividendo/divisor));
		    
		 }
		catch(ArithmeticException error){
			System.out.println("Error, division por cero");
			System.out.println(error.getMessage());
		}
		catch(Exception e){
			System.out.println("Error inesperado");
			System.out.println(e.getMessage());
		}
			
     System.out.println("Adios");
	}

}
