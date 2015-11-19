package br.aeso.aula20;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestaMaiorEMenorJUnit {
	@Test
	public void ValidandoCarrinhoDeCompra() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
		
		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);
		assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());
		assertEquals("Geladeira", algoritmo.getMaior().getNome());
	}
}
