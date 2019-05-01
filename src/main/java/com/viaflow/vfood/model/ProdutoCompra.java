package com.viaflow.vfood.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Document
public class ProdutoCompra extends DTOBase {
	
	@NotEmpty
	@DBRef
	private Compra compra;
	
	@NotEmpty
	@DBRef
	private List<Produto> produtos = new ArrayList<>();
}