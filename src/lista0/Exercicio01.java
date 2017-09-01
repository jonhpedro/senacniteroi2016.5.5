package lista0;

public class Exercicio01 {
	// método de execução "arranque"
	public static void main(String[] args) {

		// real - float / double
		double valorDoProduto = 50.0;
		double desconto = valorDoProduto * (9.0 / 100);
		double novoValorDoProduto;
		
		novoValorDoProduto = valorDoProduto - desconto;
		
		System.out.println(novoValorDoProduto);
		
		// outra forma
		System.out.println(valorDoProduto - (valorDoProduto * 0.09));
	}
}
