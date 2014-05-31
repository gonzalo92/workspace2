package Mas_Ejercicios;

public class Parada extends Viaje {
	
	public Parada(String nombreCiudad, String hbajada, String hSalida) {
		super();
		this.nombreCiudad = nombreCiudad;
		this.hbajada = hbajada;
		this.hSalida = hSalida;
	}
	@Override
	public String toString() {
		return "Parada [nombreCiudad=" + nombreCiudad + ", hbajada=" + hbajada
				+ ", hSalida=" + hSalida + "]";
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	public String getHbajada() {
		return hbajada;
	}
	public void setHbajada(String hbajada) {
		this.hbajada = hbajada;
	}
	public String gethSalida() {
		return hSalida;
	}
	public void sethSalida(String hSalida) {
		this.hSalida = hSalida;
	}
	private String nombreCiudad;
	private String hbajada;
	private String hSalida;

}
