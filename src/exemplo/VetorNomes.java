package exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VetorNomes {
	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < 10; i++) {
			System.out.print("Informe o nome: ");
			nomes.add(scan.nextLine());
		}
		
		scan.close();
		
		for(int i = 0; i < nomes.size(); i++)
			System.out.println(nomes.get(i));
	}
}
