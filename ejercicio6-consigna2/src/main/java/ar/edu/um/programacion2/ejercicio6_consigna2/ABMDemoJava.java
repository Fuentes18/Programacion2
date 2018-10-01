package ar.edu.um.programacion2.ejercicio6_consigna2;

public class ABMDemoJava {

	public static void main(String[] args) {
		Tarea tarea = new Tarea("2018-09-3", "Elivar", "Busqueda en la Biblioteca");			
		
		// Controlador
		ControllerTarea controller = new ControllerTarea();
 
		// Guarda un tarea a través del controlador
		controller.registrar(tarea);
 
		// Ver tareas
		controller.verClientes();
 
		// Editar una tarea por medio del id
		tarea.setId(1);
		tarea.setInicio("2000-1-3");
		controller.actualizar(tarea);
		
		// Eliminar un cliente por medio del id
		tarea.setId(1);
		controller.eliminar(tarea);
		
		Conexion.closeConnection();
	}

}
