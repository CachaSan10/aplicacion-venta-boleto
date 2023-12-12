package ar.proyecto.boleto.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	@OneToOne(mappedBy = "evento")
	private Artista artista;

	/**
	 * Representa el ticket del evento
	 */
	@OneToMany(mappedBy = "evento")
	private Ticket ticket;
}
