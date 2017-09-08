package modelo;

public class Pessoa {

	public int peso;
	public double altura;

	public String calculaIMC() {
		double imc = peso / (altura * altura);
		if (imc < 20) {
			return "Abaixo do peso";
		} else if ((imc >= 20) && (imc < 25)) {
			return "Peso Normal";
		} else if ((imc >= 25) && (imc < 30)) {
			return "Acima do peso";
		} else if ((imc >= 30) && (imc < 34)) {
			return "Obeso";
		} else {
			return "Muito Obeso";
		}
	}
}
