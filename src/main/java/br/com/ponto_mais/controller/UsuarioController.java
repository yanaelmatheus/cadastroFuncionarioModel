package br.com.ponto_mais.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ponto_mais.entity.Usuario;
import br.com.ponto_mais.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/Usuario")
@RequiredArgsConstructor
public class UsuarioController {
	
	private final UsuarioService service;
	
	@PostMapping
	public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario user) {
		return new ResponseEntity<>(service.cadastrarUsuario(user), HttpStatus.OK);
	}
	
	@PostMapping("/logar")
	public ResponseEntity<Usuario> consultarUsuario(@RequestBody Usuario user) {
		return new ResponseEntity<>(service.consultarUsuario(user), HttpStatus.OK);
	}
}
