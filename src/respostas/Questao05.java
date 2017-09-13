package respostas;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		/*
		 * a. Triângulo Equilátero: possui os 3 lados iguais. b. Triângulo Isósceles:
		 * possui 2 lados iguais. c. Triângulo Escaleno: possui 3 lados diferentes.
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		double lado01;
		double lado02;
		double lado03;

		System.out.print("Informe o primeiro lado: ");
		lado01 = scan.nextDouble();

		System.out.print("Informe o segundo lado: ");
		lado02 = scan.nextDouble();

		System.out.print("Informe o terceiro lado: ");
		lado03 = scan.nextDouble();

		scan.close();

		if ((lado01 == lado02) && (lado02 == lado03)) {
			System.out.println("Triângulo Equilátero");
		} else if ((lado01 == lado02) || (lado02 == lado03) || (lado01 == lado03)) {
			System.out.println("Triângulo Isósceles");
		} else {
			System.out.println("Triângulo Escaleno");
		}
	}
}
