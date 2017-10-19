package datos;

import java.util.Set;

public class TipoProducto {
	private int idTipoProducto;
	private String tipoProducto;
	private Set<Producto> productos;

	public TipoProducto() {

	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	public TipoProducto(String tipoProducto) {
		super();
		this.tipoProducto = tipoProducto;
	}

	public int getIdTipoProducto() {
		return idTipoProducto;
	}

	protected void setIdTipoProducto(int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	@Override
	public String toString() {
		return "TipoProducto [idTipoProducto=" + idTipoProducto + ", tipoProducto=" + tipoProducto + "]";
	}

}
