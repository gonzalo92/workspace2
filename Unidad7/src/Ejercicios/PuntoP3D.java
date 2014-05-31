package Ejercicios;

public class PuntoP3D extends PuntoP{
    public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	private int z;

	@Override
	public String toString() {
		return "PuntoP3D [z=" + z + "]";
	}
}
