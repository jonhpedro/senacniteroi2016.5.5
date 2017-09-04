package lista3;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		int valor;
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Informe o valor: ");
		valor = leitura.nextInt();
		
		leitura.close();
		
		if(valor < 0)
			valor *= -1;

		System.out.println("O valor absoluto é: " + valor);
	}
}
