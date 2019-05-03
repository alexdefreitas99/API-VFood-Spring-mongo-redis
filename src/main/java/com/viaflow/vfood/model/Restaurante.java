package com.viaflow.vfood.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Document
public class Restaurante extends DTOBase {

	@Id
	private String id;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String telefone;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String descricao;
	
	@NotEmpty
	private int tempoEntrega;
	
	@NotEmpty
	private boolean status;
	
	@NotEmpty
	private String horarioAbertura;
	
	@NotEmpty
	private String horarioFechamento;
	// private List<Produto> produtos = new ArrayList<>();	
}
