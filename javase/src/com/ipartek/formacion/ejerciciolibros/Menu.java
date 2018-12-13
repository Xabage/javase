package com.ipartek.formacion.ejerciciolibros;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.biblioteca.Consola;
import com.ipartek.formacion.ejemplocapas.pojos.Usuario;
import com.ipartek.formacion.ejerciciolibros.CrudAble;
import com.ipartek.formacion.ejerciciolibros.LibroDaoArrayList;
import com.ipartek.formacion.ejerciciolibros.Libro;

public class Menu {

	private static ArrayList<Libro> libros = new ArrayList<>();

	public static void main(String[] args) {


		String opcion;
		do {

			mostrarMenu();

			opcion = Consola.leerLinea("¿Qué opción quires?");

			switch (opcion) {
			case "0":
				System.out.println("Salir");
				break;
			case "1":
				listado();
				break;
			case "2":
				alta();
				break;
			case "3":
				modificacion();
				break;
			case "4":
				baja();
				break;
			case "5":
				buscarId();
				break;
			case "6":
				burcarIsbn();
				break;
			}
		} while (!"0".equals(opcion));

	}

	private static void alta() {
		System.out.println("Alta");
		libros.add(pedirDatos());

	}

	
	private static void burcarIsbn() {
		long buscarisbn;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("ISBN");
		buscarisbn = sc.nextLong();
		for (i = 0; i < libros.size(); i++) {
			if (buscarisbn == libros.get(i).getIsbn()) {
				System.out.println(libros.get(i).getId() + ", " + libros.get(i).getTitulo() + ", " + libros.get(i).getEditorial() + ", " + libros.get(i).getIsbn() + ", " + libros.get(i).getPrecio());
				return;
			} 
		}
		System.out.println("El ISBN no existe.");
	}

	private static void buscarId() {
		long buscarid;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("ID");
		buscarid = sc.nextLong();
		for (i = 0; i < libros.size(); i++) {
			if (buscarid == libros.get(i).getId()) {
				System.out.println(libros.get(i).getId() + ", " + libros.get(i).getTitulo() + ", " + libros.get(i).getEditorial() + ", " + libros.get(i).getIsbn() + ", " + libros.get(i).getPrecio());
				return;
			} 
		}
		System.out.println("El ID no existe.");
	}

	private static void baja() {
		long buscarIdBaja;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir ID libro a eliminar");
		buscarIdBaja = sc.nextLong();
		for (i = 0; i < libros.size(); i++) {
			if (buscarIdBaja == libros.get(i).getId()) {
				libros.remove(libros.get(i));
				return;
			}
		}
System.out.println("El ID no existe.");

	}

	private static void modificacion() {
		long buscarMod;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir ID libro a modificar");
		buscarMod = sc.nextLong();
		for (i = 0; i < libros.size(); i++) {
			if (buscarMod == libros.get(i).getId()) {
				libros.set(i, pedirDatos());
				System.out.println("Libro modificado.");
				return;
			}
		}
		System.out.println("El ID no existe.");

	}

	private static Libro pedirDatos() {
		Libro libros = new Libro();

		libros.setId(Consola.leerLong("ID"));
		libros.setTitulo(Consola.leerLinea("Título"));
		libros.setEditorial(Consola.leerLinea("Editorial"));
		libros.setIsbn(Consola.leerLong("ISBN"));
		libros.setPrecio(Consola.leerLinea("Precio"));

		return libros;
	}

	private static void listado() {

		for (Libro libro : libros) {
			System.out.println(libro);
		}

	}



	private static void mostrarMenu() {
		System.out.println("--- LIBROS ---");
		System.out.println();
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Modificación");
		System.out.println("4. Baja");
		System.out.println("5. Buscar por ID");
		System.out.println("6. Buscar por ISBN");
		System.out.println("0. Salir");
	}

}
