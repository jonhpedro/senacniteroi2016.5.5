package lista0;

public class Exercicio05 {
	public static void main(String[] args) {
	/*
	 * Escreva um programa para dado o n�mero de eleitores de um munic�pio, o n�mero de votos
	 * brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o
	 * ao total de eleitores.
	 */
		
		int nEleitores;
		
		int vBrancos;
		int vNulos;
		int vValidos;
		
		double pBrancos;
		double pNulos;
		double pValidos;
		
		nEleitores = 560;
		
		vBrancos = 10;
		vNulos = 12;
		vValidos = 32;
		
		pBrancos = ((double)vBrancos / nEleitores) * 100;
		pNulos = ((double)vNulos / nEleitores) * 100;
		pValidos = ((double)vValidos / nEleitores) * 100;
		
		System.out.println("O percentual de votos s�o:\nBrancos: " + pBrancos + "%\nNulos: " + pNulos + "%\nV�lidos: " + pValidos + "%");
	}
}
