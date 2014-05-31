package Condicionales;

import java.util.Scanner;

public class Ejercicio7_Juego {

	public static void main(String[] args) {
		int ordenador;
		String juego_ordenador;
		
		ordenador= (int) (Math.random()* 3 + 1);
		if(ordenador == 1) juego_ordenador="piedra";
		else if(ordenador==2) juego_ordenador="papel";
		else juego_ordenador="tijera";
		//Usuario elige su juego
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--Juego/piedra/papel/tijera");
		System.out.println("¿que sacas? [piedra, papel, tijera]");
		String juego_usuario;
		juego_usuario=teclado.next();
		juego_usuario=juego_usuario.toLowerCase();//para convertir mayusculas en minusculas
		
		if(!(juego_usuario.equals("piedra") ||
				juego_usuario.equals("papel") || 
				juego_usuario.equals("tijera")) )
		{
			System.out.println("Error: no has escrito un juego correcto ");
			
		}
		else{
			if(juego_usuario.equals(juego_ordenador)){
				System.out.println("empate ");
			}else if(juego_usuario.equals("piedra")&& juego_ordenador.equals("tijera")||
				juego_usuario.equals("papel")&& juego_ordenador.equals("piedra")||
				juego_usuario.equals("tijera")&& juego_ordenador.equals("papel")){
				System.out.println("ganaste");
			}else{
				System.out.println("perdiste");
			}
				
				
		}
			
		

	}

}
