package PaqueteVehiculo;

public class Coche extends Vehiculo {

	int nPuertas;
	String estilo;
	
	public Coche() {	
	}
	public Coche(String marca, String modelo, String color, int a�oMatricula, int nPuertas, String estilo) {
		super(marca, modelo, color, a�oMatricula);
		this.nPuertas=nPuertas;
		this.estilo=estilo;	
	}
	public int getnPuertas() {
		return nPuertas;
	}
	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	@Override
	public String toString() {
		return super.toString() + ", nPuertas=" + nPuertas + ", estilo=" + estilo;
	}
	
}
