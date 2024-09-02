package br.com.ponto_mais.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.ponto_mais.entity.Ponto;
import br.com.ponto_mais.repository.PontoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PontoService {

	private final PontoRepository repository;
	
	public void baterPonto(Ponto ponto) {
		repository.save(ponto);
	}
	
	public List<Ponto> consultarPontos(Integer idFuncionario) {
		return repository.findAll().stream().filter(p -> p.getIdFuncionario() == idFuncionario).collect(Collectors.toList());
	}
}
