package com.viaflow.vfood.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class ProdutoCompra {
	
	@NotEmpty
	@DBRef
	private Compra compra;
	
	@NotEmpty
	@DBRef
	private List<Produto> produtos = new ArrayList<>();
}