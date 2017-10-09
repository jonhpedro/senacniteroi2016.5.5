package entidade;

public class Cliente extends Pessoa {

	private String tipoDePagamento;

	public Cliente() {

	}

	public String getTipoDePagamento() {
		return tipoDePagamento;
	}

	public void setTipoDePagamento(String tipoDePagamento) {
		this.tipoDePagamento = tipoDePagamento;
	}
}