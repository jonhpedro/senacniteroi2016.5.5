package app;

import java.util.Scanner;

import modelo.Produto;

public class Aplicativo {
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o c�digo: ");
		produto.codigo = Integer.parseInt(scan.nextLine());
		System.out.print("Informe o nome: ");
		produto.nome = scan.nextLine();
		System.out.print("Informe a quantidade: ");
		produto.quantidade = Integer.parseInt(scan.nextLine());
		System.out.print("Informe o pre�o: ");
		produto.preco = Double.parseDouble(scan.nextLine());
		System.out.print("Informe a quantidade estoque: ");
		produto.estoque = Integer.parseInt(scan.nextLine());
		
		scan.close();
		
		System.out.println("Os dados informados foram: " + 
						   "\nC�digo: " + produto.codigo + 
						   "\nNome: " + produto.nome + 
						   "\nQuantidade: " + produto.quantidade + 
						   "\nPre�o: " + produto.preco +
						   "\nEstoque: " + produto.estoque +
						   "\n\nO produto com desconto �: " + produto.geraDesconto());
		
	}
}
