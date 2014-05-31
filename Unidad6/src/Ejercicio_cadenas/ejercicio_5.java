package Ejercicio_cadenas;

public class ejercicio_5 {
//Rotar una cadena a la derecha tantas veces como nos digan. 
//El programa pedirá la cadena y el número de posiciones a rotar, así que si introducimos "Rotaciones de cadena" y el valor 4, 
//nos devolverá "denaRotaciones de ca"
	int rotaciones;
	String mensaje;
	String caracter;
	String clave = "";
	 public String descifrarMensaje(String msj, int rot){
	        mensaje = msj;
	        rotaciones = rot;
	        recorrerMensaje();
	        return clave;
	    }
	private void recorrerMensaje() {
		String decod = "";
        for(int i = 0; i <= mensaje.length() - 1; i++){
            caracter = mensaje.substring(i, i + 1);
            if(!caracter.equals(" ")){
                int posicion = getPosicionCaracter(caracter);
                decod = decrypt(posicion);
                clave += decod;
            }else{
                clave += " ";
            }
        }
    }
	private String decrypt(int posicion) {
		// TODO Auto-generated method stub
		return null;
	}
	private int getPosicionCaracter(String caracter2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {	
	}
}