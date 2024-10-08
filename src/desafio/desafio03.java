package desafio;

import java.util.Arrays;
import java.util.List;

//Verifique se todos os números da lista são positivos
public class Desafio03 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		Boolean todosPositivos = numeros.stream()
				.allMatch(n -> n >= 0);
		System.out.println(todosPositivos?"Todos os números são positivos": "A lista contém números não positivos");

	}

}
