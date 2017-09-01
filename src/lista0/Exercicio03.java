package lista0;

public class Exercicio03 {
	/*
	 * Escreva um programa que dados os litros gastos, os quilômetros percorridos por um automóvel
	 * e o valor do litro de combustível, calcule os gastos de combustível em reais/km.
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
