package br.com.ponto_mais.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ponto_mais.entity.Ponto;
import br.com.ponto_mais.service.PontoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/Ponto")
@RequiredArgsConstructor
public class PontoController {
	
	private final PontoService service;
	
	@PostMapping
	public ResponseEntity<Void> baterPonto(@RequestBody Ponto ponto){
		service.baterPonto(ponto);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Ponto>> consultarPontos(@RequestBody Integer idFuncionario){
		return new ResponseEntity<>(service.consultarPontos(idFuncionario), HttpStatus.OK);
	}
}
