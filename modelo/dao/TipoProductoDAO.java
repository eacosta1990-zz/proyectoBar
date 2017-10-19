package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import datos.TipoProducto;

public class TipoProductoDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void agregar(TipoProducto p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

	public TipoProducto traer(int idTipoProducto) {
		TipoProducto objeto = null;
		Session session = this.sessionFactory.openSession();
		objeto = (TipoProducto) session.get(TipoProducto.class, idTipoProducto);
		session.close();

		return objeto;
	}

	@SuppressWarnings("unchecked")
	public List<TipoProducto> traer() {
		Session session = this.sessionFactory.openSession();

		List<TipoProducto> lst = new ArrayList<TipoProducto>();
		lst = session.createQuery("from TipoProducto").list();
		session.close();

		return lst;
	}

	@SuppressWarnings("unchecked")
	public List<TipoProducto> traerProductosXTipos() {
		Session session = this.sessionFactory.openSession();
		List<TipoProducto> lst = new ArrayList<TipoProducto>();
		lst = session.createQuery("from TipoProducto").list();
		session.close();

		return lst;
	}

	public void eliminar(TipoProducto objeto) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.delete(objeto);
		tx.commit();
		session.close();

	}

	public void actualizar(TipoProducto objeto) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.update(objeto);
		tx.commit();
		session.close();

	}
}
