package exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPessoa {
	public static void main(String[] args) {

		// Lista de objetos
		List<Pessoa> lista = new ArrayList<Pessoa>(); // Quantas pessoas??
		// Objeto Pessoa
		Pessoa p;
		
		// Objeto Scanner (leitura de dados)
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			// criei a instancia (espaço de memória)
			p = new Pessoa();

			// informativo ao usuário para inserir o nome
			System.out.print("Informe o nome: ");
			// manipulando o objeto definindo o nome
			p.setNome(scan.nextLine());
			// informativo ao usuário para inserir a idade
			System.out.print("Informe a idade: ");
			// manipulando o objeto definindo a idade
			p.setIdade(Integer.parseInt(scan.nextLine()));

			// adiciona a pessoa a lista
			lista.add(p);
		}

		scan.close();

		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Nome: " + lista.get(i).getNome());
			System.out.println("Idade: " + lista.get(i).getIdade());
		}
	}
}
