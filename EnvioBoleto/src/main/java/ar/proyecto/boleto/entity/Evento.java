package ar.proyecto.boleto.entity;

import java.time.LocalDate;
import java.time.LocalTime;

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
 * Clase que representa el evento del sistema
 */
@Component
@Entity
@Table(name = "eventos")
public class Evento {

	/**
	 * Representa el id del evento
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "even_id")
	private Long id;

	/**
	 * Representa el nombre del evento
	 */
	@Column(name = "even_nombre")
	private String nombre;
	
	/**
	 * Representa la direccion del evento
	 */
	@Column(name = "even_direccion")
	private String direccion;
	
	/**
	 * Representa la fecha del evento
	 */
	@Column(name = "even_fecha")
	private LocalDate fecha;

	/**
	 * Representa la hora del evento
	 */
	@Column(name = "even_hora")
	private LocalTime hora;

	/**
	 * Representa el artista del evento
	 */
	@ManyToOne
	private Artista artista;

	/**
	 * Representa el ticket del evento
	 */
	@OneToMany(mappedBy = "evento")
	private Ticket ticket;

	/**
	 * Representa la categoria del evento
	 */
	@OneToMany(mappedBy = "evento")
	private CategoriaEvento categoriaEvento;

	/**
	 * Constructor por defecto
	 */
	public Evento() {
	}

	/**
	 * Constructor parametrizado
	 * @param nombre
	 * @param direccion
	 * @param fecha
	 * @param hora
	 * @param artista
	 * @param ticket
	 * @param categoriaEvento
	 */
	public Evento(String nombre, String direccion, LocalDate fecha, LocalTime hora, Artista artista, Ticket ticket,
			CategoriaEvento categoriaEvento) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.fecha = fecha;
		this.hora = hora;
		this.artista = artista;
		this.ticket = ticket;
		this.categoriaEvento = categoriaEvento;
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
	 * @return the artista
	 */
	public Artista getArtista() {
		return artista;
	}

	/**
	 * @param artista the artista to set
	 */
	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	/**
	 * @return the ticket
	 */
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	/**
	 * @return the categoriaEvento
	 */
	public CategoriaEvento getCategoriaEvento() {
		return categoriaEvento;
	}

	/**
	 * @param categoriaEvento the categoriaEvento to set
	 */
	public void setCategoriaEvento(CategoriaEvento categoriaEvento) {
		this.categoriaEvento = categoriaEvento;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", fecha=" + fecha + ", hora="
				+ hora + ", artista=" + artista + ", ticket=" + ticket + ", categoriaEvento=" + categoriaEvento + "]";
	}

	
	

}
