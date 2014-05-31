package Ejercicio1;

import java.util.Scanner;

public class Empleado implements Persona{
	private String nombre;
	private int edad;
	private String oficio;

	@Override
	public String pedirDatos() {
		
		nombre="Pepe";
		edad=42;
		oficio="Dependiente";
		return null;
	}

	@Override
	public String visualizarDatos() {
		System.out.println("----------------------EMPLEADO----------------------");
		System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+edad);
        System.out.println("Telefono:"+oficio);
		return null;
	}
	
}
