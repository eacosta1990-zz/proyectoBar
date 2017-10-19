package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import datos.Mesa;
import datos.Pedido;

public class PedidoDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void agregarPedido(Pedido p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

	public Pedido traer(int id) {
		Pedido objeto = null;
		Session session = this.sessionFactory.openSession();
		objeto = (Pedido) session
				.createQuery("from Pedido p inner join fetch p.mozo inner join fetch p.mesa where p.idPedido= " + id)
				.uniqueResult();
		// objeto = (Pedido) session.get(Pedido.class, id);
		session.close();

		return objeto;
	}

	@SuppressWarnings("unchecked")
	public List<Pedido> traerPedidos() {
		Session session = this.sessionFactory.openSession();
		List<Pedido> lstPedido = session.createQuery("from Pedido p inner join fetch p.mozo inner join fetch p.mesa ")
				.list();
		session.close();
		return lstPedido;
	}

	public Pedido traerPedidoXIdProductoCantidad(int id) {
		Pedido objeto = null;
		Session session = this.sessionFactory.openSession();
		objeto = (Pedido) session.createQuery("from Pedido p   where p.IdproductoCantidad= " + id).uniqueResult();
		System.out.println("Objeto "+objeto );
		session.close();

		return objeto;
	}
}
