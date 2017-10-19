package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import datos.TipoVenta;

public class TipoVentaDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void agregarTipoVenta(TipoVenta t) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(t);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<TipoVenta> traerTipoVentas() {
		Session session = this.sessionFactory.openSession();
		List<TipoVenta> lstTipoVenta = session.createQuery("from TipoVenta").list();
		session.close();
		return lstTipoVenta;
	}
}
