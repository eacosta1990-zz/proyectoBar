package datos;

import java.util.GregorianCalendar;

public class Cliente extends Persona {
	private int idCliente;
	private String categoria;
	private GregorianCalendar ultimaCompra;

	public Cliente() {

	}

	public Cliente(String categoria, GregorianCalendar ultimaCompra) {
		super();
		this.categoria = categoria;
		this.ultimaCompra = ultimaCompra;
	}

	public int getIdCliente() {
		return idCliente;
	}

	protected void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public GregorianCalendar getUltimaCompra() {
		return ultimaCompra;
	}

	public void setUltimaCompra(GregorianCalendar ultimaCompra) {
		this.ultimaCompra = ultimaCompra;
	}

}
