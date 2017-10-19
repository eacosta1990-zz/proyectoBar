package negocio;

import java.util.List;

import dao.TipoVentaDAO;
import datos.TipoVenta;

public class TipoVentaABM {
	private TipoVentaDAO dao;

	public void setDao(TipoVentaDAO dao) {
		this.dao = dao;

	}

	public void agregarTipoVenta(TipoVenta t) {
		dao.agregarTipoVenta(t);
	}

	public List<TipoVenta> traerTipoVentas() {
		return dao.traerTipoVentas();
	}
}
