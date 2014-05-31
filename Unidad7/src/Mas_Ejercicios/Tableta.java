package Mas_Ejercicios;

public class Tableta extends Aparato {
	
	private double tamaño;
	private double peso;
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Tableta [tamaño=" + tamaño + ", peso=" + peso + "]";
	}

}
