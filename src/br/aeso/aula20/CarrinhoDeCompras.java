package br.aeso.aula20;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<Produto> produtos;
	public CarrinhoDeCompras() {
		produtos = new ArrayList<Produto>();
	}
	public void adiciona(Produto produto) {
		produtos.add(produto);
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
}
