package primeros_proyectos;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		//Calculen el perímetro y área de un rectángulo dada su base y su altura.
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner(System.in);
		float base;
		float altura;
		@SuppressWarnings("unused")
		float perímetro;
		@SuppressWarnings("unused")
		float area;
		System.out.println("Dame la base: ");
		base= teclado.nextFloat();
		System.out.println("Dame la altura: ");
		altura= teclado.nextFloat();
		System.out.println("El perimetro es: ");
		float perimetro = 2*(base+altura);
		System.out.println(perimetro+" cm");
		System.out.println("El area es: ");
		float area1= base*altura;
		System.out.print(area1+" cm2");
		
		
		
		
		
		

	}

}
