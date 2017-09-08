package app;

import java.util.Scanner;

import modelo.Pessoa;

public class AplicativoIMC {
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a altura: ");
		pessoa.altura = Double.parseDouble(scan.nextLine());
		System.out.print("Informe o peso: ");
		pessoa.peso = Integer.parseInt(scan.nextLine());
		
		System.out.println("Sua situação com os dados informados é: " + pessoa.calculaIMC());
	}
}
