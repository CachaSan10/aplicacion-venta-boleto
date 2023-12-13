package ar.proyecto.boleto.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Clase que representa al artista que esta en el sistema
 */
@Component
@Entity
@Table(name="artistas")
public class Artista {

	/**
	 * Representa el id del artista
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="art_id")
	private Long id;

	/**
	 * Representa el nombre artistico del artista
	 */
	@Column(name = "art_nombre")
	private String nombre_artistico;

	/**
	 * Representa el genero musical del artista
	 */
	@Column(name = "art_gen_musical")
	private String genero_musical;
	
	/**
	 * Representa el evento donde el artista dara el espectaculo
	 */
	@OneToMany(mappedBy = "artista")
	private Evento evento;

	/**
	 * Constructor por defecto
	 */
	public Artista() {

	}

	/**
	 * @param nombre_artistico
	 * @param genero_musical
	 * @param evento
	 */
	public Artista(String nombre_artistico, String genero_musical, Evento evento) {
		this.nombre_artistico = nombre_artistico;
		this.genero_musical = genero_musical;
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
	 * @return the nombre_artistico
	 */
	public String getNombre_artistico() {
		return nombre_artistico;
	}

	/**
	 * @param nombre_artistico the nombre_artistico to set
	 */
	public void setNombre_artistico(String nombre_artistico) {
		this.nombre_artistico = nombre_artistico;
	}

	/**
	 * @return the genero_musical
	 */
	public String getGenero_musical() {
		return genero_musical;
	}

	/**
	 * @param genero_musical the genero_musical to set
	 */
	public void setGenero_musical(String genero_musical) {
		this.genero_musical = genero_musical;
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
		return "Artista [id=" + id + ", nombre_artistico=" + nombre_artistico + ", genero_musical=" + genero_musical
				+ ", evento=" + evento + "]";
	}
	
	

	

}
