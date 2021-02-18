package Circulo;

public class Circulo {
	  
	  private double radio=1;
	  private static int numeroObjetos = 0;

	  public Circulo() {
		  numeroObjetos++;
	  }
  	  public Circulo(double nuevoRadio) {
		  radio = nuevoRadio;
		  numeroObjetos++;
	  }
	  public double getRadius() {
	    return radio;
	  }
	  public void setRadius(double nuevoRadio) {
	    radio = (nuevoRadio >= 0) ? nuevoRadio : 0;
	  }
	  public static int getNumeroObjetos() {
	    return numeroObjetos;
	  }
	  public double getArea() {
	    return radio * radio * Math.PI;
	  }
	}