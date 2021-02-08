package t11;

import java.util.Date;
import java.util.Scanner;

public class Administrativo {

	String funcion;
	Date fechaContrato = new Date();

	public Administrativo(String funcion) {
		Scanner in = new Scanner(System.in);
		this.funcion = funcion;
		this.fechaContrato = new Date();
	}

	public Administrativo() {
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	@Override
	public String toString() {
		return "Administrativo [funcion=" + funcion + ", fechaContrato=" + fechaContrato + "]";
	}

}
