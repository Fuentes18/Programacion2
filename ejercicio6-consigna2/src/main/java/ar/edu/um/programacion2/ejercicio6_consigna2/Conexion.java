package ar.edu.um.programacion2.ejercicio6_consigna2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection conn = null;

	private Conexion(){
 
		String url = "jdbc:mysql://localhost:3306/tp6";
		String driver = "com.mysql.cj.jdbc.Driver";
		String usuario = "root";
		String password = "0723";
  
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);
		}
		catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
		}
    }
	
	public static Connection getConnection() {

		if (conn == null) {
			new Conexion();
		}

		return conn;
	} 
	
	public static void closeConnection(){
		if (conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
