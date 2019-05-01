package com.viaflow.vfood.model;

import lombok.Data;

@Data
public class Produto {
	private int id;
	private String nome;
	private double preco;
	private int tempoPreparo;
	private Categoria categoria;
	private Restaurante Restaurante;
	private boolean status;
}
