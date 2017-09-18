package correcao;

public class Questao09 {
	public static void main(String[] args) {
		/*
		 * Apresentar todos os valores numéricos inteiros entre 1 e 10. No final
		 * imprimir, separadamente, a soma dos números pares e ímpares
		 */

		int pares = 0;
		int impares = 0;

		for (int i = 2; i < 10; i++) {
			if (i % 2 == 0)
				pares += i;
			else
				impares += i;
		}

		System.out.println("A soma dos pares é: " + pares + " e a soma dos impares é: " + impares);
	}
}
