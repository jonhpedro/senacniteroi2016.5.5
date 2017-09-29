package exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VetorFuncionarios {
	public static void main(String[] args) {

		List<Funcionario> lista = new ArrayList<Funcionario>();
		Funcionario f;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 1; i++) {
			f = new Funcionario();
			
			System.out.print("Informe o nome: ");
			f.setNome(scan.nextLine());
			System.out.print("Informe o CPF: ");
			f.setCpf(scan.nextLine());
			System.out.print("Informe o email: ");
			f.setEmail(scan.nextLine());
			System.out.print("Informe o login: ");
			f.setLogin(scan.nextLine());
			System.out.print("Informe se é CLT (s | n): ");
			String resposta = scan.nextLine();
			if(resposta.equalsIgnoreCase("s")) {
				f.setClt(true);
			} else {
				f.setClt(false);
			}
			
			lista.add(f);
		}
		
		scan.close();
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("Nome: " + lista.get(i).getNome());
			System.out.println("CPF: " + lista.get(i).getCpf());
			System.out.println("Email: " + lista.get(i).getEmail());
			System.out.println("Login: " + lista.get(i).getLogin());
			System.out.println("CLT? " + (lista.get(i).getClt() ? "Sim" : "Não"));
		}
	}
}
