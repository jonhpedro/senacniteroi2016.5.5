package modelo;

public class Aluno {

	private Integer matricula;
	private String nome;
	private String email;
	private String telefone;

	/** Construtores **/
	
	// construtor sem argumento (construtor vazio)
	public Aluno() {
		
	}
	
	// construtor com argumento (construtor cheio)
	public Aluno(Integer matricula, String nome, String email, String telefone) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Os dados informados foram:\n\n" 
				+ "Matricula: " + matricula 
				+ "\nNome: " + nome
				+ "\nEmail: " + email 
				+ "\nTelefone: " + telefone;
	}
	
	/** Métodos gets e sets - encapsulamento **/

	// método set(atribuir)
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// método get(pegar)
	public Integer getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}
}
