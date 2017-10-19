package datos;

import java.util.Set;

public class Mesa {
	private int idMesa;
	private String mesa;
	private boolean activa;
	private int cantidadComensales;
	private Set<Pedido> pedidos;

	public Mesa() {

	}

	public Mesa(String mesa, boolean activa, int cantidadComensales) {
		super();
		this.mesa = mesa;
		this.activa = activa;
		this.cantidadComensales = cantidadComensales;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public int getIdMesa() {
		return idMesa;
	}

	protected void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}

	public String getMesa() {
		return mesa;
	}

	public void setMesa(String mesa) {
		this.mesa = mesa;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public int getCantidadComensales() {
		return cantidadComensales;
	}

	public void setCantidadComensales(int cantidadComensales) {
		this.cantidadComensales = cantidadComensales;
	}
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesa other = (Mesa) obj;
		if (mesa == null) {
			if (other.mesa != null)
				return false;
		} else if (!mesa.equals(other.mesa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mesa [idMesa=" + idMesa + ", mesa=" + mesa + ", activa=" + activa + ", cantidadComensales="
				+ cantidadComensales + "]";
	}

}
