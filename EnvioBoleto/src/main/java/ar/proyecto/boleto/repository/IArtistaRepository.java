package ar.proyecto.boleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.proyecto.boleto.entity.Artista;

public interface IArtistaRepository extends JpaRepository<Artista, Long> {

}
