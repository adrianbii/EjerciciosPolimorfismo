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
		System.out.println("Introduce los lenguajes");
		for (int i = 0; i < nl; i++) {
			
			lenguajes[i] = in.nextLine();

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
