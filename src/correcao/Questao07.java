package correcao;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		/*
		 * Implemente um algoritmo para que seja mostrado a tabuada de um número
		 * qualquer
		 */
		
		double num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o numero: ");
		num = scan.nextDouble(); 
		
		scan.close();
		
		for(int i = 1; i <=10; i++)
			System.out.println(num + " x " + i + " = " + (num*i));
	}
}
