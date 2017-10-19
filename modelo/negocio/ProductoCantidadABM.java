package negocio;

import java.util.List;

import dao.ProductoCantidadDAO;
import datos.Mesa;
import datos.Pedido;
import datos.ProductoCantidad;

public class ProductoCantidadABM {
	private ProductoCantidadDAO dao;

	public void setDao(ProductoCantidadDAO dao) {
		this.dao = dao;

	}

	public void agregarProductoCantidad(ProductoCantidad p) {
		dao.agregar(p);
	}

	public ProductoCantidad traerProductoCantidad(int id) {
		return dao.traer(id);
	}
	public List<ProductoCantidad> traerProductoCantidades() {
		return dao.traer();
	}

	public List<ProductoCantidad> traerProductoCantidadXPedido(int idPedido) {
		return dao.traerProductoCantidadXPedido(idPedido);
	}

	
	public ProductoCantidad traerProductoCantidadXPedidoYIdProducto(int idPedido,int idProducto) {
		return dao.traerProductoCantidadXPedidoYIdProducto(idPedido,idProducto);
	}
	
	public ProductoCantidad traerPedidoXIdProductoCantidad(int idProductoCantidad){
		ProductoCantidad pedido=dao.traerPedidoXIdProductoCantidad(idProductoCantidad);
		return pedido;
		
	}
	
	public void actualizarProductoCantidad(ProductoCantidad objeto) {
		 dao.actualizar(objeto);
	}
	public void eliminarProductoCantidad(ProductoCantidad p) {
		dao.eliminar(p);
	}
	
}
