package t11.invernadero;

public class Actuador {
	int id_Actuador;
	Sensor sensor = new Sensor(3);
	public Sensor getSensor() {
		id_Actuador=sensor.identificador;
		return sensor;
	}
	

}
