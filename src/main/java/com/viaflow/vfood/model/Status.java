package com.viaflow.vfood.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Document
public class Status extends DTOBase {
	public static final String NAOENCONTRADO = "Objeto Não encontrado";
	private boolean status;
	private String message;
}