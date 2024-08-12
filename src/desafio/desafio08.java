package desafio;

import java.util.Arrays;
import java.util.List;

//Somar os dígitos de todos os números da lista
public class Desafio08 {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		 int somaDigitos = numeros.stream()
		            .mapToInt(n -> {
		                int soma = 0;
		                while (n != 0) {
		                    soma += n % 10;
		                    n /= 10;
		                }
		                return soma;
		            })
		            .sum();

		System.out.println("A soma dos dígitos da lista é: " + somaDigitos);
	}
	
}
