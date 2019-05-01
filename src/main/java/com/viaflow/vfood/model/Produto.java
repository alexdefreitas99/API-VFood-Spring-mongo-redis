package com.viaflow.vfood.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Produto {
	
	@Id
	private int id;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private double preco;
	
	@NotEmpty
	private int tempoPreparo;
	
	@NotEmpty
	@DBRef
	private Categoria categoria;
	
	@NotEmpty
	@DBRef
	private Restaurante Restaurante;
	
	@NotEmpty
	private boolean status;
}
