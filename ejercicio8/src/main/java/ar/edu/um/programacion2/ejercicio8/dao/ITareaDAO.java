package ar.edu.um.programacion2.ejercicio8.dao;
import ar.edu.um.programacion2.ejercicio8.entidades.Tarea;

import java.util.List;

public interface ITareaDAO {
	
	public void registrar(Tarea tarea);
	public Tarea recuperar(Tarea tarea);
	public List<Tarea> obtenerTodo();
	public void actualizar(Tarea tarea);
	public void eliminar(Tarea tarea);

}