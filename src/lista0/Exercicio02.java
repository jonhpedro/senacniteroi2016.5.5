package lista0;

public class Exercicio02 {
	public static void main(String[] args) {
		/*
		 * Implemente um programa para determinar o consumo m�dio de um autom�vel atrav�s da
		 * f�rmula: Consumo M�dio = Dist�ncia / Litros de Combust�vel consumido.
		 */
		
		double consumoMedio;
		double distancia;
		double litrosConsumido;
		
		distancia = 10.;
		litrosConsumido = 25.;
		
		consumoMedio = distancia / litrosConsumido;
		
		System.out.println("Consumo m�dio: " + consumoMedio);
	}
}
