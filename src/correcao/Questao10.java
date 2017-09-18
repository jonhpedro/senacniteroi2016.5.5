package correcao;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		/*
		 * Escrever um programa, que leia valores inteiros até ser lido o valor -1.
		 * Quando isso acontecer o programa deverá escrever a soma e a média dos valores
		 * lidos.
		 */

		int num = 0;
		int soma = 0;
		int contador = 0;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Informe o numero: ");
			num = scan.nextInt();

			if (num == -1)
				break;

			soma += num;
			contador++;
		}

		scan.close();
		System.out.println("A soma é: " + soma + " e a media é: " + ((double) soma / contador));
	}
}
