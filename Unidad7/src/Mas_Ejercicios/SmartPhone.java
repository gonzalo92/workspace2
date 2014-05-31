package Mas_Ejercicios;

import java.util.Arrays;

public class SmartPhone extends Aparato {
	String[] transmisionSoportada=new String[20];

	public String[] getTransmisionSoportada() {
		return transmisionSoportada;
	}

	public void setTransmisionSoportada(String[] transmisionSoportada) {
		this.transmisionSoportada = transmisionSoportada;
	}

	@Override
	public String toString() {
		return "SmartPhone [transmisionSoportada="
				+ Arrays.toString(transmisionSoportada) + "]";
	}
	 public void addTecnología(String añadir){
		 
	 }
	
}