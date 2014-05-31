package Mas_Ejercicios;

import java.util.Arrays;

public class Viaje {
	private int codigo;
	private String nombre;
	private String hSalida;
	private String hRegreso;
	private Parada[] paradas;

	public Viaje(int codigo, String nombre, String hSalida, String hRegreso,
			Parada[] paradas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.hSalida = hSalida;
		this.hRegreso = hRegreso;
		this.paradas = paradas;
	}

	public Viaje() {

	}

	@Override
	public String toString() {
		return "Viaje [codigo=" + codigo + ", nombre=" + nombre + ", hSalida="
				+ hSalida + ", hRegreso=" + hRegreso + ", paradas="
				+ Arrays.toString(paradas) + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String gethSalida() {
		return hSalida;
	}

	public void sethSalida(String hSalida) {
		this.hSalida = hSalida;
	}

	public String gethRegreso() {
		return hRegreso;
	}

	public void sethRegreso(String hRegreso) {
		this.hRegreso = hRegreso;
	}

	public Parada[] getParadas() {
		return paradas;
	}

	public void setParadas(Parada[] paradas) {
		this.paradas = paradas;
	}
}