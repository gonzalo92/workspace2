package Ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio2 {
	/*
	 * 2-Crear una coleccion de caracteres que se iran introduciendo por
	 * teclado, Hasta que se introduzca un *. decir si hay algun caracter
	 * duplicado.
	 */

	public static void main(String[] args) {
		/*
		 * List<String> list = new ArrayList<String>(); String n = null; Scanner
		 * sc = new Scanner(System.in); n=sc.next(); // while(n){ //
		 * list.add(n); // System.out.println("Fin del metodo"); // } for(;;){
		 * if(n =="*") break; list.add(n); } Set<String> set = new
		 * HashSet<String>(list); for (String key : set) {
		 * System.out.println(key + " : " + Collections.frequency(list, key)); }
		 */
		HashSet<Character> caracteres = new HashSet<Character>();
		Scanner sc = new Scanner(System.in);
		char leido = ' ';
		boolean repetidos = false;
		while (leido != '*') {
			leido = sc.next().charAt(0);

			if (caracteres.contains(leido))
				repetidos = true;
			caracteres.add(leido);
		}
		if (repetidos)System.out.println("se introdujeron caracteres");
		System.out.println(caracteres);
	}

}
