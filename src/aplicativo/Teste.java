package aplicativo;

import entidade.Endereco;
import entidade.Pessoa;

public class Teste {
	public static void main(String[] args) {

		// Objeto de Pessoa
		Pessoa p = new Pessoa();
		// Objeto de Endere�o
		Endereco e = new Endereco();

		// Atribui��o dos dados de Pessoa
		p.setId(1);
		p.setNome("Matheus");
		p.setEmail("teteus@gmail.com");

		// Atribui��o dos dados de Endere�o
		e.setId(100);
		e.setLogradouro("Rua dos bobos, n� 0, 11111-111");

		// Associa��o entre Pessoa e Endere�o
		p.setEndereco(e);

		// Associa��o entre Endere�o e Pessoa
		e.setPessoa(p);

		// Impress�o dos dados de Endereco pelo objeto de Pessoa
		System.out.println("ID: " + p.getId());
		System.out.println("Nome: " + p.getNome());
		System.out.println("Email: " + p.getEmail());

		// Impress�o dos dados de Endere�o pelo objeto de Pessoa
		System.out.println("Endere�o: " + p.getEndereco().getLogradouro());

		System.out.println("-------------------------------");

		// Impress�o dos dados pelo objeto de Endere�o
		System.out.println("ID: " + e.getId());
		System.out.println("Endere�o: " + e.getLogradouro());
		// Impress�o dos dados de Pessoa pelo objeto de Endereco
		System.out.println("Nome: " + e.getPessoa().getNome());
		System.out.println("Email: " + e.getPessoa().getEmail());
	}
}
