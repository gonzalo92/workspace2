package Mas_Ejercicios;

public class ParadaActividad extends Parada {
	private String nActividad;
	private double precio;

	public ParadaActividad(String nombreCiudad, String hbajada, String hSalida) {
		super(nombreCiudad, hbajada, hSalida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ParadaActividad [nActividad=" + nActividad + ", precio="
				+ precio + "]";
	}

	public String getnActividad() {
		return nActividad;
	}

	public void setnActividad(String nActividad) {
		this.nActividad = nActividad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}