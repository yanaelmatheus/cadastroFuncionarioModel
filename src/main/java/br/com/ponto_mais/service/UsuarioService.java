package br.com.ponto_mais.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.ponto_mais.entity.Usuario;
import br.com.ponto_mais.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
	
	private final UsuarioRepository repository;
	
	public Usuario cadastrarUsuario(Usuario user) {
		return repository.save(user);
	}
	
	public Usuario consultarUsuario(Usuario user) {
		List<Usuario> usuarioEncontrado = repository.findAll().stream().filter(u -> u.getUser().equals(user.getUser())).filter(u -> u.getSenha().equals(user.getSenha())).collect(Collectors.toList());
		if(usuarioEncontrado.isEmpty()) {
			return null;
		} else {
			return usuarioEncontrado.get(0);
		}
	}
}
