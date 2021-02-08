package t11.PaqueteVehiculo;

public class Moto extends Vehiculo{
	int cilindrada;
	
	public Moto() {	
	}
	public Moto(String marca, String modelo, String color, int aņoMatricula,int cilindrada) {
		super(marca, modelo, color, aņoMatricula);
		this.cilindrada=cilindrada;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	@Override
	public String toString() {
		return super.toString()+", cilindrada=" + cilindrada;
	}

}
