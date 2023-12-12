package ar.proyecto.boleto.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Clase que representa el ticket en el sistema
 */
@Component
@Entity
@Table(name = "tickets")
public class Ticket {

	/**
	 * Representa el id del ticket
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tick_id")
	private Long id;

	/**
	 * Representa la categoria del ticket
	 */
	@Column(name = "tick_categoria")
	private String categoria;

	/**
	 * Representa el precio de la entrada del ticket
	 */
	@Column(name = "tick_precio")
	private float precio;

	/**
	 * Representa el evento del ticket
	 */
	@ManyToOne
	private Evento evento;
	
	/**
	 * Representa el cliente del ticket
	 */
	@OneToMany(mappedBy = "ticket")
	private Cliente cliente;


	/**
	 * Constructor por defecto
	 */
	public Ticket() {
	}

	/**
	 * Constructor Parametrizado
	 * @param categoria
	 * @param precio
	 */
	public Ticket( String categoria, float precio) {
		this.categoria = categoria;
		this.precio = precio;
		
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

	
	

}
