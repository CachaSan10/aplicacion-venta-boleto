package ar.proyecto.boleto.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase que representa el ticket en el sistema
 */
public class Ticket {

	/**
	 * Representa el id del ticket
	 */
	private long id;

	/**
	 * Representa el nombre del evento del ticket
	 */
	private String nombre;

	/**
	 * Representa la categoria del ticket
	 */
	private String categoria;

	/**
	 * Representa el precio de la entrada del ticket
	 */
	private float precio;

	/**
	 * Representa la fecha del show
	 */
	private LocalDate fecha;

	/**
	 * Representa la hora del show
	 */
	private LocalTime hora;

	/**
	 * Representa la direccion del show
	 */
	private String direccion;

	/**
	 * Constructor por defecto
	 */
	public Ticket() {
	}

	/**
	 * Constructor Parametrizado
	 * @param nombre
	 * @param categoria
	 * @param precio
	 * @param fecha
	 * @param hora
	 * @param direccion
	 */
	public Ticket(String nombre, String categoria, float precio, LocalDate fecha, LocalTime hora, String direccion) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.fecha = fecha;
		this.hora = hora;
		this.direccion = direccion;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the hora
	 */
	public LocalTime getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio
				+ ", fecha=" + fecha + ", hora=" + hora + ", direccion=" + direccion + "]";
	}

}
