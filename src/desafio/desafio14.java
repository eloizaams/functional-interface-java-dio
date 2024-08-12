package desafio;

import java.util.Arrays;
import java.util.List;

//Encontre o maior número primo da lista
public class Desafio14 {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int maiorPrimo = numeros.stream()
				.filter(Desafio14::isPrimo)
				.max(Integer::compareTo)
	            .orElse(-1); // Retorna -1 se nenhum número primo for encontrado

	        System.out.println("O maior número primo da lista é: " + maiorPrimo);
	}
	
	public static boolean isPrimo(int n) {
			n = Math.abs(n);

		    // Verifica se o número é menor ou igual a 1, caso contrário, não é primo
		    if (n <= 1) {
		        return false;
		    }

		    // Faz um loop de 2 até a raiz quadrada do número
		    for (int i = 2; i * i <= n; i++) {
		        // Se o número for divisível por algum valor no intervalo, não é primo
		        if (n % i == 0) {
		            return false;
		        }
		    }

		    // Se não foi encontrado divisor no loop, o número é primo
		    return true;
	}

}
