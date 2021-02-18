package paqueteUsuario;

import java.util.Scanner;

public class EjercicioUsuario {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		Usuario [] matrizUsuario;	
		matrizUsuario = cargaMatrizUsuario(5);		
		muestraMatrizUsuario(matrizUsuario);
	}
	
	public static Usuario[] cargaMatrizUsuario(int n) {
		Usuario [] datosUsuarios = new Usuario[n];
		for (int i=0;i<n;i++) {
			System.out.println("\t Graba usuario "+i+":");
			datosUsuarios[i]=grabaUsuario();
		}
		return datosUsuarios;
	}
	
	public static Usuario grabaUsuario() {
		String email, password1, password2;
		System.out.print("Email:");
		email = entrada.nextLine();
		do {
			System.out.print("Contraseña:");
			password1 = entrada.nextLine();
			System.out.print("Repita la contraseña:");
			password2 = entrada.nextLine();
			if (!(password1.equals(password2))) 
				System.out.print("La contraseña no coincide, intentelo de nuevo.\n");
		}while(!(password1.equals(password2)));
		
		Usuario nuevoUsuario = new Usuario(email,password1);
		
		return nuevoUsuario;
	}
	
	public static void muestraMatrizUsuario(Usuario[] matrizUsuario){
		for (int i=0;i<matrizUsuario.length;i++) {
			System.out.println("Usuario "+i+": "+matrizUsuario[i].getEmail());
		}
	}

}
