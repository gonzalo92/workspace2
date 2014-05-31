package Ejercicios_Iniciales2;

public class Finanzas {

	public double dolaresToEuros;
	public double eurosToDolares;
	
	public int dolaresToEuros(){
		double dolar = 0;
		double euro = 1.36;
		double conver = 0;
		conver = dolar * euro;
		return (int) conver;
	}
	public double getDolaresToEuros() {
		return dolaresToEuros;
	}
	public void setDolaresToEuros(double dolaresToEuros) {
		this.dolaresToEuros = dolaresToEuros;
	}
	public double getEurosToDolares() {
		return eurosToDolares;
	}
	public void setEurosToDolares(double eurosToDolares) {
		this.eurosToDolares = eurosToDolares;
	}
	
	
	
}
