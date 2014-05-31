package primeros_proyectos;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		//Crea un programa que pida un peso en Kilogramos y realice la conversión a onzas, sabiendo que 1 Kilogramo (Kg) = 35.2739619 Onzas (oz)
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner(System.in);
		float kilogramos;
		float onzas;
		System.out.println("Dame tu peso en kilogramos:");
		kilogramos= teclado.nextFloat();
		System.out.println("tu peso en onzas es:");
		onzas=(float) 35.2739619*kilogramos;
		System.out.println(onzas);
		

	}

}
