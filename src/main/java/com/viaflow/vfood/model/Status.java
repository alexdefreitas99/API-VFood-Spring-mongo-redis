package com.viaflow.vfood.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Status {

	public static final String NAOENCONTRADO = "Objeto Não encontrado";
	private boolean status;
	private String message;
}