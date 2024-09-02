package br.com.ponto_mais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ponto_mais.entity.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{

}
