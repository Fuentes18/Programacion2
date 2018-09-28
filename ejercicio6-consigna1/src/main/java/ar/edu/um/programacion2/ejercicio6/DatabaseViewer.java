package ar.edu.um.programacion2.ejercicio6;

import java.sql.*;

public class DatabaseViewer {	 

		public void showToString(ResultSet rs){
			try {
				while (rs.next()) {
				    System.out.println("id = "+ rs.getInt("id")+", inicio: "+rs.getDate("inicio")+", autor: "+rs.getString("autor")+", descripcion: "+rs.getString("descripcion")); 
				}
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		
		public void findToString(ResultSet rs){
			try {
				while (rs.next()) {
				    System.out.println("id = "+ rs.getInt("id")+", inicio: "+rs.getDate("inicio")+", autor: "+rs.getString("autor")+", descripcion: "+rs.getString("descripcion")); 
				}
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
	
}
