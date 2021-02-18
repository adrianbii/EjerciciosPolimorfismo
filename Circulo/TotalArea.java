package Circulo;

public class TotalArea {
	  public static void main(String[] args) {
	    Circulo[] arrayCirculo;
	    arrayCirculo = creaArrayCirculo();
	    imprimirArrayCirculo(arrayCirculo);
	  }
	  /** Creación de arrays de Circulos */
	  public static Circulo[] creaArrayCirculo() {
	    Circulo[] arrayCirculo = new Circulo[5];
	    for (int i = 0; i < arrayCirculo.length; i++) {
	      arrayCirculo[i] = new Circulo(Math.random() * 100);
	    }
	    return arrayCirculo;
	  }
	  /** Imprimir el array de circulos y mostrar el total de area */
	  public static void imprimirArrayCirculo(Circulo[] arrayCirculo) {
	    System.out.printf("%-30s%-15s\n", "Radio", "Area");
	    for (int i = 0; i < arrayCirculo.length; i++) {
	      System.out.printf("%-30f%-15f\n", arrayCirculo[i].getRadius(), arrayCirculo[i].getArea());
	    }
	    System.out.println("-----------------------------------------");
	    // Muestra la suma de areas
	    System.out.printf("%-30s%-15f\n", "El total de areas de circulos es ", sum(arrayCirculo));
	  }
	  /** Suma las areas del array */
	  public static double sum(Circulo[] arrayCirculo) {
	    double sum = 0;

	    for (int i = 0; i < arrayCirculo.length; i++) {
	      sum += arrayCirculo[i].getArea();
	    }
	    return sum;
	  }
	}