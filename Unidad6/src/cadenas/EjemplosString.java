package cadenas;

public class EjemplosString {

	public static void main(String[] args) {
		String cadena ="cadena";
		
		cadena = new String("otra cadena");
		cadena = cadena+"Hola cadena";
		
		if(cadena.equals("otra cadena hola cadena"))
			System.out.println("cadenas iguales");
		
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena);
		
		String nombre1="Inma",nombre2="Gonzalo";
		
		System.out.println(nombre1.compareTo(nombre2));
		System.out.println(nombre2.compareTo(nombre1));
		
		System.out.println(cadena.contains("cadena"));
		
		String numeroCadena =  String.valueOf(0.7f);
		System.out.println(String.valueOf(0.7f));
		
		System.out.println(cadena.substring(11,cadena.length()));

	}

}
