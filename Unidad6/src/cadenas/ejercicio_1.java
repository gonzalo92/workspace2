package cadenas;

public class ejercicio_1 {
	public static void main(String[] args) {
		String cadena = new String();
		StringBuilder aux = new StringBuilder(cadena);
		String inversa = (new StringBuilder(cadena)).reverse().toString();

		System.out.printf("cadena: %\nInversa: %\n", cadena, inversa);
		if (cadena.equals(inversa)) {
			System.out.println("¡¡Es un palindromo!!");
		} else {
			System.out.println("¡¡No es un palindromo!!");
		}
	}
}