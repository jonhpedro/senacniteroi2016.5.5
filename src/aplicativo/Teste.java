package aplicativo;

import entidade.Endereco;
import entidade.Pessoa;

public class Teste {
	public static void main(String[] args) {

		// Objeto de Pessoa
		Pessoa p = new Pessoa();
		// Objeto de Endereço
		Endereco e = new Endereco();

		// Atribuição dos dados de Pessoa
		p.setId(1);
		p.setNome("Matheus");
		p.setEmail("teteus@gmail.com");

		// Atribuição dos dados de Endereço
		e.setId(100);
		e.setLogradouro("Rua dos bobos, nº 0, 11111-111");

		// Associação entre Pessoa e Endereço
		p.setEndereco(e);

		// Associação entre Endereço e Pessoa
		e.setPessoa(p);

		// Impressão dos dados de Endereco pelo objeto de Pessoa
		System.out.println("ID: " + p.getId());
		System.out.println("Nome: " + p.getNome());
		System.out.println("Email: " + p.getEmail());

		// Impressão dos dados de Endereço pelo objeto de Pessoa
		System.out.println("Endereço: " + p.getEndereco().getLogradouro());

		System.out.println("-------------------------------");

		// Impressão dos dados pelo objeto de Endereço
		System.out.println("ID: " + e.getId());
		System.out.println("Endereço: " + e.getLogradouro());
		// Impressão dos dados de Pessoa pelo objeto de Endereco
		System.out.println("Nome: " + e.getPessoa().getNome());
		System.out.println("Email: " + e.getPessoa().getEmail());
	}
}
