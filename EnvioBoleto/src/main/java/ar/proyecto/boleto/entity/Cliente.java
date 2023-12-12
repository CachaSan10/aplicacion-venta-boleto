package ar.proyecto.boleto.entity;



/**
 * Clase que representa al cliente que esta en el sistema
 */
public class Cliente {

	/**
	 * Representa el id del cliente
	 */
	private long id;

	/**
	 * Representa el nombre del cliente
	 */
	private String nombre;

	/**
	 * Representa el apellido del cliente
	 */
	private String apellido;

	/**
	 * Representa el correo electronico del cliente
	 */
	private String correo_electronico;

	/**
	 * Constructor por defecto
	 */
	public Cliente() {
	}

	/**
	 * Constructor Parametrizado
	 * 
	 * @param nombre
	 * @param apellido
	 * @param correo_electronico
	 */
	public Cliente(String nombre, String apellido, String correo_electronico) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo_electronico = correo_electronico;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the correo_electronico
	 */
	public String getCorreo_electronico() {
		return correo_electronico;
	}

	/**
	 * @param correo_electronico the correo_electronico to set
	 */
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo_electronico="
				+ correo_electronico + "]";
	}

}
