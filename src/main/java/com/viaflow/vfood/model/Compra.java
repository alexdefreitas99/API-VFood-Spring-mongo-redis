package com.viaflow.vfood.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Document
public class Compra extends DTOBase{

	@Id
	private int id;
	
	@NotEmpty
	@DBRef
	private Usuario usuario;
	
	@NotEmpty
	@DBRef
	private List<Produto> produtos = new ArrayList<>();
	
	@NotEmpty
	@DBRef
	private Restaurante restaurante;
	
	private boolean status;

	public double getValorTotal() {
		double vl = 0;
		for (Produto produto : produtos) {
			vl += produto.getPreco();
		}
		return vl;
	}
}
