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
@Table(name = "pontos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ponto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pontos_seq")
	@SequenceGenerator(name = "pontos_seq", sequenceName = "pontos_idponto_seq", allocationSize = 1)
	@Column(name = "idponto")
	private Integer idPonto;
	
	@Column(name = "idfuncionario")
	private Integer idFuncionario;
	
	@Column(name = "datahoraponto")
	private Date dataHoraPonto;
}
