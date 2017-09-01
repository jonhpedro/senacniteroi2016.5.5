package exemplo;

import java.util.Scanner;

public class TesteLogin {
	public static void main(String[] args) {

		int senha = 123;
		int senhaDigitada;
		
		// Faz leitura do teclado(Entrada de dados)
		Scanner scan = new Scanner(System.in);
	
		/*System.out.print("Informe a senha: ");
		// ler o valor digitado
		senhaDigitada = scan.nextInt();*/

		do {
			System.out.print("Informe a senha: ");
			senhaDigitada = scan.nextInt();
		} while(senha != senhaDigitada);

		// fecha o buffer
		scan.close();
		System.out.println("Está logado!");
	}
}
