package primeros_proyectos;

import java.util.Scanner;

public class cadenas {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		String nombre;
		nombre=teclado.nextLine();
		
		System.out.print("Hola "+nombre);

	}

}
