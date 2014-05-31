package Ejercicio1;

import java.util.Scanner;

public class PruebaEjercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Empleado empleado = new Empleado();
		cliente.pedirDatos();
		cliente.visualizarDatos();
		empleado.pedirDatos();
		empleado.visualizarDatos();
		Object nombreEmpresa = sc.next();
		
	}

}
