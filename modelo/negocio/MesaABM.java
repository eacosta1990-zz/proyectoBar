package negocio;

import java.util.List;

import dao.MesaDAO;
import datos.Mesa;

public class MesaABM {
	private MesaDAO dao;

	public void setDao(MesaDAO dao) {
		this.dao = dao;

	}

	public void agregarMesa(Mesa mesa) throws Exception {
		List<Mesa> lstMesas = traerMesas();
		for (Mesa m : lstMesas) {
			if (m.getMesa().equals(mesa.getMesa()) == true) {
				throw new Exception("numero de mesa existente");
			}

		}
		dao.agregar(mesa);
	}

	public List<Mesa> traerMesas() {

		return dao.traer();
	}

	public List<Mesa> traerMesasActivas() {

		return dao.traerActivas();
	}

	public Mesa traerMesa(int idMesa) throws Exception {
		Mesa e = dao.traer(idMesa);
		if (e == null) {
			throw new Exception("No existe Mesa");
		}
		return e;
	}

	public void eliminarMesa(Mesa mesa) {
		dao.eliminar(mesa);
	}

	public void actualizarMesa(Mesa mesa) throws Exception {
	
		dao.actualizar(mesa);
	}
}
