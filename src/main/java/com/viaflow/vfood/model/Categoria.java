package com.viaflow.vfood.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Document
public class Categoria extends DTOBase{
	
	@Id
	private String id;
	
	@NotEmpty
	private String nome;
	
	private boolean status;
}
