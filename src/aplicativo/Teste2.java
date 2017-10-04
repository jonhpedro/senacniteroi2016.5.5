package aplicativo;

import entidade.Aluno;
import entidade.Disciplina;

public class Teste2 {
	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setNome("Joaozinho");
		aluno.setCpf("123.456.789-00");
		aluno.setMatricula(1212);
		aluno.setNota01(2.1);
		aluno.setNota02(1.0);
		
		aluno.setDisciplina(new Disciplina());
		
		aluno.getDisciplina().setNome("Java");
		aluno.getDisciplina().setEmenta("Desenvolvimento de sistemas Robustos");
		
		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("Matricula do aluno: " + aluno.getMatricula());
		System.out.println("CPF do aluno: " + aluno.getCpf());
		System.out.println("Materia cursando: " + aluno.getDisciplina().getNome());
		System.out.println("Nota01 do aluno: " + aluno.getNota01());
		System.out.println("Nota02 do aluno: " + aluno.getNota02());
		System.out.println("Média do aluno: " + aluno.getMedia());
	}
}
