package negocio;

import java.util.List;

import dao.MozoDAO;
import datos.Mozo;

public class MozoABM {
	private MozoDAO dao;

	public void setDao(MozoDAO dao) {
		this.dao = dao;

	}

	public Mozo traerMozo(int idMozo) throws Exception {
		Mozo e = dao.traer(idMozo);
		
		return e;
	}

	public void agregarMozo(Mozo m) {
		dao.agregarMozo(m);
	}

	public List<Mozo> traerMozos() {
		return dao.traerMozos();
	}

}
