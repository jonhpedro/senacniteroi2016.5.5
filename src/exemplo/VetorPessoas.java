package exemplo;

import java.util.ArrayList;
import java.util.List;

public class VetorPessoas {
	public static void main(String[] args) {

		// Lista de objetos
		List<Pessoa> lista = new ArrayList<Pessoa>(); // Quantas pessoas??
		
		lista.add(new Pessoa()); // criei a instancia, agora ele tem?
		lista.get(0).setNome("Luis Paulo");
		lista.get(0).setIdade(30);
		
		System.out.println(lista.get(0).getNome());
		System.out.println(lista.get(0).getIdade());
	}
}
