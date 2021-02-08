package t11;

import java.util.Arrays;
import java.util.Scanner;

public class Profesor {

	int experiencia;
	String[] cursos = new String[5];

	public Profesor(int experiencia, String[] cursos) {
		this.experiencia = experiencia;
		this.cursos = cursos;
	}

	public Profesor() {
	}

	public void leerCursos() {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < cursos.length; i++) {
			cursos[i] = in.nextLine();
		}

		for (int i = 0; i < cursos.length; i++) {
			System.out.println(cursos[i]);
		}

	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Profesor [experiencia=" + experiencia + ", cursos=" + Arrays.toString(cursos) + "]";
	}

}
