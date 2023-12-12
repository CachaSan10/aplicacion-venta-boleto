package ar.proyecto.boleto.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Clase que representa al cliente que esta en el sistema
 */
@Component
@Entity
@Table(name = "clientes")
public class Cliente {

	/**
	 * Representa el id del cliente
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cli_id")
	private Long id;

	/**
	 * Representa el nombre del cliente
	 */
	@Column(name = "cli_nombre")
	private String nombre;

	/**
	 * Representa el apellido del cliente
	 */
	@Column(name = "cli_apellido")
	private String apellido;

	/**
	 * Representa el correo electronico del cliente
	 */
	@Column(name = "cli_correo")
	private String correo_electronico;
	
	@ManyToOne
	private Ticket ticket;

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
