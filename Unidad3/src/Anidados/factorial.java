package Anidados;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero= -1;
		String respuesta;
		long factorial;
		System.out.println("calculo de factoriales");
		do{
			do{
				System.out.print("Dame un numero positivo");
			numero=teclado.nextInt();
			
			}while(numero<0);
			
			factorial=1;
			if(numero==0){
			for(int i = 1;i<=numero;i++)
				
				factorial =factorial * i;
			}
			
			System.out.println("El factorial de " + numero + " es " + factorial);
			
			do{
			System.out.println("¿quieres insertar otro numero s/ n");
			respuesta=teclado.next();
			}while(!respuesta.equals("s")&& !respuesta.equals("n"));
		}while(respuesta.equals("s"));

	}

}
