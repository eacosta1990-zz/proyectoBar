package datos;

import java.util.GregorianCalendar;

public class ProductoBorrado {
	private int idProductoBorrado;
	private ProductoCantidad productoBorrado;
	private GregorianCalendar horaBorrado;
	private String motivoBorrado;
	private Pedido pedidoBorrado;
	private Mozo mozoBorrado;

	public ProductoBorrado() {

	}

	public ProductoBorrado(ProductoCantidad productoBorrado, GregorianCalendar horaBorrado, String motivoBorrado,
			Pedido pedidoBorrado, Mozo mozoBorrado) {
		super();
		this.productoBorrado = productoBorrado;
		this.horaBorrado = horaBorrado;
		this.motivoBorrado = motivoBorrado;
		this.pedidoBorrado = pedidoBorrado;
		this.mozoBorrado = mozoBorrado;
	}

	public int getIdProductoBorrado() {
		return idProductoBorrado;
	}

	protected void setIdProductoBorrado(int idProductoBorrado) {
		this.idProductoBorrado = idProductoBorrado;
	}

	public ProductoCantidad getProductoBorrado() {
		return productoBorrado;
	}

	public void setProductoBorrado(ProductoCantidad productoBorrado) {
		this.productoBorrado = productoBorrado;
	}

	public GregorianCalendar getHoraBorrado() {
		return horaBorrado;
	}

	public void setHoraBorrado(GregorianCalendar horaBorrado) {
		this.horaBorrado = horaBorrado;
	}

	public String getMotivoBorrado() {
		return motivoBorrado;
	}

	public void setMotivoBorrado(String motivoBorrado) {
		this.motivoBorrado = motivoBorrado;
	}

	public Pedido getPedidoBorrado() {
		return pedidoBorrado;
	}

	public void setPedidoBorrado(Pedido pedidoBorrado) {
		this.pedidoBorrado = pedidoBorrado;
	}

	public Mozo getMozoBorrado() {
		return mozoBorrado;
	}

	public void setMozoBorrado(Mozo mozoBorrado) {
		this.mozoBorrado = mozoBorrado;
	}

}
