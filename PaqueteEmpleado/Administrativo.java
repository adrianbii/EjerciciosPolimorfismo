package PaqueteEmpleado;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Administrativo extends Empleado{
	

	String funcion;
	LocalDate fechaContrato;
	static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");// Creamos un formato de fecha

	public Administrativo() {
		super();
	}
	public Administrativo(String DNI, String nombre, String direccion, String telefono, String funcion,LocalDate fechaContrato) {
		super(DNI, nombre, direccion, telefono);
		this.funcion=funcion;
		this.fechaContrato =fechaContrato;
	}
	

	public String getFuncion() {
		return funcion;
	}
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	public LocalDate getFechaContrato() {
		return fechaContrato;
	}
	public void setFechaContrato(LocalDate fechaContrato) {
		this.fechaContrato = fechaContrato;
	}
	// Permita leer de teclado los datos del objeto.
	
	public void leerDatos(){
		
		super.leerDatos();
		
		Scanner input = new Scanner(System.in);
		System.out.print("funcion: ");
		this.funcion = input.next();

		System.out.print("fechaContrato: ");
		String fechaContrato = input.next();
		this.fechaContrato = LocalDate.parse(fechaContrato, formato); // Creamos un LocalDate con la entrada en el formato especificado

	}
	@Override
	public String toString() {
		return super.toString()+", funcion=" + funcion + ", fechaContrato=" + fechaContrato.format(formato);
	}
	
	
}
