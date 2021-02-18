package Circulo;
//Crea tres objetos circulo y muestra el total de objetos creados.
public class TestCirculo {

	  public static void main(String[] args) {
	    Circulo miCirculo = new Circulo(5.0);
	    System.out.println("El area del circulo con radio "
	      + miCirculo.getRadius() + " es " + miCirculo.getArea());

	    miCirculo.setRadius(miCirculo.getRadius() * 1.1);
	    System.out.println("El area del circulo con radio "
	      + miCirculo.getRadius() + " es " + miCirculo.getArea());
	    
	    System.out.println("El número de objetos creados es "
	      + Circulo.getNumeroObjetos());
	  }
	}