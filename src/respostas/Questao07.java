package respostas;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		/*
		 * 7. Elaborar um programa que efetue a apresenta��o do valor da convers�o em
		 * real (R$) de um valor lido em d�lar (US$). O algoritmo dever� solicitar o
		 * valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis com o
		 * usu�rio.
		 */

		Double cotacao;
		Double qntDolar;
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a cota��o do d�lar: ");
		cotacao = scan.nextDouble();
		System.out.print("Informe a quantidade de d�lares: ");
		qntDolar = scan.nextDouble();

		scan.close();
		
		System.out.println("O valor de dolares em reais(R$) �: " + (qntDolar * cotacao));
	}
}
