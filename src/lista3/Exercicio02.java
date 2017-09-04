package lista3;

import java.util.Scanner;

/*
 Implemente um programa que dado 02 valores atribuídos as variáveis A e B
consecutivamente, efetuar a troca dos valores das mesmas de forma que A passe a ter
o valor de B e B o valor de A.
 */

public class Exercicio02 {
	public static void main(String[] args) {
		String variavel01;
		String variavel02;
		String auxiliar;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		variavel01 = leitura.nextLine();
		System.out.print("Informe o segundo valor: ");
		variavel02 = leitura.nextLine();
		
		leitura.close();
		
		// a variavel auxiliar irá armazenar o valor da variavel01 temporariamente
		auxiliar = variavel01;
		// a variavel01 é atualizada com o valor da variavel02
		variavel01 = variavel02;
		// a variavel02 é atualizada com o valor da variavel01 que estava armazenada na variavel auxiliar
		variavel02 = auxiliar;
		
		System.out.println("O valor de A agora é: " + variavel01 +
						   "\nO valor de B agora é: " + variavel02);
	}
}
