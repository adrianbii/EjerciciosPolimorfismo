package paqueteUsuario;

public class Usuario {
	//Campo de datos de la clase
		private String email; //Correo electr�nico del usuario
		private String password; //Contrase�a de cada usuario 
	//M�todos	
		public Usuario() {
			this("","");
		}
		public Usuario(String email, String password) {
			this.email= email;
			this.setPassword(password);
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email=email;
		}
		public void setPassword(String password) {
			if (!(validar(password)))
				System.out.println("�Contrase�a insegura!");
				this.password=password;		
		}
		private boolean validar(String pass){
			if (pass.length()<8) return false;
			else  return true;
		}
	}
