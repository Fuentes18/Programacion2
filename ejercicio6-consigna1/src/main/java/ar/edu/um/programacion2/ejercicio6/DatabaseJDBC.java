package ar.edu.um.programacion2.ejercicio6;
import java.sql.*;
import java.util.Calendar;

public class DatabaseJDBC {
	private ResultSet rs = null;
	private java.sql.Statement stmt = null;
	
	public DatabaseJDBC() {
	}
	
	public ResultSet show() {
		String sql = "SELECT * FROM tarea";
		
		 try {
			 	stmt= ConnectionDatabase.getConnection().createStatement();
			 	rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet find(int id) {
		
		String sql = "SELECT * FROM tarea WHERE id ="+id;
		
		 try {
			 	stmt= ConnectionDatabase.getConnection().createStatement();
			 	rs = stmt.executeQuery(sql);		    
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void insert(String autor, String descripcion) {
		
		Calendar calendar = Calendar.getInstance();
		java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

		String sql = "INSERT INTO tarea (inicio, autor, descripcion)"+ " values (?, ?, ?)";
		
		 try {
			 	PreparedStatement stmt= (ConnectionDatabase.getConnection()).prepareStatement(sql);
			 	stmt.setDate(1,startDate);
			 	stmt.setString(2,autor);
			 	stmt.setString(3,descripcion);
			 	
			 	stmt.execute();
 			    stmt.close();
			    
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(int id ,String autor, String descripcion) {
		Calendar calendar = Calendar.getInstance();
		java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

		String sql = "UPDATE tarea SET inicio = ?, autor= ?, descripcion= ? WHERE id="+id;
		
		 try {
			 	PreparedStatement stmt= (ConnectionDatabase.getConnection()).prepareStatement(sql);
			 	stmt.setDate(1,startDate);
			 	stmt.setString(2,autor);
			 	stmt.setString(3,descripcion);
			 	
			 	stmt.execute();
 			    stmt.close();
			    
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id ) {

		String sql = "DELETE FROM tarea WHERE id ="+id;
		
		 try {
			 	PreparedStatement stmt= (ConnectionDatabase.getConnection()).prepareStatement(sql);
			 	stmt.execute();
 			    stmt.close();
			    
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
