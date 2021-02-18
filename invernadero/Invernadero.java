package t11.invernadero;

public class Invernadero {

	int humedad_Suelo;
	int temperatura;
	int humedad_Aire;

	int leerHumedadSuelo(int nSensor) {
		humedad_Suelo=(int) Math.random()*99+1;
		return humedad_Suelo;

	}

	int leerHumedadAire(int nSensor) {
humedad_Aire=(int) Math.random()*99+1;
		return humedad_Aire;

	}

	int leerTemperatura(int nSensor) {
temperatura=(int) Math.random()*(-20-79+1)+(-20);
		return temperatura;
	}
	
	void abreRiego (int nActuador) {}
	void cierraRiego(int nActuador) {}
	
	//Declarar Remolacha y Trigo
	
	void controlaSensores(Sensor []sensores) {}
}