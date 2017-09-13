package respostas;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		/*
		 * 10. Elabore um programa que, dada a idade de um nadador, classifique-o em uma
		 * das seguintes categorias: a. Infantil A = 5 - 7 anos b. Infantil B = 8 - 10
		 * anos c. Juvenil A = 11 - 13 anos d. Juvenil B = 14 - 17 anos e. Sênior =
		 * maiores de 17 anos
		 */

		int idade;
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a idade: ");
		idade = scan.nextInt();

		scan.close();
		
		if (idade > 4 && idade < 8) {
			System.out.println("Infantil A");
		} else if (idade > 7 && idade < 11) {
			System.out.println("Infantil B");
		} else if (idade > 10 && idade < 14) {
			System.out.println("Juvenil A");
		} else if (idade > 13 && idade < 18) {
			System.out.println("Juvenil B");
		} else if (idade > 17) {
			System.out.println("Sênior");
		} else {
			System.out.println("Não tem idade para nadar");
		}
	}
}
