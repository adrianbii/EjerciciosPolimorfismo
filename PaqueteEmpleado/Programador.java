package PaqueteEmpleado;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programador extends Empleado {

	String nivel;
	ArrayList<String> lenguajes=new ArrayList<String>();
	
	public Programador() {
		super();
	}
	public Programador(String DNI, String nombre, String direccion, String telefono, String nivel, ArrayList<String> lenguajes) {
		super(DNI, nombre, direccion, telefono);
		this.nivel=nivel;
		this.lenguajes=lenguajes;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public ArrayList<String> getLenguajes() {
		return lenguajes;
	}
	public void setLenguajes(ArrayList<String> lenguajes) {
		this.lenguajes = lenguajes;
	}
	@Override
	public void leerDatos() {
		
		super.leerDatos();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nivel: ");
		this.nivel = input.next();

		System.out.print("Lenguajes: /n ¿Desea insertar algun lenguajes? (s o n)");
		char op = input.next().charAt(0);
		while (op != 'n') {
			this.lenguajes.add(input.next());
			System.out.print("¿Desea continuar? (s o n)");
			op = input.next().charAt(0);
		}			
	}
	@Override
	public String toString() {
		return super.toString()+", nivel=" + nivel + ", Lenguajes=" + lenguajes.toString();
	}

	

}
