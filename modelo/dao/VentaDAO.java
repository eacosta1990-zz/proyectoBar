package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import datos.Venta;

public class VentaDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void agregarVenta(Venta v) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(v);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Venta> traerVentas() {
		Session session = this.sessionFactory.openSession();
		List<Venta> lstVentas = session.createQuery("from Venta").list();
		session.close();
		return lstVentas;
	}
}
