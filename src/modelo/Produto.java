package modelo;

public class Produto {

	public Integer codigo;
	public String nome;
	public Integer quantidade;
	public Double preco;
	public Integer estoque;
	
	public Double geraDesconto() {
		if((quantidade > 50) && (estoque >= quantidade)) {
			return preco - (preco * 0.12);
		}
		return preco;
	}
}
