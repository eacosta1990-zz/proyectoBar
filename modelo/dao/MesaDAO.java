package dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Mesa;

public class MesaDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void agregar(Mesa p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

	public Mesa traer(int id) {
		Mesa objeto = null;
		Session session = this.sessionFactory.openSession();
		objeto = (Mesa) session.get(Mesa.class, id);
		session.close();

		return objeto;
	}

	@SuppressWarnings("unchecked")
	public List<Mesa> traer() {
		Session session = this.sessionFactory.openSession();

		List<Mesa> lst = new ArrayList<Mesa>();
		lst = session.createQuery("from Mesa").list();
		session.close();

		return lst;
	}

	@SuppressWarnings("unchecked")
	public List<Mesa> traerActivas() {
		Session session = this.sessionFactory.openSession();

		List<Mesa> lst = new ArrayList<Mesa>();
		lst = session.createQuery("from Mesa where activa = 1").list();
		session.close();

		return lst;
	}

	public void eliminar(Mesa objeto) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.delete(objeto);
		tx.commit();
		session.close();

	}

	public void actualizar(Mesa objeto) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.update(objeto);
		tx.commit();
		session.close();

	}

}
