package ar.edu.um.programacion2.ejercicio8.vista;
import ar.edu.um.programacion2.ejercicio8.entidades.Tarea;

import java.util.List;

public class VistaTarea {
	
	public void verCliente(Tarea tarea) {
		System.out.println("Tarea: " + tarea);
	}

	public void verClientes(List<Tarea> tareas) {
		for (Tarea tarea : tareas) {
			System.out.println("Datos de la Tarea: " + tarea);
		}
	}
}
