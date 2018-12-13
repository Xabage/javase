package com.ipartek.formacion.ejerciciolibros;

import java.util.ArrayList;
import java.util.List;

public interface CrudAble<Libro> {
	
	public default List<Libro> getAll(){
		throw new RuntimeException("No implementado");
	}
	
	public default Libro getById(long id) {
		throw new RuntimeException("No implementado");
	}
	
	public default Libro getByIsbn(long isbn) {
		throw new RuntimeException("No implementado");
	}
	
	public default void insert(Libro libro) {
		throw new RuntimeException("No implementado");
	}
	
	public default void update(Libro libro) {
		throw new RuntimeException("No implementado");
	}
	
	public default void delete(long id) {
		throw new RuntimeException("No implementado");
	}

	ArrayList<com.ipartek.formacion.ejerciciolibros.Libro> getByIsbn(Long isbn);

	ArrayList<com.ipartek.formacion.ejerciciolibros.Libro> getById(Long id);
}
