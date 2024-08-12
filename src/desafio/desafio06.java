package desafio;

import java.util.Arrays;
import java.util.List;

//Verificar se a lista contém algum número maior que 10
public class Desafio06 {
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 17, 8, 9, 0, 5, 4, 3);
		
		int numerosMaior10 = numeros.stream()
				.filter(n -> n > 10)
				.toList()
				.size();
		
		System.out.println("A lista contém " + numerosMaior10 + " números maiores que 10");
	}
}
