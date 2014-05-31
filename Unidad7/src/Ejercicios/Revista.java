package Ejercicios;

public class Revista extends Publicación {

	private int número;

	public int getNúmero() {
		return número;
	}

	public void setNúmero(int i) {
		this.número = i;
	}
	@Override
	public String toString() {
		return super.toString()+ " " + this.número + "numeros al año";
	}
}
