package aplicativo;

import java.sql.SQLException;

import entidade.Produto;
import persistencia.ProdutoDAO;

public class App {
	public static void main(String[] args) {

		// Declaração do objeto
		Produto produto = new Produto();
		
		// Atribuição dos valores
		produto.setNmProduto("Comida");
		produto.setDescProduto("O povo está com fome");
		produto.setPreco(111135.70);
		produto.setQuantidade(1);
		
		/** banco de dados */
		ProdutoDAO pd = new ProdutoDAO();
		try {
			pd.salvar(produto);
			System.out.println("Produto salvo com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
