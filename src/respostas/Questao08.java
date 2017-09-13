package respostas;

public class Questao08 {
	public static void main(String[] args) {
		/*
		 * 8. Faça um algoritmo para apresentar todos os números da sequência a seguir:
		 * 0, 0.25, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25, 2.5, 2.75, 3.0, 3.25,
		 * 3.5, 3.75, 4.0.
		 */

		for (double valor = 0.; valor <= 4.0; valor += 0.25)
			System.out.print(valor + " ");
		
		/*
		double valor = 0.;
		while(valor <= 4.0) {
			System.out.print(valor + " ");
			valor = valor + 0.25;
		}
		*/
	}
}
