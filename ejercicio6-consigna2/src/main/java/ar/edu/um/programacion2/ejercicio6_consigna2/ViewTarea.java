package ar.edu.um.programacion2.ejercicio6_consigna2;

import java.util.List;

public class ViewTarea {
	public void verCliente(Tarea tarea) {
		System.out.println("Datos del Cliente: "+tarea);
	}
	
	public void verClientes(List<Tarea> tareas) {
		for (Tarea tarea : tareas) {
			System.out.println("Datos del Cliente: "+tarea);
		}		
	}
}
