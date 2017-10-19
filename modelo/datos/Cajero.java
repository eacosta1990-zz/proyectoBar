package datos;

public class Cajero extends Persona {
	private int idCajero;
	private String categoria;

	public Cajero() {

	}

	public Cajero(String categoria) {
		super();
		this.categoria = categoria;
	}

	public int getIdCajero() {
		return idCajero;
	}

	protected void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
