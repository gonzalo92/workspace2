package Ejemplos;

import java.util.ArrayList;
import java.util.Collection;

public class Colecciones2 {

	public static void main(String[] args) {
		Collection <String> c = new ArrayList<String>();
		String cadena = "ASIR";
		
		c.add("DAW");
		c.add("DAM");
		c.add(cadena);
		System.out.println(c.size());//Nos dice el tamaño
		System.out.println(c);
		for (String string : c) {
			System.out.println(string);
		}
		//c.remove(cadena);te borra uno

	}

}
