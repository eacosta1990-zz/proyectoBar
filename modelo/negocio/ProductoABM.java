package negocio;

import java.util.List;

import dao.ProductoDAO;
import datos.Producto;

public class ProductoABM {
	private ProductoDAO dao;

	public void setDao(ProductoDAO dao) {
		this.dao = dao;
	}

	public void agregarProducto(Producto p) {
		dao.agregar(p);
	}

	public List<Producto> traerProductos() {
		return dao.traer();
	}

	public Producto traerProducto(int idProducto) {
		return dao.traer(idProducto);
	}

	public  List<Producto> traerProductosXTipo(int idProducto) {

		return dao.traerProductosXTipo(idProducto);
	}

	public void eliminarProducto(Producto producto) {
		dao.eliminar(producto);
	}

	public void actualizarProducto(Producto producto) {
		dao.actualizar(producto);
	}
}
