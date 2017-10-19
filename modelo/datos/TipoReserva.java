package datos;

public class TipoReserva {
	private int idTipoReserva;
	private String tipoReserva;

	public TipoReserva() {

	}

	public TipoReserva(String tipoReserva) {
		super();
		this.tipoReserva = tipoReserva;
	}

	public int getIdTipoReserva() {
		return idTipoReserva;
	}

	protected void setIdTipoReserva(int idTipoReserva) {
		this.idTipoReserva = idTipoReserva;
	}

	public String getTipoReserva() {
		return tipoReserva;
	}

	public void setTipoReserva(String tipoReserva) {
		this.tipoReserva = tipoReserva;
	}

}
