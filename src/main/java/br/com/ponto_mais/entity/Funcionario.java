package br.com.ponto_mais.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "funcionarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funcionarios_seq")
	@SequenceGenerator(name = "funcionarios_seq", sequenceName = "funcionarios_idfuncionario_seq", allocationSize = 1)
	@Column(name = "idfuncionario")
	private Integer idFuncionario;
	@Column(name = "nome")
	private String nome;
	@Column(name = "dtnasc")
	private Date dtNasc;
	@Column(name = "sexo")
	private String sexo;
	@Column(name = "iddepartamento")
	private Integer idDepartamento;
}
