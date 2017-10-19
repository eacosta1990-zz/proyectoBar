package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import datos.Mesa;
import datos.Mozo;

public class MozoDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void agregarMozo(Mozo m) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(m);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Mozo> traerMozos() {
		Session session = this.sessionFactory.openSession();
		List<Mozo> lstMozos = session.createQuery("from Mozo").list();
		session.close();
		
		return lstMozos;
	}
	
	public Mozo traer(int idMozo) {
		Mozo objeto = null;
		Session session = this.sessionFactory.openSession();
		objeto = (Mozo) session.get(Mozo.class, idMozo);
		session.close();

		return objeto;
	}
}
