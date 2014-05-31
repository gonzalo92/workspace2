package Excepciones;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static int al1(){
			Scanner sc = new Scanner(System.in);
			String nombre = sc.next();
			double altura = sc.nextDouble();
			int edad = sc.nextInt();
			System.out.println("Alumno 1");
			System.out.println("El nombre : " + nombre + " Altura" + altura + " Edad " + edad );
			sc.close();
			return edad;
			
	}
	public static int al2(){
		Scanner sc = new Scanner(System.in);
		String nombre2 = sc.next();
		double altura2 = sc.nextDouble();
		int edad2 = sc.nextInt();
		System.out.println("Alumno 2 ");
		System.out.println("El nombre: " + nombre2 + " Altura" + altura2 + " Edad " + edad2 );
		sc.close();
		return edad2;
	}

	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida los datos de dos alumnos. 
		 * De dichos alumnos nos interesa nombre, edad y altura. 
		 * Visualiza los datos de dichos alumnos diciendo cual es el mayor (o si tienen la misma edad). 
		 * Si se produjese un error IOException, se mostrará un mensaje y se terminará el programa. 
		 * Puedes usar System.exit(-1); Si el usuario introduce un valor 
		 * erróneo (InputMismatchException) volverá a pedir el dato correspondiente.
		 */
		
		System.out.println(al1());
		System.out.println(al2());
		int alumno = al1();
		int alumno2 = al2();
		
		if(alumno >= alumno2){
			System.out.println("Alumno 1 es el mayor " + alumno);
		}else{
			System.out.println("El alumno 2 es el mayor ");
		}
		
		
		
	}

}
