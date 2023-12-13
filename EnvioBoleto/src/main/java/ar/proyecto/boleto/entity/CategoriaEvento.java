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
 * Clase que representa la categoria del evento en el sistema
 */
@Component
@Entity
@Table(name = "categorias_evento")
public class CategoriaEvento {

	/**
	 * Representa el id de la categoria del evento
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cat_even_id")
	private Long id;
	
	/**
	 * Representa el nombre de la categoria del evento
	 */
	@Column(name = "cat_even_nombre")
	private String nombre;
	
	/**
	 * Representa el precio de la categoria del evento
	 */
	@Column(name = "cat_even_precio")
	private float precio;
	
	/**
	 * Representa el evento de la categoria
	 */
	@ManyToOne
	private Evento evento;

	/**
	 * Constructor por defecto
	 */
	public CategoriaEvento() {
	}

	/**
	 * Constructor parametrizado
	 * @param nombre
	 * @param precio
	 * @param evento
	 */
	public CategoriaEvento(String nombre, float precio, Evento evento) {
		this.nombre = nombre;
		this.precio = precio;
		this.evento = evento;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	 * @return the evento
	 */
	public Evento getEvento() {
		return evento;
	}

	/**
	 * @param evento the evento to set
	 */
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	@Override
	public String toString() {
		return "CategoriaEvento [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", evento=" + evento + "]";
	}
	
	
}
