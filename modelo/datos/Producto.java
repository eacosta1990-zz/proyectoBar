package datos;

import java.util.Set;

public class Producto {
	private int idProducto;
	private String producto;
	private float precio;
	private TipoProducto tipoProducto;
	private Set<ProductoCantidad> productosCantidad;

	public Producto() {

	}

	public Producto(String producto, float precio) {
		super();
		this.producto = producto;
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	protected void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public Set<ProductoCantidad> getProductosCantidad() {
		return productosCantidad;
	}

	public void setProductosCantidad(Set<ProductoCantidad> productosCantidad) {
		this.productosCantidad = productosCantidad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", producto=" + producto + ", precio=" + precio;
	}

}
