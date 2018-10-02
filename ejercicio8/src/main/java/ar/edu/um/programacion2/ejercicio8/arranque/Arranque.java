package ar.edu.um.programacion2.ejercicio8.arranque;
import ar.edu.um.programacion2.ejercicio8.utilidades.HibernateUtils;

import java.util.Calendar;

import ar.edu.um.programacion2.ejercicio8.controlador.ControladorTarea;
import ar.edu.um.programacion2.ejercicio8.entidades.Tarea;

public class Arranque {

	public static void main(String[] args) {
		Arranque a = new Arranque();
		
		a.arrancame();
	}
	
	public void arrancame() {
		ControladorTarea ctrl = new ControladorTarea();
		Tarea tarea = new Tarea();
		
		Calendar calendar = Calendar.getInstance();
		java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
		
		
		//Ver todas las tareas cargadas 
		ctrl.verTareas();
		
		//Ver una tarea  en especifico 
		tarea.setId(29);
		ctrl.verTarea(tarea);
		
		//Cargar una nueva tarea
		Tarea tarea_nueva = new Tarea(startDate, "Pepe", "Lavar los vidrios");
		ctrl.registrar(tarea_nueva);
		
		//Modificar una tarea
		tarea.setId(34);
		tarea.setInicio(startDate);
		tarea.setAutor("Ricardo");
		tarea.setDescripcion("Barrer");
		ctrl.actualizar(tarea);
		
		//Eliminar una tarea
		tarea.setId(27);
		ctrl.eliminar(tarea);
				
		HibernateUtils.shutdown();
	}

}