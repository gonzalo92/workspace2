package Bucles;

import java.util.Scanner;

public class Tablas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Tabla del :");
		int numero = teclado.nextInt();
		int linea,multiplicacion;
		
		//acumuladores
		
        linea=1;
		
	   do{
	    	System.out.println(numero + " x  " + linea + " = " + (numero * linea));
	    	linea++;
	    	
	       }while (linea<=10);
	    
	}

}
