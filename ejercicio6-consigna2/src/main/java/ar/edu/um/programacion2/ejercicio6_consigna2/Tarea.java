package ar.edu.um.programacion2.ejercicio6_consigna2;

public class Tarea {
	
	public int id;
	public String inicio;
	public String autor;
	public String descripcion;
	
	public Tarea(String inicio, String autor, String descripcion) {
		this.inicio = inicio;
		this.autor = autor;
		this.descripcion = descripcion;
	}

	public Tarea() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", inicio=" + inicio + ", autor=" + autor + ", descripcion=" + descripcion + "]";
	}
}
