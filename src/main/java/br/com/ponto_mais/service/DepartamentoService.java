package br.com.ponto_mais.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.ponto_mais.dto.DepartamentoDTO;
import br.com.ponto_mais.entity.Departamento;
import br.com.ponto_mais.entity.Funcionario;
import br.com.ponto_mais.repository.DepartamentoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartamentoService {

	private final DepartamentoRepository repository;
	
	public List<DepartamentoDTO> consultarDepartamentos(){
		List<DepartamentoDTO> departamentos = new ArrayList<>();
		repository.findAll().stream().forEach(d -> departamentos.add(new DepartamentoDTO(d.getIdDepartamento(), d.getNome())));
		return departamentos;
	}
	
	public void cadastrarDepartamento(Departamento departamento){
		repository.save(departamento);
	}
	
	public void alterarDepartamento(DepartamentoDTO departamento) {
		Optional<Departamento> departamentoOptional = repository.findById(departamento.getId());
		Departamento departamentoEntity = new Departamento();
		if(departamentoOptional.isPresent()) {
			departamentoEntity = departamentoOptional.get();
			departamento.buildDepartamentoEntity(departamentoEntity);
		}
		
		repository.save(departamentoEntity);
	}
	
	public void deletarDepartamento(Integer idDepartamento) {
		repository.deleteById(idDepartamento);
	}
}
