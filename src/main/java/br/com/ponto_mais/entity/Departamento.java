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
@Table(name = "departamentos")
@Data
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "departamento_seq")
	@SequenceGenerator(name = "departamento_seq", sequenceName = "departamentos_iddepartamento_seq", allocationSize = 1)
	@Column(name = "iddepartamento")
	private Integer idDepartamento;
	
	@Column(name = "nome")
	private String nome;
}
