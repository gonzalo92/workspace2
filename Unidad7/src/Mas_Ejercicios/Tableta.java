package Mas_Ejercicios;

public class Tableta extends Aparato {
	
	private double tama�o;
	private double peso;
	public double getTama�o() {
		return tama�o;
	}
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Tableta [tama�o=" + tama�o + ", peso=" + peso + "]";
	}

}
