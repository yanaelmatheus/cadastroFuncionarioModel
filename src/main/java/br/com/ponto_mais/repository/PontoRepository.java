package br.com.ponto_mais.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ponto_mais.entity.Ponto;

public interface PontoRepository  extends JpaRepository<Ponto, Integer>{

}
