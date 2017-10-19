package negocio;

import java.util.List;

import dao.PedidoDAO;
import datos.Pedido;

public class PedidoABM {
	private PedidoDAO dao;

	public void setDao(PedidoDAO dao) {
		this.dao = dao;

	}

	public void agregarPedido(Pedido p) {
		
		dao.agregarPedido(p);
	}

	public List<Pedido> traerPedidos() {
		return dao.traerPedidos();
	}
	public Pedido traerPedido(int idPedido){
		Pedido pedido=dao.traer(idPedido);
		return pedido;
		
	}
	

}
