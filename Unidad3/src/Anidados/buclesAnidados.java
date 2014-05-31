package Anidados;

import java.util.Scanner;

public class buclesAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tablas de multiplicar
				Scanner teclado = new Scanner(System.in);
				System.out.print("Tabla del :");
				int numero = teclado.nextInt();
				int linea,multiplicacion;
				
				//con bucle
				for(numero=1;numero<=10;numero++){
				multiplicacion=numero;
				linea=1;
				System.out.println("\ntabla del: " + numero);
			    while(linea<=10){
			    	System.out.println(numero + " x  " + linea + " = " + (multiplicacion));
			    	linea++;
			       }
				}

	}

}
