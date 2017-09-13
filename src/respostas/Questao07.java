package respostas;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		/*
		 * 7. Elaborar um programa que efetue a apresentação do valor da conversão em
		 * real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o
		 * valor da cotação do dólar e também a quantidade de dólares disponíveis com o
		 * usuário.
		 */

		Double cotacao;
		Double qntDolar;
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a cotação do dólar: ");
		cotacao = scan.nextDouble();
		System.out.print("Informe a quantidade de dólares: ");
		qntDolar = scan.nextDouble();

		scan.close();
		
		System.out.println("O valor de dolares em reais(R$) é: " + (qntDolar * cotacao));
	}
}
