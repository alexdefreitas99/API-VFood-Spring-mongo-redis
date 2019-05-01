package com.viaflow.vfood.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Compra {

	private int id;
	private Usuario usuario;
	private List<Produto> produtos = new ArrayList<>();
	private Restaurante restaurante;
	private boolean status;

//	public double getValorTotal() {
//		double vl = 0;
//		for (Produto produto : produtos) {
//			vl += produto.getPreco();
//		}
//		return vl;
//	}
}
