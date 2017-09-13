package respostas;

public class Questao09 {
	public static void main(String[] args) {
		/*
		 * 9. Fulano tem 1,50 metro e cresce 2 centímetros por ano, enquanto Ciclano tem
		 * 1,10 metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule
		 * e imprima quantos anos serão necessários para que Ciclano seja maior que
		 * Fulano.
		 */

		double fulano = 1.50;
		double ciclano = 1.10;
		int anos = 0;

		while (ciclano <= fulano) {
			fulano += 0.02;
			ciclano += 0.03;
			anos++;
		}

		System.out.println("Serão necessário " + anos + " anos");
	}
}
