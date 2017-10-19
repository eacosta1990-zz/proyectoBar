package datos;

import java.util.GregorianCalendar;
import java.util.Set;


public class Pedido {
	private int idPedido;
	private GregorianCalendar fecha;
	private GregorianCalendar horaCarga;
	private GregorianCalendar horaCierre;
	// private Estado estado;
	private Mozo mozo;
	private Mesa mesa;
	private Set<ProductoCantidad> productosCantidad;

	public Pedido() {

	}

	public Pedido(GregorianCalendar fecha, GregorianCalendar horaCarga,
			GregorianCalendar horaCierre/* , Estado estado */, Mozo mozo, Mesa mesa) {
		super();
		this.fecha = fecha;
		this.horaCarga = horaCarga;
		this.setHoraCierre(horaCierre);
		/* this.estado = estado; */
		this.mozo = mozo;
		this.mesa = mesa;

	}

	public Pedido(GregorianCalendar fecha, GregorianCalendar horaCarga
	/* , Estado estado */, Mozo mozo, Mesa mesa) {
		super();
		this.fecha = fecha;
		this.horaCarga = horaCarga;
		/* this.estado = estado; */
		this.mozo = mozo;
		this.mesa = mesa;

	}

	public Pedido(Mozo mozo, Mesa mesa) {
		super();

		this.mozo = mozo;
		this.mesa = mesa;

	}

	public int getIdPedido() {
		return idPedido;
	}

	protected void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public GregorianCalendar getHoraCarga() {
		return horaCarga;
	}

	public void setHoraCarga(GregorianCalendar horaCarga) {
		this.horaCarga = horaCarga;
	}

	public Set<ProductoCantidad> getProductosCantidad() {
		return productosCantidad;
	}

	public void setProductosCantidad(Set<ProductoCantidad> productosCantidad) {
		this.productosCantidad = productosCantidad;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	/*
	 * public Estado isEstado() { return estado; }
	 * 
	 * public void setEstado(Estado estado) { this.estado = estado; }
	 */

	public Mozo getMozo() {
		return mozo;
	}

	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}

	public GregorianCalendar getHoraCierre() {
		return horaCierre;
	}

	public void setHoraCierre(GregorianCalendar horaCierre) {
		this.horaCierre = horaCierre;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fecha=" + fecha + ", horaCarga=" + horaCarga + ", horaCierre="
				+ horaCierre + ", mozo=" + mozo + ", mesa=" + mesa + "]";
	}



}
