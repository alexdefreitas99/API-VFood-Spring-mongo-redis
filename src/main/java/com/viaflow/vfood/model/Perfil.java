package com.viaflow.vfood.model;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Document
public class Perfil extends DTOBase implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@NotEmpty
	private String nome;	
	
}