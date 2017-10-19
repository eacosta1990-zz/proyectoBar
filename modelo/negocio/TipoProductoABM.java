package negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.TipoProductoDAO;
import datos.TipoProducto;

public class TipoProductoABM {
	@Autowired
	private TipoProductoDAO dao;

	public void setDao(TipoProductoDAO dao) {
		this.dao = dao;

	}

	public void agregarTipoProducto(TipoProducto t) {
		TipoProducto ta = new TipoProducto();
		TipoProductoABM tabm = new TipoProductoABM();
		ta.setTipoProducto("cerveza");
		dao.agregar(t);
	}
	public List<TipoProducto> traerTipoProductos() {
		return dao.traer();
	}

	public TipoProducto traerTipoProducto(int idTipoProducto) {
		return dao.traer(idTipoProducto);
	}

	public void eliminarTipoProducto(TipoProducto tipo) {
		dao.eliminar(tipo);
	}

	public void actualizarTipoProducto(TipoProducto tipo) {
		dao.actualizar(tipo);
	}
}
