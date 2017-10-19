package negocio;

import java.util.List;

import dao.VentaDAO;
import datos.Venta;

public class VentaABM {
	private VentaDAO dao;

	public void setDao(VentaDAO dao) {
		this.dao = dao;

	}

	public void agregarVenta(Venta v) {
		dao.agregarVenta(v);
	}

	public List<Venta> traerVentas() {
		return dao.traerVentas();
	}
}
