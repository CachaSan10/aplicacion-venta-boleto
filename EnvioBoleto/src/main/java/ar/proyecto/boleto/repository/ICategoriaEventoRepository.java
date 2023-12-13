package ar.proyecto.boleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.proyecto.boleto.entity.CategoriaEvento;

public interface ICategoriaEventoRepository extends JpaRepository<CategoriaEvento, Long> {

}
