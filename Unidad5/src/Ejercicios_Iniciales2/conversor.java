package Ejercicios_Iniciales2;

public class conversor {
	public double millas;
	public double kilometros;
	public double getMillas() {
		
		double mill = 0;
		double met = 1852 ;
		millas = mill * met;
		return millas;
		
	}
	public void setMillas(double millas) {
		this.millas = millas;
	}
	public double getKilometros() {
		
		return kilometros;
	}
	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}
}