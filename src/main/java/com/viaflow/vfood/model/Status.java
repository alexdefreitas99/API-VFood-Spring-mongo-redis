package com.viaflow.vfood.model;

import lombok.Data;

@Data
public class Status {

	public static final String NAOENCONTRADO = "Objeto Não encontrado";
	private boolean status;
	private String message;
}