package ar.proyecto.boleto.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
	 * Representa el evento del ticket
	 */
	@ManyToOne
	private Evento evento;
	
	/**
	 * Representa el cliente del ticket
	 */
	@OneToOne(mappedBy = "ticket")
	private Cliente cliente;


	/**
	 * Constructor por defecto
	 */
	public Ticket() {
	}


	/**
	 * @param evento
	 * @param cliente
	 */
	public Ticket(Evento evento, Cliente cliente) {
		this.evento = evento;
		this.cliente = cliente;
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


	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}


	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Ticket [id=" + id + ", evento=" + evento + ", cliente=" + cliente + "]";
	}

	
	
	

}
