package PaqueteEmpleado;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Profesor extends Empleado{

	int experiencia;
	ArrayList<String> cursos=new ArrayList<String>();
	
	public Profesor() {
		super();
	}
	
	public Profesor(String DNI, String nombre, String direccion, String telefono, int experiencia, ArrayList<String> cursos) {
		super(DNI, nombre, direccion, telefono);
		this.experiencia=experiencia;
		this.cursos=cursos;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public ArrayList<String> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<String> cursos) {
		this.cursos = cursos;
	}
	public void leerDatos() {
		
		super.leerDatos();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Experiencia: ");
		this.experiencia = input.nextInt();

		System.out.print("Cursos: /n ¿Desea insertar algun curso? (s o n)");
		char op = input.next().charAt(0);
		while (op != 'n') {
			this.cursos.add(input.next());
			System.out.print("¿Desea continuar? (s o n)");
			op = input.next().charAt(0);
		}			
	}
	@Override
	public String toString() {
		return super.toString()+", experiencia=" + experiencia + ", cursos=" + cursos.toString();
	}

}
