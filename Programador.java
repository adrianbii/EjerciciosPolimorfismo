package t11;

import java.util.Arrays;
import java.util.Scanner;

public class Programador {

	String nivel;
	String[] lenguajes;

	public Programador(String nivel, String[] lenguajes) {
		this.lenguajes = lenguajes;
		this.nivel = nivel;

	}

	public Programador() {
	}

	public void leerLenguajes(int nl) {

		Scanner in = new Scanner(System.in);
		//inicializar el array
		lenguajes= new String [nl];
		for (int i = 0; i < nl; i++) {
			System.out.println("Introduce los lenguajes");
			lenguajes[i] = in.nextLine();

		}
		
		for (int i = 0; i < lenguajes.length; i++) {
			System.out.println(lenguajes[i]);
		}
	}


	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String[] getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(String[] lenguajes) {
		this.lenguajes = lenguajes;
	}

	@Override
	public String toString() {
		return "Programador [nivel=" + nivel + ", lenguajes=" + Arrays.toString(lenguajes) + "]";
	}
}
