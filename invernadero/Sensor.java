package t11.invernadero;

public class Sensor {
	
	 int identificador;

	
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public Sensor() {}
	public Sensor(int identificador) {
		this.identificador=identificador;
	}

	@Override
	public String toString() {
		return "Sensor [identificador=" + identificador + "]";
	}

		
}
