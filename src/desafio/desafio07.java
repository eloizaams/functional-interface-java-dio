package desafio;

import java.util.Arrays;
import java.util.List;

//Encontrar o segundo número maior da lista
public class Desafio07 {
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int numeroProcurado = numeros.stream()
				.sorted()
				.toList()
				.get(numeros.size()-2);
		
		System.out.println("O segundo maior número da lista é: " + numeroProcurado);
				
	}

}
