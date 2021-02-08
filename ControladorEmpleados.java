package t11;

public class ControladorEmpleados {

	public static void main(String[] args) {

		Empleado miEmpleado = new Empleado("44248738N", "adrian", "huelva 24", "648576654");
		Administrativo administrativo1 = new Administrativo("I ");
		Programador programador1 = new Programador();
		Profesor profesor1 = new Profesor();

		programador1.leerLenguajes(3);
		programador1.setNivel(" Junior ");
		
		// administrativo1.setFechaContrato(fechaContrato); paranoia con dar la fecha
		//administrativo1.getFechaContrato();
		
		profesor1.setExperiencia(3);
		profesor1.leerCursos();
		
		System.out.println(miEmpleado.toString());
		System.out.println(administrativo1.toString());
		System.out.println(profesor1.toString());
		System.out.println(programador1.toString());
	}

}
