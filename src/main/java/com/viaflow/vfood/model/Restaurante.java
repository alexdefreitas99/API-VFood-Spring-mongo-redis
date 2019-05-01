package com.viaflow.vfood.model;

import lombok.Data;

@Data
public class Restaurante {

	private int id;
	private String nome;
	private String telefone;
	private String email;
	private String descricao;
	private int tempoEntrega;
	private boolean status;
	private String horarioAbertura;
	private String horarioFechamento;
	// private List<Produto> produtos = new ArrayList<>();	
}
