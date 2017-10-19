package datos;

import java.util.GregorianCalendar;

public class Reserva {
	private int idReserva;
	private GregorianCalendar fecha;
	private GregorianCalendar hora;
	private Cliente cliente;
	private Mesa mesa;
	private TipoReserva tipoReserva;

	public Reserva() {

	}

	public Reserva(GregorianCalendar fecha, GregorianCalendar hora, Cliente cliente, Mesa mesa,
			TipoReserva tipoReserva) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.cliente = cliente;
		this.mesa = mesa;
		this.tipoReserva = tipoReserva;
	}

	public int getIdReserva() {
		return idReserva;
	}

	protected void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public GregorianCalendar getHora() {
		return hora;
	}

	public void setHora(GregorianCalendar hora) {
		this.hora = hora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public TipoReserva getTipoReserva() {
		return tipoReserva;
	}

	public void setTipoReserva(TipoReserva tipoReserva) {
		this.tipoReserva = tipoReserva;
	}

}
