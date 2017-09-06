package modelo;

public class Pessoa {

	public Double altura;
	public String sexo;
	
	// function pesoIdeal() {}
	public String pesoIdeal() { // estrutura modificador + retorno + nomeDoMetodo + parametros
		if((sexo.equalsIgnoreCase("m")) || (sexo.equalsIgnoreCase("masculino"))) {
			return ("O peso ideal para homens com a altura: " + altura + " é: " + ((72.7 * altura) - 58));
		} else if((sexo.equalsIgnoreCase("f")) || (sexo.equalsIgnoreCase("feminino"))) {
			 return ("O peso ideal para mulheres com a altura: " + altura + " é: " + ((62.1 * altura) - 44.7));
		}
		return "Dados incorretos";
	}
}
