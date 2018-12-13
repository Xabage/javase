package com.ipartek.formacion.ejerciciolibros;

public class Libro {

	private long id, isbn;	
	private String titulo, editorial, precio;
	
	
	public Libro(long id, long isbn, String titulo, String editorial, String precio) {
		//this.id = id;
		setId(id);
		//this.isbn = isbn;
		setIsbn(isbn);
		//this.titulo = titulo;
		setTitulo(titulo);
		//this.editorial = editorial;
		setEditorial(editorial);
		//this.precio = precio;
		setPrecio(precio);
	}

	public Libro() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
//	@Override
//	public String toString() {
//		return "Usuario [id=" + id + ", email=" + email + ", password=" + password + "]";
//	}
	
	@Override
	public String toString() {
		return "Libro [id= " + id + ", Título=" + titulo + ", editorial=" + editorial + ", isbn=" + isbn + ", precio=" + precio + "]";
	}
}
