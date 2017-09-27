package exemplo;

import java.util.List;
import java.util.ArrayList;

public class ExemploList {
	public static void main(String[] args) {
		
		//int[] numeros = new int[10];
		
		// Lista de numeros inteiros
		List<Integer> numeros = new ArrayList<Integer>();
		
		// atribuir de valor, usa-se o método add()
		numeros.add(29);
		numeros.add(04);
		numeros.add(87);
		
		System.out.println("Primeiro número adicionado foi: " + numeros.get(0));
		
		// remover um elemento da lista
		numeros.remove(2);
		
		// tamanho do array 
		// numeros.length
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		
		// carregar o array dinamicamente
		/*
		 * for(int i = 0; i < numeros.length; i++) {
		 * 		numeros[i] = i * 2;
		 * }
		 * */
		
		for(int i = 0; i < 10; i++) {
			numeros.add(i * 2);
		}
		
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
	}
}
