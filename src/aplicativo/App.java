package aplicativo;

import java.sql.SQLException;

import entidade.Produto;
import persistencia.ProdutoDAO;

public class App {
	public static void main(String[] args) {

		// Declaração do objeto
		Produto produto = new Produto();
		
		// Atribuição dos valores
		produto.setNmProduto("Controle");
		produto.setDescProduto("Controle para Datashow Epson");
		produto.setPreco(135.70);
		produto.setQuantidade(200);
		
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
