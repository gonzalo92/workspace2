package Ejemplos;

import java.util.HashSet;
import java.util.Iterator;

public class Conjuntos {

	public static void main(String[] args) {
		HashSet<String> miscadenas = new HashSet<String>();
		
		miscadenas.add("DAW");
		miscadenas.add("ASIR");
		
		System.out.println(miscadenas);
		if(miscadenas.contains("DAW"))
			System.out.println("DAW es un ciclo");
		miscadenas.add("DAW");
		System.out.println(miscadenas);
		
		Iterator<String> i=miscadenas.iterator();
		while(i.hasNext()){
			i.next();
		}
		
		miscadenas.remove("DAW");
		System.out.println(miscadenas);


	}

}
