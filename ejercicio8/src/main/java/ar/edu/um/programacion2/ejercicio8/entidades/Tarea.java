package ar.edu.um.programacion2.ejercicio8.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarea")
public class Tarea {
	@Id
	@Column(name = "id", unique = true, nullable = false) //nullable no permite nulos
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public int id;
	
	@Column(name = "inicio")
	public java.sql.Date inicio;
	
	@Column(name = "autor")
	public String autor;
	
	@Column(name = "descripcion")
	public String descripcion;
	
	public Tarea() {
	}
	public Tarea(java.sql.Date inicio, String autor, String descripcion) {
		this.inicio = inicio;
		this.autor = autor;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(java.sql.Date inicio) {
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