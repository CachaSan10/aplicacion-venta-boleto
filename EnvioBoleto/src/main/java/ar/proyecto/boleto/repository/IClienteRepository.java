package ar.proyecto.boleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.proyecto.boleto.entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {

}
