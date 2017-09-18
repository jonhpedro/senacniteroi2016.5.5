package correcao;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		/*
		 * Dados dois números A e B, faça um programa que calcule a soma de todos os
		 * inteiros existentes entre A e B.
		 */
		
		int numA;
		int numB;
		int soma = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o numero A: ");
		numA = scan.nextInt(); 
		System.out.print("Informe o numero B: ");
		numB = scan.nextInt(); 
		
		scan.close();
		
		for(int i = (numA+1); i < numB; i++)
			soma += i;
		
		System.out.println("A soma é: " + soma);
	}
}
