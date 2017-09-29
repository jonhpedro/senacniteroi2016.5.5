package exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VetorProdutos {
	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<Produto>();
		Produto p;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			p = new Produto();

			System.out.print("Informe o ID: ");
			p.setId(Integer.parseInt(scan.nextLine()));
			System.out.print("Informe o nome: ");
			p.setNome(scan.nextLine());
			System.out.print("Informe a quantidade: ");
			p.setQuantidade(Integer.parseInt(scan.nextLine()));
			System.out.print("Informe o preço: ");
			p.setPreco(Double.parseDouble(scan.nextLine()));
			
			lista.add(p);
		}

		scan.close();

		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Id: " + lista.get(i).getId());
			System.out.println("Nome: " + lista.get(i).getNome());
			System.out.println("Quantidade: " + lista.get(i).getQuantidade());
			System.out.println("Preço: " + lista.get(i).getPreco());
		}
	}

}
