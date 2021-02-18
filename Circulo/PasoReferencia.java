package Circulo;
// Ejercicio para mostrar el paso por valor o por referencia
public class PasoReferencia {
	  
	  public static void main(String[] args) {
	    //Crea un circulo con radio 1
	    Circulo miCirculo = new Circulo(1);

	    // Imprime las areas 1,2,3,4 y 5
	    int n = 5;
	    imprimeAreas(miCirculo, n);

	    System.out.println("\n" + "Radio " + miCirculo.getRadius());
	    System.out.println("n es " + n);
	  }

	  public static void imprimeAreas(
	      Circulo c, int veces) {
	    System.out.println("Radio \t\tArea");
	    while (veces >= 1) {
	      System.out.println(c.getRadius() + "\t\t" + c.getArea());
	      c.setRadius(c.getRadius() + 1);
	      veces--;
	    }
	  }
	}