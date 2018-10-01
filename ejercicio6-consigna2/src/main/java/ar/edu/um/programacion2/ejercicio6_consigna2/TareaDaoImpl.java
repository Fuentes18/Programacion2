package ar.edu.um.programacion2.ejercicio6_consigna2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TareaDaoImpl implements ITareaDAO {
	@Override
	public boolean registrar(Tarea tarea) {
		Statement stm = null;
		Connection con = null;
		boolean registrar = false;

		String sql = "INSERT INTO tarea values (NULL,'" + tarea.getInicio() + "','" + tarea.getAutor() + "','"
				+ tarea.getDescripcion() + "')";

		try {
			
			con = Conexion.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase TareaDaoImpl, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public List<Tarea> obtener() {
		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM tarea ORDER BY ID";

		List<Tarea> listaCliente = new ArrayList<Tarea>();

		try {
			conn = Conexion.getConnection();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Tarea c = new Tarea();
				c.setId(rs.getInt(1));
				c.setInicio(rs.getString(2));
				c.setAutor(rs.getString(3));
				c.setDescripcion(rs.getString(4));
				listaCliente.add(c);
			}
			stm.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}

		return listaCliente;
	}

	@Override
	public boolean actualizar(Tarea tarea) {
		Statement stm = null;
		Connection conect = null;
		boolean actualizar=false;
				
		String sql="UPDATE tarea SET inicio='"+tarea.getInicio()+"', autor='"+tarea.getAutor()+"', descripcion='"+tarea.getDescripcion()+"'" +" WHERE ID="+tarea.getId();
		try {
			conect = Conexion.getConnection();
			stm= conect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}

	@Override
	public boolean eliminar(Tarea tarea) {
		Statement stm = null;
		Connection conection = null;
		boolean eliminar=false;
		
		String sql="DELETE FROM tarea WHERE ID="+tarea.getId();
		try {
			conection=Conexion.getConnection();
			stm=conection.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}

}
