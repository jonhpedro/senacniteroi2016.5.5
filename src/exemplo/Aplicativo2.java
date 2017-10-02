package exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicativo2 {
	public static void main(String[] args) {
		
		Aluno a = null;
		List<Aluno> alunos = new ArrayList<Aluno>();
		Scanner scan = new Scanner(System.in);
		
		String resposta;
		
		for(;true;){
			// cria a instancia
			a = new Aluno();
			
			// leitura dos dados
		
			
			// adiciona a lista
			alunos.add(a);
			
			// teste para cadastra mais alunos
			System.out.print("Deseja cadastrar mais alunos? ");
			resposta = scan.nextLine();
			
			if(!resposta.equalsIgnoreCase("sim")) {
				break;
			}
		}
		
		scan.close();
		
		System.out.println("Programa finalizado!");
	}
}
