package app;

import java.util.Scanner;
import modelo.Pessoa;

public class Aplicativo {
	public static void main(String[] args) {

		Pessoa p;
		
		p = new Pessoa();
		
		Scanner leitura = new Scanner(System.in); 
		
		System.out.print("Informe a altura: ");
		p.altura = leitura.nextDouble();
		System.out.print("Informe o sexo: ");
		p.sexo = leitura.next();
		
		leitura.close();
		
		System.out.println(p.pesoIdeal());
	}
}
