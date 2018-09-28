package ar.edu.um.programacion2.ejercicio6;

public class DatabaseController {
	public static void interaction() {
		DatabaseViewer interaction = new DatabaseViewer();
		DatabaseJDBC o = new DatabaseJDBC(); 
		
		interaction.showToString(o.show());
		interaction.findToString(o.find(1));
		
		//o.delete(2);
		//o.insert("Pablo","Alboran");
		//o.update(1,"Jesica","Quispe");
	
		ConnectionDatabase.closeConnection();		
	}
}
