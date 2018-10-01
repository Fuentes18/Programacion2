package ar.edu.um.programacion2.ejercicio6_consigna2;

import java.util.ArrayList;
import java.util.List;

public class ControllerTarea {
private ViewTarea vista= new ViewTarea();
	
	public ControllerTarea() {
	}

	//llama al DAO para guardar un cliente
	public void registrar(Tarea cliente ) {
		ITareaDAO dao= new  TareaDaoImpl();
		dao.registrar(cliente);
	}
	
	//llama al DAO para actualizar un cliente
	public void actualizar(Tarea cliente) {
		ITareaDAO dao= new  TareaDaoImpl();
		dao.actualizar(cliente);
	}
	
	//llama al DAO para eliminar un cliente
	public void eliminar(Tarea cliente) {
		ITareaDAO dao= new  TareaDaoImpl();
		dao.eliminar(cliente);
	}
	
	//llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public void verClientes(){
		List<Tarea> clientes = new ArrayList<Tarea>();
		ITareaDAO dao= new  TareaDaoImpl();
		clientes=dao.obtener();
		vista.verClientes(clientes);
	}
}
