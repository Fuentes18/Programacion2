package ar.edu.um.programacion2.ejercicio8.controlador;
import ar.edu.um.programacion2.ejercicio8.dao.ITareaDAO;
import ar.edu.um.programacion2.ejercicio8.dao.TareaDaoImpl;
import ar.edu.um.programacion2.ejercicio8.entidades.Tarea;
import ar.edu.um.programacion2.ejercicio8.vista.VistaTarea;

import java.util.ArrayList;
import java.util.List;

public class ControladorTarea {

	private VistaTarea vista = new VistaTarea();

	public ControladorTarea() {
	}

	public void registrar(Tarea tarea) {
		ITareaDAO dao = new TareaDaoImpl();
		dao.registrar(tarea);
	}

	public void actualizar(Tarea tarea) {
		ITareaDAO dao = new TareaDaoImpl();
		dao.actualizar(tarea);
	}

	public void eliminar(Tarea tarea) {
		ITareaDAO dao = new TareaDaoImpl();
		dao.eliminar(tarea);
	}

	public void verTareas() {
		List<Tarea> tareas = new ArrayList<Tarea>();
		ITareaDAO dao = new TareaDaoImpl();
		tareas = dao.obtenerTodo();
		vista.verClientes(tareas);
	}
	
	public void verTarea(Tarea tarea) {
		Tarea tarea1;
		ITareaDAO dao = new TareaDaoImpl();
		tarea1 = dao.recuperar(tarea);
		vista.verCliente(tarea1);
	}
}
