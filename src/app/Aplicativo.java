package app;

import modelo.Aluno;

public class Aplicativo {
	public static void main(String[] args) {

		// Objeto de aluno usando construtor sem argumentos (vazio)
		Aluno a = new Aluno();

		a.setMatricula(123);
		a.setNome("Luis");
		a.setEmail("prof.lpjunior@gmail.com");
		a.setTelefone("21 99927-5383");

		System.out.println(a);
		
		
		// Objeto de aluno usando construtor com argumentos (cheio)
		Aluno b = new Aluno(123, "Luis", "prof.lpjunior@gmail.com", "21 99927-5383");
		
		System.out.println(b);
	}
}
