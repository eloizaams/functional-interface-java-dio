package desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Remova todos os valores ímpares
public class Desafio04 {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//Quando inicia a lista com Arrays.asList, ela não pode ser modificada, logo é necessário fazer uma cópia para poder modificar.
		List<Integer> copiaNumeros = new ArrayList<>(numeros);
		
		copiaNumeros.removeIf(n -> n % 2 != 0);
		System.err.println(copiaNumeros);

	}

}
