package datos;

import java.util.GregorianCalendar;
import java.util.Set;

import funciones.Funciones;

public class Mozo extends Persona {
	private int idMozo;
	private GregorianCalendar fechaIngreso;
	private String turno;
	private Set<Pedido> pedidos;

	public Mozo() {

	}

	public Mozo(int idMozo, GregorianCalendar fechaIngreso, String turno) {
		super();
		this.idMozo = idMozo;
		this.fechaIngreso = fechaIngreso;
		this.turno = turno;
	}

	public int getIdMozo() {
		return idMozo;
	}

	public void setIdMozo(int idMozo) {
		this.idMozo = idMozo;
	}

	public GregorianCalendar getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(GregorianCalendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Mozo [idMozo=" + idMozo + ", fechaIngreso=" + Funciones.imprimirFecha(fechaIngreso) + ", turno=" + turno
				+ "]";
	}

}
