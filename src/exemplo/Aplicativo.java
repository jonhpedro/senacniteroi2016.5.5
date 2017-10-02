package exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicativo {
	public static void main(String[] args) {
		
		Aluno a = null;
		List<Aluno> alunos = new ArrayList<Aluno>();
		Scanner scan = new Scanner(System.in);
		
		String resposta;
		
		do{
			// cria a instancia
			a = new Aluno();
			
			// leitura dos dados
			System.out.print("Informe a matricula: ");
			a.setMatricula(Integer.parseInt(scan.nextLine()));
			System.out.print("Informe o nome: ");
			a.setNome(scan.nextLine());
			System.out.print("Informe a disciplina: ");
			a.setDisciplina(scan.nextLine());
			System.out.print("Informe a idade: ");
			a.setIdade(Integer.parseInt(scan.nextLine()));
			
			// adiciona a lista
			alunos.add(a);
			
			// teste para cadastra mais alunos
			System.out.print("Deseja cadastrar mais alunos? ");
			resposta = scan.nextLine();
		}while(resposta.equalsIgnoreCase("sim"));
		
		scan.close();
		
		System.out.println("Programa finalizado!");
	}
}
