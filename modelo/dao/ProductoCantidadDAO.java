package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import datos.Pedido;
import datos.ProductoCantidad;

public class ProductoCantidadDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void agregar(ProductoCantidad p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

	public ProductoCantidad traer(int idProductoCantidad) {
		ProductoCantidad objeto = null;
		Session session = this.sessionFactory.openSession();
		objeto = (ProductoCantidad) session.get(ProductoCantidad.class, idProductoCantidad);
		session.close();

		return objeto;
	}

	@SuppressWarnings("unchecked")
	public List<ProductoCantidad> traerProductoCantidadXPedido(int idPedido) {
		Session session = this.sessionFactory.openSession();

		List<ProductoCantidad> lst = new ArrayList<ProductoCantidad>();
		lst = session.createQuery(
				"from ProductoCantidad p inner join fetch p.producto inner join fetch p.pedido where p.pedido="
						+ idPedido)
				.list();
		session.close();
		return lst;
	}
	
	public ProductoCantidad traerProductoCantidadXPedidoYIdProducto(int idPedido,int idProducto) {
		Session session = this.sessionFactory.openSession();

		ProductoCantidad objeto = new ProductoCantidad();
		objeto = (ProductoCantidad) session.createQuery(
				"from ProductoCantidad p inner join fetch p.producto inner join fetch p.pedido where p.pedido="
						+ idPedido+"and p.producto="+idProducto)
				.uniqueResult();
		session.close();
		return  objeto;
	}

	@SuppressWarnings("unchecked")
	public List<ProductoCantidad> traer() {
		Session session = this.sessionFactory.openSession();

		List<ProductoCantidad> lst = new ArrayList<ProductoCantidad>();
		lst = session.createQuery("from ProductoCantidad").list();
		session.close();

		return lst;
	}

	public void eliminar(ProductoCantidad objeto) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.delete(objeto);
		tx.commit();
		session.close();

	}

	public void actualizar(ProductoCantidad objeto) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.update(objeto);
		tx.commit();
		session.close();

	}
	
	public ProductoCantidad traerPedidoXIdProductoCantidad(int id) {
		ProductoCantidad objeto = null;
		Session session = this.sessionFactory.openSession();
		objeto =  (ProductoCantidad) session.createQuery("from ProductoCantidad p inner join fetch p.pedido where p.idProductoCantidad= " + id).uniqueResult();
		session.close();

		return objeto;
	}

}
