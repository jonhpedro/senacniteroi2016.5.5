package app;

import java.util.Scanner;

import modelo.Produto;

public class Aplicativo {
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o código: ");
		produto.codigo = Integer.parseInt(scan.nextLine());
		System.out.print("Informe o nome: ");
		produto.nome = scan.nextLine();
		System.out.print("Informe a quantidade: ");
		produto.quantidade = Integer.parseInt(scan.nextLine());
		System.out.print("Informe o preço: ");
		produto.preco = Double.parseDouble(scan.nextLine());
		System.out.print("Informe a quantidade estoque: ");
		produto.estoque = Integer.parseInt(scan.nextLine());
		
		scan.close();
		
		System.out.println("Os dados informados foram: " + 
						   "\nCódigo: " + produto.codigo + 
						   "\nNome: " + produto.nome + 
						   "\nQuantidade: " + produto.quantidade + 
						   "\nPreço: " + produto.preco +
						   "\nEstoque: " + produto.estoque +
						   "\n\nO produto com desconto é: " + produto.geraDesconto());
		
	}
}
