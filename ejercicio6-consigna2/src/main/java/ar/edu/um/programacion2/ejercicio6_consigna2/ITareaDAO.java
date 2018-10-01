package ar.edu.um.programacion2.ejercicio6_consigna2;

import java.util.List;

public interface ITareaDAO {
	
	public boolean registrar(Tarea tarea);
	public List<Tarea> obtener();
	public boolean actualizar(Tarea tarea);
	public boolean eliminar(Tarea tarea);

}
