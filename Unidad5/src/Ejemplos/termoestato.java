package Ejemplos;

import java.util.Scanner;

public class termoestato {

	public enum Estados {
		ENCENDIDO, APAGADO
	};

	public Estados estado;

	public String toString() {
		if (estado == Estados.ENCENDIDO)
			return "Encendido";
		else
			return "Apagado";
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		termoestato t = new termoestato();
		while (true) {
			System.out.println("1. Apagar");
			System.out.println("2. Encender");
			System.out.println("¿Qhe hacer?");

			if (sc.nextInt() == 1)
				t.estado = Estados.APAGADO;
			else
				t.estado = Estados.ENCENDIDO;

			System.out.println("El termostato está: " + t);
		}

	}

}
