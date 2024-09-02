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

import br.com.ponto_mais.dto.DepartamentoDTO;
import br.com.ponto_mais.dto.FuncionarioDTO;
import br.com.ponto_mais.entity.Departamento;
import br.com.ponto_mais.service.DepartamentoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("Departamento")
@RequiredArgsConstructor
public class DepartamentoController {

	private final DepartamentoService service;
	
	@GetMapping
	public ResponseEntity<List<DepartamentoDTO>> consultarDepartamentos(){
		return new ResponseEntity<>(service.consultarDepartamentos(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> cadastrarDepartamentos(@RequestBody Departamento departamento){
		service.cadastrarDepartamento(departamento);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> deletarDepartamento(@RequestParam("idDepartamento") Integer idDepartamento){
		service.deletarDepartamento(idDepartamento);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Void> alterarDepartamento(@RequestBody DepartamentoDTO departamento){
		service.alterarDepartamento(departamento);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
