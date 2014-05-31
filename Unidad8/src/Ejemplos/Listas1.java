package Ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Listas1 {

	public static void main(String[] args) {
		List <String> c = new ArrayList<String>();
		String cadena = "ASIR";
		
		c.add("DAW");
		c.add("DAM");
		c.add(cadena);
		
		c.add(2, "inserccioon");//Añade
		c.set(0, "otra cadena");//Modifica la posición
		//c.set(5, "excepcion");
		c.add(c.size(),"Inserccion");
		System.out.println(c);

	}

}
