package Ejercicios;

public class Revista extends Publicaci�n {

	private int n�mero;

	public int getN�mero() {
		return n�mero;
	}

	public void setN�mero(int i) {
		this.n�mero = i;
	}
	@Override
	public String toString() {
		return super.toString()+ " " + this.n�mero + "numeros al a�o";
	}
}
