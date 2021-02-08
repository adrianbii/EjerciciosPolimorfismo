package t11.PaqueteVehiculo;

public class Camion extends Vehiculo{
	int tonelage;
	String tipoRemolque;
	
	public Camion() {
	}
	public Camion(String marca, String modelo, String color, int añoMatricula, int tonelage, String tipoRemolque) {
		super(marca, modelo, color, añoMatricula);
		this.tonelage = tonelage;
		this.tipoRemolque=tipoRemolque;
	}
	public int getTonelage() {
		return tonelage;
	}
	public void setTonelage(int tonelage) {
		this.tonelage = tonelage;
	}
	public String getTipoRemolque() {
		return tipoRemolque;
	}
	public void setTipoRemolque(String tipoRemolque) {
		this.tipoRemolque = tipoRemolque;
	}
	@Override
	public String toString() {
		return super.toString()+", tonelage=" + tonelage + ", tipoRemolque=" + tipoRemolque;
	}
	
}
