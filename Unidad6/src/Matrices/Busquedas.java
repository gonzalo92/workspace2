package Matrices;
import java.util.*;
public class Busquedas {

	public static void main(String[] args) {
	int [] numeros={3,6,3,76,89,5,2};
	int[] ordenado;
	System.out.println(Arrays.toString(numeros));
	ordenado = Arrays.copyOf(numeros, numeros.length);
	Arrays.sort(numeros);//sirve para ordenar el array de la forma más eficiente
	System.out.println(Arrays.toString(ordenado));
	
	if(Arrays.binarySearch(ordenado, 3)>=0){ //sirve para buscar un elemento en el array
		
		System.out.println("Esta el 3");}
	
	}

}