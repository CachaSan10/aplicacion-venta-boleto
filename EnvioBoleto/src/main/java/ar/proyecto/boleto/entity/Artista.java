package ar.proyecto.boleto.entity;

/**
 * Clase que representa al artista que esta en el sistema
 */
public class Artista {

	/**
	 * Representa el id del artista
	 */
	private long id;

	/**
	 * Representa el nombre artistico del artista
	 */
	private String nombre_artistico;

	/**
	 * Representa el genero musical del artista
	 */
	private String genero_musical;

	/**
	 * Constructor por defecto
	 */
	public Artista() {

	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre_artistico
	 * @param genero_musical
	 */
	public Artista(String nombre_artistico, String genero_musical) {
		this.nombre_artistico = nombre_artistico;
		this.genero_musical = genero_musical;
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

	@Override
	public String toString() {
		return "Artista [id=" + id + ", nombre_artistico=" + nombre_artistico + ", genero_musical=" + genero_musical
				+ "]";
	}

}