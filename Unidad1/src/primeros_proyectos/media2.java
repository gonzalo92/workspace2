package primeros_proyectos;

import java.util.Scanner;

public class media2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		float numero1,numero2;
		float media;
		Scanner teclado = new Scanner(System.in); 
		System.out.print("Dame los dos numeros: ");
		
		numero1=teclado.nextFloat();
		
		numero2=teclado.nextFloat(); 
		//la "f" hace referencia a float
		media= (numero1+numero2) / 2;
		System.out.print("La media es: " + media);
		
		 
		

	}

}
