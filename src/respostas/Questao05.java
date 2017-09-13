package respostas;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		/*
		 * a. Tri�ngulo Equil�tero: possui os 3 lados iguais. b. Tri�ngulo Is�sceles:
		 * possui 2 lados iguais. c. Tri�ngulo Escaleno: possui 3 lados diferentes.
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
			System.out.println("Tri�ngulo Equil�tero");
		} else if ((lado01 == lado02) || (lado02 == lado03) || (lado01 == lado03)) {
			System.out.println("Tri�ngulo Is�sceles");
		} else {
			System.out.println("Tri�ngulo Escaleno");
		}
	}
}
