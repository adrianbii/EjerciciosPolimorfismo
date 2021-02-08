package PaqueteVehiculo;

import java.util.Calendar;

public class Vehiculo {

String marca;
String modelo;
String color;
int a�oMatricula;
public Vehiculo() {
}
public Vehiculo(String marca, String modelo, String color, int a�oMatricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.a�oMatricula = a�oMatricula;
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
public int getA�oMatricula() {
	return a�oMatricula;
}
public int getAntiguedad() {
	Calendar cal= Calendar.getInstance();
	int a�oActual= cal.get(Calendar.YEAR);
	return a�oActual-this.a�oMatricula;
}
public void setA�oMatricula(int a�oMatricula) {
	this.a�oMatricula = a�oMatricula;
}
@Override
public String toString() {
	return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", A�oMatricula=" + a�oMatricula
			+ "]";
}


}
