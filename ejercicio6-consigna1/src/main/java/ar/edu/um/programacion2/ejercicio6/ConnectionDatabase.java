package ar.edu.um.programacion2.ejercicio6;

import java.sql.*;

public class ConnectionDatabase {
	private static Connection conn = null;

	private ConnectionDatabase(){
 
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
			new ConnectionDatabase();
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
