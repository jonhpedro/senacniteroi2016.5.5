package correcao;

public class Questao09 {
	public static void main(String[] args) {
		/*
		 * Apresentar todos os valores num�ricos inteiros entre 1 e 10. No final
		 * imprimir, separadamente, a soma dos n�meros pares e �mpares
		 */

		int pares = 0;
		int impares = 0;

		for (int i = 2; i < 10; i++) {
			if (i % 2 == 0)
				pares += i;
			else
				impares += i;
		}

		System.out.println("A soma dos pares �: " + pares + " e a soma dos impares �: " + impares);
	}
}
