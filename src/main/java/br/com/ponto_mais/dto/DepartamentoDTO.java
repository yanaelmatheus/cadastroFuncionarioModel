package br.com.ponto_mais.dto;

import java.util.function.Consumer;

import br.com.ponto_mais.entity.Departamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoDTO {
	private Integer id;
	private String nome;
	
	public void buildDepartamentoEntity(Departamento departamento) {
		nullSafeSet(id, departamento::setIdDepartamento);
		nullSafeSet(nome, departamento::setNome);
	}
	
	private static <T> void nullSafeSet(T value, Consumer<T> setter) {
        if(value != null) {
            setter.accept(value);
        }
    }
}
