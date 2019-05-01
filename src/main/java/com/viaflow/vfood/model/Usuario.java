package com.viaflow.vfood.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Usuario {
	
	@Id
	private int id;
	
	@NotEmpty
	private String nome;
	
	private boolean status;
	
	@NotEmpty
	@DBRef
	private Perfil perfil;
}
