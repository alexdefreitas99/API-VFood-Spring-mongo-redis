package com.viaflow.vfood.model;

import lombok.Data;

@Data
public class Usuario {
	private int id;
	private String nome;
	private boolean status;
	private Perfil perfil;
}
