package datos;

import java.util.GregorianCalendar;

public class Venta {
	private int idVenta;
	private Pedido pedido;
	private TipoVenta tipoVenta;
	private float total;
	private GregorianCalendar horaVenta;
	//private Cajero cajero;
	

	public Venta() {

	}

	public Venta(Pedido pedido, TipoVenta tipoVenta, float total, GregorianCalendar horaVenta/*, Cajero cajero*/) {
		super();
		this.pedido = pedido;
		this.tipoVenta = tipoVenta;
		this.total = total;
		this.horaVenta = horaVenta;
		//this.cajero = cajero;
	}

	public int getIdVenta() {
		return idVenta;
	}

	protected void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public TipoVenta getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(TipoVenta tipoVenta) {
		this.tipoVenta = tipoVenta;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public GregorianCalendar getHoraVenta() {
		return horaVenta;
	}

	public void setHoraVenta(GregorianCalendar horaVenta) {
		this.horaVenta = horaVenta;
	}

	/*public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}*/

}
