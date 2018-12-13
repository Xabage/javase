package com.ipartek.formacion.poo;

public class Usuario {
	protected static final String FORMATO_CORCHETES = "corchetes";
	protected static final String FORMATO_COMA = "coma";
	//Constantes
	protected static final String EMAIL_POR_DEFECTO = "desconocido@desconocido.es";
	protected static final String PASSWORD_POR_DEFECTO = "";
	
	//Variables estáticas
	private static int contadorDeInstancias = 0;
	
	//Métodos estáticos
	public static int getContadorDeInstancias() {
		return contadorDeInstancias;
	}
	
	//Variables de instancia
	private String email, password;
	
	//Constructores
	public Usuario(String email, String password) {
		setEmail(email); setPassword(password);
		System.out.println("Se ha creado un usuario");
		
		contadorDeInstancias++;
	}
	
	public Usuario(String email) {
		this(email, PASSWORD_POR_DEFECTO);
	}
	
	public Usuario() {
		this(EMAIL_POR_DEFECTO, PASSWORD_POR_DEFECTO);
	}
	
	//Métodos de acceso (getters y setters)
	public void setEmail(String email) {
		if(email.indexOf('@') == -1 ) {
			throw new UsuarioException("No se admiten emails sin @");
		}
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//Métodos
	public void cambiarPassword(String password) {
		if(this.password.equals(password)) {
			throw new RuntimeException("No has cambiado la password. Son iguales");
		}
		
		setPassword(password);
	}
	
	public String datosCompletos() {
		return email + ", " + password;
	}
	
	//Método sobrecargado
	public String datosCompletos(String formato) {
		switch(formato) {
		case FORMATO_COMA: return datosCompletos();
		case FORMATO_CORCHETES: return "[email: " + email + ", password: " + password + "]";
		default: throw new RuntimeException("Formato no reconocido " + formato);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", password=" + password + "]";
	}
}