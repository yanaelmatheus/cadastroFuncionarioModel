package br.com.ponto_mais.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.ponto_mais.dto.FuncionarioDTO;
import br.com.ponto_mais.entity.Departamento;
import br.com.ponto_mais.entity.Funcionario;
import br.com.ponto_mais.repository.DepartamentoRepository;
import br.com.ponto_mais.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

	private final FuncionarioRepository funcionarioRepository;
	private final DepartamentoRepository departamentoRepository;
	
	public List<FuncionarioDTO> consultarFuncionarios(){
		List<FuncionarioDTO> funcionarios = new ArrayList<>();
		funcionarioRepository.findAll().stream().forEach(f -> funcionarios.add(new FuncionarioDTO(f.getIdFuncionario(),f.getNome(), f.getDtNasc(), f.getSexo(), f.getIdDepartamento(), departamentoRepository.findById(f.getIdDepartamento()).get().getNome())));
		return funcionarios;
	}
	
	public Funcionario cadastrarFuncionario(Funcionario funcionario){
		return funcionarioRepository.save(funcionario);
	}
	
	public void deletarFuncionario(Integer idFuncionario) {
		funcionarioRepository.deleteById(idFuncionario);
	}
	
	public void alterarFuncionario(FuncionarioDTO funcionario) {
		Optional<Funcionario> empresaOptional = funcionarioRepository.findById(funcionario.getId());
		Funcionario funcionarioEntity = new Funcionario();
		if(empresaOptional.isPresent()) {
			funcionarioEntity = empresaOptional.get();
			funcionario.buildFuncionarioEntity(funcionarioEntity);
		}
		
		funcionarioRepository.save(funcionarioEntity);
	}
}
