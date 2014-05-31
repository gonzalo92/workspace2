package Ejercicio1;

import java.util.Scanner;

public class Cliente implements Persona {
	
	private String nombre;
	private int edad;
	private int telefono;
	private String dni;
	
	
	public String  pedirDatos() {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Ingrese nombre:");
		 nombre=sc.next();
		 System.out.print("Ingrese edad:");
		 edad=sc.nextInt();
		 System.out.print("Ingrese telefono:");
		 telefono=sc.nextInt();
		 System.out.print("Ingrese dni:");
		 dni=sc.next();
		 return null;

	}

	public String visualizarDatos() {
		System.out.println("----------------------CLIENTE----------------------");
		System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+edad);
        System.out.println("Telefono:"+telefono);
        System.out.println("DNI:"+dni);
		
		return null;
	}

}
