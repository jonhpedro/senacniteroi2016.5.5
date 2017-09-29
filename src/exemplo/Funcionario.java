package exemplo;

public class Funcionario {

	private String nome;
	private String email;
	private String cpf;
	private String login;
	private Boolean clt;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Boolean getClt() {
		return clt;
	}

	public void setClt(Boolean clt) {
		this.clt = clt;
	}
}
