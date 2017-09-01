package lista0;

public class Exercicio02 {
	public static void main(String[] args) {
		/*
		 * Implemente um programa para determinar o consumo médio de um automóvel através da
		 * fórmula: Consumo Médio = Distância / Litros de Combustível consumido.
		 */
		
		double consumoMedio;
		double distancia;
		double litrosConsumido;
		
		distancia = 10.;
		litrosConsumido = 25.;
		
		consumoMedio = distancia / litrosConsumido;
		
		System.out.println("Consumo médio: " + consumoMedio);
	}
}
