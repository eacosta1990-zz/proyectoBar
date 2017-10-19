package datos;

import datos.Producto;

public class ProductoCantidad {
	private int idProductoCantidad;
	private Producto producto;
	private int cantidad;
	private Pedido pedido;

	public ProductoCantidad() {

	}

	public ProductoCantidad(Producto producto, int cantidad, Pedido pedido) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.pedido = pedido;
	}

	public int getIdProductoCantidad() {
		return idProductoCantidad;
	}

	protected void setIdProductoCantidad(int idProductoCantidad) {
		this.idProductoCantidad = idProductoCantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "ProductoCantidad [idProductoCantidad=" + idProductoCantidad +  ", cantidad="
				+ cantidad + "]";
	}

}
