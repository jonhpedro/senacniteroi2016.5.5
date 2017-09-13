package respostas;

public class Questao09 {
	public static void main(String[] args) {
		/*
		 * 9. Fulano tem 1,50 metro e cresce 2 cent�metros por ano, enquanto Ciclano tem
		 * 1,10 metro e cresce 3 cent�metros por ano. Construa um algoritmo que calcule
		 * e imprima quantos anos ser�o necess�rios para que Ciclano seja maior que
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

		System.out.println("Ser�o necess�rio " + anos + " anos");
	}
}
