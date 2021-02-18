package PaqueteEmpleado;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Empleado {

	String DNI;
	String nombre;
	String direccion;
	String telefono;
	
	public Empleado() {
		
	}
	public Empleado(String DNI, String nombre, String direccion, String telefono) {

		this.DNI = DNI;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void leerDatos(){
		Scanner input = new Scanner(System.in);
		System.out.print("DNI: ");
		this.DNI = input.next();
		System.out.print("Nombre: ");
		this.nombre = input.next();
		System.out.print("direccion: ");
		this.direccion = input.next();
		System.out.print("telefono: ");
		this.telefono = input.next();
	}
	@Override
	public String toString() {
		return "Empleado: DNI=" + DNI + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		return true;
	}
	public int compareTo(Empleado e){
        if(e.getDNI() != this.DNI)
            return -1 ;
        else 
            return 0;
    }
}
