package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import datos.Producto;

public class ProductoDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public int agregar(Producto p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int id = (Integer) session.save(p);
		tx.commit();
		session.close();
		return id;
	}

	public Producto traer(int idProducto) {
		Producto objeto = new Producto();
		Session session = this.sessionFactory.openSession();
		objeto = (Producto) session.createQuery("from Producto p  where p.idProducto="+idProducto).uniqueResult();
		System.out.println("OBJETO "+objeto);
		session.close();

		return objeto;
	}

	@SuppressWarnings("unchecked")
	public List<Producto> traer() {
		Session session = this.sessionFactory.openSession();

		List<Producto> lst = new ArrayList<Producto>();
		lst = session.createQuery("from Producto").list();
		session.close();

		return lst;
	}

	@SuppressWarnings("unchecked")
	public List<Producto> traerProductosXTipo(int id) {
		Session session = this.sessionFactory.openSession();
		List<Producto> lst = new ArrayList<Producto>();
		lst = session.createQuery("from Producto p where p.tipoProducto=" + id).list();
		System.out.println(lst);
		session.close();

		return lst;
	}

	public void eliminar(Producto objeto) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.delete(objeto);
		tx.commit();
		session.close();

	}

	public void actualizar(Producto objeto) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.update(objeto);
		tx.commit();
		session.close();

	}

}
