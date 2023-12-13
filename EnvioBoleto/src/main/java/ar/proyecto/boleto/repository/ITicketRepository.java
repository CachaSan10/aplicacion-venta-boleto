package ar.proyecto.boleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.proyecto.boleto.entity.Ticket;

public interface ITicketRepository extends JpaRepository<Ticket, Long> {

}
