package ar.proyecto.boleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.proyecto.boleto.entity.Evento;

public interface IEventoRepository extends JpaRepository<Evento, Long> {

}
