package lista0;

public class Exercicio03 {
	/*
	 * Escreva um programa que dados os litros gastos, os quil�metros percorridos por um autom�vel
	 * e o valor do litro de combust�vel, calcule os gastos de combust�vel em reais/km.
	*/
	public static void main(String[] args) {
		double litrosGastos;
		double quilometrosPercorridos;
		double valorLitro;
		
		litrosGastos = 15.;
		quilometrosPercorridos = 24.5;
		valorLitro = 3.36;
		
		System.out.println("Valor gasto: " + ((litrosGastos*valorLitro) / quilometrosPercorridos));
	}
}
