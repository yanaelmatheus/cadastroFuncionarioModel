package br.com.ponto_mais.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
	@SequenceGenerator(name = "usuario_seq", sequenceName = "usuarios_idusuario_seq", allocationSize = 1)
	@Column(name = "idusuario")
	private Integer idUsuario;
	
	@Column(name = "usuario")
	private String user;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "idfuncionario")
	private Integer idFuncionario;
}
