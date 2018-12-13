package com.ipartek.formacion.ejemplocapas.presentacion;

import com.ipartek.formacion.biblioteca.Consola;
import com.ipartek.formacion.ejemplocapas.accesodatos.CrudAble;
import com.ipartek.formacion.ejemplocapas.accesodatos.UsuarioDaoArrayList;
import com.ipartek.formacion.ejemplocapas.pojos.Usuario;

public class PresentacionConsola {
	public static void main(String[] args) {
		CrudAble<Usuario> usuarios = new UsuarioDaoArrayList();

		usuarios.insert(pedirUsuario());
		usuarios.update(new Usuario(1L, "javi@lete.com", "Contraseña1A!"));
		usuarios.delete(2L);

		for (Usuario usuario : usuarios.getAll()) {
			System.out.println(usuario);
		}

		System.out.println(usuarios.getById(1L));

		// Usuario usuario = pedirUsuario();

		// System.out.println(usuario);
	}

	private static Usuario pedirUsuario() {
		Usuario usuario = new Usuario();// generar constructor vac�o para poder crear nuevo usuario sin rellenar

		// Long id = Consola.leerLong("ID");
		usuario.setId(Consola.leerLong("ID"));
		// String email = Consola.leerLinea("Email");
		boolean errorEmail;
		do {
			errorEmail = false;
			try {
				usuario.setEmail(Consola.leerLinea("Email"));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (errorEmail);

		// String password = Consola.leerLinea("Contraseña");
		usuario.setPassword(Consola.leerLinea("Contraseña"));

		// Usuario usuario = new Usuario(id, email, password);
		return usuario;
	}
}