package com.viaflow.vfood.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ProdutoCompra {
	private Compra compra;
	private List<Produto> produtos = new ArrayList<>();
}