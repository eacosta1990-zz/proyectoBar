package datos;

import java.util.GregorianCalendar;

public abstract class Persona {
	private int idPersona;
	private String nombre;
	private GregorianCalendar fechaNacimiento;
	private double dni;
	private String telefono;
	private String direccion;

	public Persona() {

	}

	public Persona(String nombre, GregorianCalendar fechaNacimiento, double dni, String telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public int getIdPersona() {
		return idPersona;
	}

	protected void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public GregorianCalendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getDni() {
		return dni;
	}

	public void setDni(double dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
