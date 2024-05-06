package cine;

import java.util.Objects;

public class Entrada {
	private final int numSala;
	private int numButaca;
	private final double precio;

	public Entrada(int numSala, int numButaca, double precio) {
		this.numSala = numSala;
		this.numButaca = numButaca;
		this.precio = precio;
	}

	public int getNumSala() {
		return numSala;
	}

	public int getNumButaca() {
		return numButaca;
	}

	public void setNumButaca(int numButaca) {
		this.numButaca = numButaca;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "[Sala: " + numSala + "][Butaca: " + numButaca + "][Precio: " + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrada other = (Entrada) obj;
		return Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

}
