package respostas;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		/*
		 * 6. Fa�a um programa que receba um valor que foi depositado e exiba o valor
		 * com rendimento ap�s cinco meses. Considere fixo o juro da poupan�a em 0.70%
		 * a. m.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor depositado: ");
		Double valor = scan.nextDouble();

		scan.close();

		valor += (valor * (0.70 / 100)) * 5;

		System.out.println("O valor com rendimento de 5 meses com juros de 0.70% � de: " + valor);
	}
}
