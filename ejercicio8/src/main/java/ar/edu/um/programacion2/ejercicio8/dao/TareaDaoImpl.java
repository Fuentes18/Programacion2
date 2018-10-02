package ar.edu.um.programacion2.ejercicio8.dao;
import ar.edu.um.programacion2.ejercicio8.entidades.Tarea;
import ar.edu.um.programacion2.ejercicio8.utilidades.HibernateUtils;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class TareaDaoImpl implements ITareaDAO {
	protected SessionFactory sf;
	
	public TareaDaoImpl() {
		this.sf = HibernateUtils.getSessionFactory();
	}

	public void registrar(Tarea tarea) {
		Session sesion = this.sf.getCurrentSession();
		sesion.getTransaction().begin();
		sesion.persist(tarea);
		sesion.getTransaction().commit();
	}

	public Tarea recuperar(Tarea tarea) {
		Session sesion = this.sf.getCurrentSession();
		sesion.getTransaction().begin();
		
		String sql = "select p from Tarea p where p.id = :id";
		@SuppressWarnings("unchecked")
		Query<Tarea> consulta = sesion.createQuery(sql);
		consulta.setParameter("id",tarea.getId());
		Tarea resultado = consulta.getSingleResult();
		sesion.getTransaction().commit();
		return resultado;
	}

	public List<Tarea> obtenerTodo() {
		Session sesion = this.sf.getCurrentSession();
		sesion.getTransaction().begin();
		String sql = "select p from Tarea p";
		@SuppressWarnings("unchecked")
		Query<Tarea> consulta = sesion.createQuery(sql);
		List <Tarea> resultado = consulta.getResultList();
		sesion.getTransaction().commit();
		return resultado;
	}

	public void actualizar(Tarea tarea) {
		Session sesion = this.sf.getCurrentSession();
		sesion.getTransaction().begin();
		sesion.update(tarea);
		sesion.getTransaction().commit();
	}

	public void eliminar(Tarea tarea) {
		Session sesion = this.sf.getCurrentSession();
		sesion.getTransaction().begin();
		
		@SuppressWarnings("unchecked")
		Query<Tarea> consulta = sesion.createNativeQuery("delete p from tarea p where id = :id");
		consulta.setParameter("id", tarea.getId());
		consulta.executeUpdate();
		sesion.getTransaction().commit();
	}
}