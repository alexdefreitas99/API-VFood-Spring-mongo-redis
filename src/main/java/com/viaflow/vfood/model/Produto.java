package com.viaflow.vfood.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Document
public class Produto extends DTOBase {
	
	@Id
	private String id;
	
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
