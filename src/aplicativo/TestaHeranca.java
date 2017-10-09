package aplicativo;

import entidade.Cliente;
import entidade.Funcionario;

public class TestaHeranca {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setId(1L);
		cliente.setNome("José");
		cliente.setEmail("jose@senac.com.br");
		cliente.setSexo("Masculino");
		cliente.setCpf("123.456.789-00");
		cliente.setTipoDePagamento("Dinheiro");
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setId(2L);
		funcionario.setNome("Maria");
		funcionario.setMatricula(1234L);
		funcionario.setEmail("maria@gmail.com");
		funcionario.setSalario(10000.0);
		funcionario.setLogin("maria");
		funcionario.setSenha("123");
		funcionario.setSexo("Feminino");
	}
}
