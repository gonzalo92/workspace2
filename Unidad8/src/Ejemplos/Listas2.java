package Ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Listas2 {
	
	public static void main(String[] args) {
		ArrayList <String> c = new ArrayList<String>();
		String cadena = "ASIR";
		
		c.ensureCapacity(1000);
		c.add("DAW");
		c.add("DAM");
		c.add(cadena);
		
		c.add(2, "casa");//A�ade
		c.set(0, "otra cadena");//Modifica la posici�n
		//c.set(5, "excepcion");
		//c.add(c.size(),"Insercion");
		c.remove("casa");//Elimina todos los que llevan este nombre
		System.out.println(c);

		
	}
}
