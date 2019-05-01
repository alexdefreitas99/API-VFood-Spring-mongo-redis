package com.viaflow.vfood.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Restaurante {

	@Id
	private int id;
	
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
