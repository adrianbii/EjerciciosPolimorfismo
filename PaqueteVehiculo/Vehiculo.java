package PaqueteVehiculo;

import java.util.Calendar;

public class Vehiculo {

String marca;
String modelo;
String color;
int añoMatricula;
public Vehiculo() {
}
public Vehiculo(String marca, String modelo, String color, int añoMatricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.añoMatricula = añoMatricula;
	}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getAñoMatricula() {
	return añoMatricula;
}
public int getAntiguedad() {
	Calendar cal= Calendar.getInstance();
	int añoActual= cal.get(Calendar.YEAR);
	return añoActual-this.añoMatricula;
}
public void setAñoMatricula(int añoMatricula) {
	this.añoMatricula = añoMatricula;
}
@Override
public String toString() {
	return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", AñoMatricula=" + añoMatricula
			+ "]";
}


}
