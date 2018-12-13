package com.ipartek.formacion.ejerciciolibros;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.ejerciciolibros.CrudAble;
import com.ipartek.formacion.ejerciciolibros.Libro;


public class LibroDaoArrayList implements CrudAble<Libro> {
 
//		private static final String NO_SE_ADMITE_USUARIOS_NULO = "No se admite usuarios nulo";
//		private static final String YA_EXISTE_ESE_ID_DE_USUARIO = "Ya existe ese ID de usuario";
//		private static final String YA_EXISTE_ESE_EMAIL = "Ya existe ese email";
//		private static final String NO_EXISTE_ESE_ID = "No existe ese ID";
		
		private ArrayList<Libro> libros = new ArrayList<>();
		
		
		public LibroDaoArrayList() {
			libros.add(new Libro(1L, 55678,"Titulo1", "Editorial1", "15€"));
			libros.add(new Libro(2L, 86757,"Titulo2", "Editorial2", "20€"));
		}
		
		@Override
		public List<Libro> getAll() {
			return libros;
		}
		
		@Override
		public ArrayList<Libro> getById(Long id) {
			for(Libro libro: libros) {
				if(libro.getId() == id) {
					return libros;
				}
			}
			
			return null;			
		}
		
		@Override
		public ArrayList<Libro> getByIsbn(Long isbn) {
			for(Libro libro: libros) {
				if(libro.getIsbn() == isbn) {
					return libros;
				}
			}
			
			return null;			
		}
		
		
		
	}

