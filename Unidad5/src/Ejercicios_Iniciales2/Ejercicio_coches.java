package Ejercicios_Iniciales2;

public class Ejercicio_coches {

	public static void main(String[] args) {
		/*
		 * Crea la clase Coche con dos constructores. Uno no toma par�metros y el otro s�.
		 * Los dos constructores inicializar�n los atributos marca y modelo de la clase. 
		 * Crea dos objetos (cada objeto llama a un constructor distinto) y verifica que todo funciona correctamente.
		 */
		Coche marca , modelo;
		
		marca = new Coche();
		modelo = new Coche();
		String ford = null;
		String Focus = null;
		marca.marcaModelo(ford, Focus);
		
		
		System.out.println(" ");
       
	}
	
}
