package aplicativo;

import java.util.Scanner;

import javax.swing.JOptionPane;

import entidade.Produto;
import implement.ProdutoDAOImp;

public class App {

	public static void main(String[] args) {

		ProdutoDAOImp pdi = new ProdutoDAOImp();

		/** banco de dados */
		try (Scanner scan = new Scanner(System.in)) {

			Integer opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Informa a opção\n" + "1 - Cadastrar\n" + "2 - Listar\n" + "3 - Buscar\n" + "4 - Excluir"));

			switch (opcao) {
			case 1:
				if (pdi.gravar(setProduto()))
					System.out.println("Produto salvo com sucesso");
				else
					System.out.println("Falha ao gravar");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, pdi.listar());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, pdi.buscaNome(JOptionPane.showInputDialog("Informe o nome do produto:")));
				break;
			case 4:
				JOptionPane.showMessageDialog(null, pdi.deletar(Long.parseLong(JOptionPane.showInputDialog("Informe o id do produto:"))));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção errada");
				break;
			}
		}
	}

	private static Produto setProduto() {

		Produto produto = new Produto();
		JOptionPane.showMessageDialog(null, "Entre com os seguintes dados de produto");

		produto.setNmProduto(JOptionPane.showInputDialog("Nome"));
		produto.setDescProduto(JOptionPane.showInputDialog("Descrição"));
		produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço")));
		produto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Quantidade")));
		return produto;
	}
}
