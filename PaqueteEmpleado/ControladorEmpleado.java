package PaqueteEmpleado;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ControladorEmpleado {

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------");
		System.out.println("1. ALTAS");
		System.out.println("2. BAJAS");
		System.out.println("3. MODIFICACION");
		System.out.println("4. CONSULTA");
		System.out.println("5. ORDENAR LISTA");
		System.out.println("6. Salir");
		System.out.println("-----------------");
		System.out.print("Introduce una opcion: ");
		int valor = input.nextInt();
		System.out.println();
		return valor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();

		int valor = 0;
		while (valor != 6) {
			valor = menu();
			switch (valor) {
			case 1:
				//Dar de alta empleados indicando el tipo concreto. Programador, Administrativo o Profesor
				System.out.println("Seleccione el tipo de empleado:\n1.-Programador\n2.-Administrativo\n3.-Profesor");
				int tipo = input.nextInt();
				if (tipo == 1) {
					Programador obj = new Programador();
					obj.leerDatos();
					listaEmpleado.add(obj);
				} else if (tipo == 2) {
					Administrativo obj = new Administrativo();
					obj.leerDatos();
					listaEmpleado.add(obj);
				} else if (tipo == 3) {
					Profesor obj = new Profesor();
					obj.leerDatos();
					listaEmpleado.add(obj);
				}
				break;
			case 2:
				System.out.println("Busca por DNI: ");
				String buscaDni = input.next();
				int indice = -1;
				// Busca segun el DNI e la lista
				for (Empleado o : listaEmpleado) {
					if (buscaDni.equals(o.getDNI())) {
						indice = listaEmpleado.indexOf(o);
						break;
					}
				}
				// Si existe lo elimina
				if (indice != -1)
					listaEmpleado.remove(indice);
				break;
			case 3:
				System.out.println("Busca por DNI: ");
				buscaDni = input.next();
				// Busca segun el DNI e la lista
				for (Empleado o : listaEmpleado) {
					if (buscaDni.equals(o.getDNI())) { 
						o.leerDatos();//Vuelve a leer los datos, se podría mejorar
						break;
					}
				}
				break;

			case 4:
				//Listado completo del contenido de la lista de Empleados
				for (Object o : listaEmpleado) {
					System.out.println(o.toString());
				}
				break;
			case 5:
				//Ordena segun comparando los nombre de los empleados
				Collections.sort(listaEmpleado, new Comparator<Empleado>() {
					public int compare(Empleado e1, Empleado e2) {
						return e1.getNombre().compareTo(e2.getNombre());
					}
				});
				break;

			case 6:
				System.out.println("Cierre de aplicacion");
				break;
			default:
				System.out.println("¡Opcion no encontrada!");
			}

		}

	}
}