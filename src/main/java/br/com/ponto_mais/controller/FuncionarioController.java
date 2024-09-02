package br.com.ponto_mais.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ponto_mais.dto.FuncionarioDTO;
import br.com.ponto_mais.entity.Funcionario;
import br.com.ponto_mais.service.FuncionarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("Funcionario")
@RequiredArgsConstructor
public class FuncionarioController {

	private final FuncionarioService service;
	
	@GetMapping
	public ResponseEntity<List<FuncionarioDTO>> consultarFuncionarios(){
		
		return new ResponseEntity<>(service.consultarFuncionarios(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Funcionario> cadastrarFuncionario(@RequestBody Funcionario funcionario){
		return new ResponseEntity<>(service.cadastrarFuncionario(funcionario), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> deletarFuncionario(@RequestParam("idFuncionario") Integer idFuncionario){
		service.deletarFuncionario(idFuncionario);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Void> alterarFuncionario(@RequestBody FuncionarioDTO funcionario){
		service.alterarFuncionario(funcionario);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
