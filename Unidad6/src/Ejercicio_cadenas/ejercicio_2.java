package Ejercicio_cadenas;

import java.util.StringTokenizer;

public class ejercicio_2 {

	public static void main(String[] args) {
		// Cadena de texto
		String sTexto =  "El perro de San Roque. Fin.";
		// Particionador
		StringTokenizer stTexto = new StringTokenizer(sTexto);
		//Volcamos el número de palabras separadas
		System.out.println ("El numero de palabras de la frase \"" + sTexto + "\" son " + stTexto.countTokens());
	}

}
