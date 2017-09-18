package correcao;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		/*
		 * Escrever um programa, que leia valores inteiros at� ser lido o valor -1.
		 * Quando isso acontecer o programa dever� escrever a soma e a m�dia dos valores
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
		System.out.println("A soma �: " + soma + " e a media �: " + ((double) soma / contador));
	}
}
