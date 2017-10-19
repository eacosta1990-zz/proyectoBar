package datos;

import java.util.Set;

public class TipoVenta {
	private int idTipoVenta;
	private String tipoVenta;
	private Set<Venta> ventas;

	public TipoVenta() {

	}

	public Set<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(Set<Venta> ventas) {
		this.ventas = ventas;
	}

	public TipoVenta(String tipoVenta) {
		super();
		this.tipoVenta = tipoVenta;
	}

	public int getIdTipoVenta() {
		return idTipoVenta;
	}

	protected void setIdTipoVenta(int idTipoVenta) {
		this.idTipoVenta = idTipoVenta;
	}

	public String getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(String tipoVenta) {
		this.tipoVenta = tipoVenta;
	}

}
