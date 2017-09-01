package lista1;
/*
Uma conta telefônica é composta dos seguintes custos:

Assinatura: R$ 32,00
Impulsos: R$ 0,09 por impulso que exceder a 90
Chamadas p/ celular: R$0,35 por impulso
Escreva um programa que monte a fórmula para calcular o valor da conta para 254 impulsos e
23 chamadas para celular imprimindo o resultado obtido.
*/
public class Exercicio03 {
	public static void main(String[] args) {
		
		double assinatura = 32.;
		double impulsos = .09;
		double chamadasCelular = .35;
		
		double valorDaConta = assinatura + ((254 - 90) * impulsos) + 23 * chamadasCelular;
		
		System.out.println("O valor da conta será: " + valorDaConta);
	}
}
