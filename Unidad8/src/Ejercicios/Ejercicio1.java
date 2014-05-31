package Ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {
	/*
	 * 1-Crea una coleccion, de tipo ArrayList que cargue 10 números por
	 * teclado. Despúes recorrera la coleccion y devolvera la cantidad de
	 * nunmeros positivos, cero y negativos.
	 * 
	 * 2-Crear una coleccion de caracteres que se iran introduciendo por
	 * teclado, Hasta que se introduzca un *. decir si hay algun caracter
	 * duplicado.
	 * 
	 * 3-Crear una coleccion con los primeros x numeros de la serie de
	 * fibonacci, donde X es un numero que pedireis al usuario. Despues pregunta
	 * numeros y di si esta o no en la coleccion. El programa terminara cuando
	 * el usuario introduzca un 0. (programacion sd editores 978 04 938017 9 3)
	 */
	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		/*Collection colec = new ArrayList();
		int pos = 0, neg = 0, cero = 0;
		int n = 0;
		for (int i = 0; i < 10; i++) {
			n = sc.nextInt();
			colec.add(n);
		}
		//for (i = 0; i < colec.size(); i++)*/
		/*int n=0;
		Collection colec = new ArrayList();
		for (int i = 0; i < 10; i++) {
			 n = sc.nextInt();
			colec.add(n);
		}
       
		for (Object object : colec) {
			System.out.println(colec + " : " + colec.contains(colec));
		}	*/
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++){
			numeros.add(sc.nextInt());
		}
		int positivos=0,negativos=0;
		for(int i = 0;i < 10; i++){
			if(numeros.get(i)> 0){
				positivos++;
			}else if(numeros.get(i)<0){
				negativos++;
			}
			System.out.println("Positivos" + positivos);
			System.out.println("Negatios" + negativos);
			System.out.println("ceros" +(10-positivos - negativos));
		}
	}
}