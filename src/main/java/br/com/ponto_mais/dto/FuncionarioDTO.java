package br.com.ponto_mais.dto;

import java.util.Date;
import java.util.function.Consumer;

import br.com.ponto_mais.entity.Funcionario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDTO {

	private Integer id;
	private String nome;
	private Date nascimento;
	private String sexo;
	private Integer idDepartamento;
	private String departamento;
	
	public Funcionario buildFuncionarioEntity(Funcionario funcionario) {
		nullSafeSet(id, funcionario::setIdFuncionario);
		nullSafeSet(nome, funcionario::setNome);
		nullSafeSet(nascimento, funcionario::setDtNasc);
		nullSafeSet(sexo, funcionario::setSexo);
		nullSafeSet(idDepartamento, funcionario::setIdDepartamento);
		
		return funcionario;
	}
	
	private static <T> void nullSafeSet(T value, Consumer<T> setter) {
        if(value != null) {
            setter.accept(value);
        }
    }
}
