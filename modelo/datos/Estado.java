package datos;

public class Estado {
	private int idEstado;
	private String estado;

	public Estado() {

	}

	public Estado(String estado) {
		super();
		this.estado = estado;
	}

	public int getIdEstado() {
		return idEstado;
	}

	protected void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
