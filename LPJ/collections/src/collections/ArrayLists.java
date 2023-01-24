package collections;

import java.util.ArrayList;

public class ArrayLists {
	
	public static void main(String[] args) {
		
		// construindo um arraylist para armazenar nomes de carros.
		ArrayList<String> nomesCarros = new ArrayList<>();
		
		// adicionando dados ao objeto 'nomesCarros'.
		nomesCarros.add("TRACKER");
		nomesCarros.add("ONIX");
		nomesCarros.add("SIENNA");
		nomesCarros.add("KA");
		nomesCarros.add("CLASSIC");
		nomesCarros.add("CELTA");
		nomesCarros.add("CORSA");
		
		// exibindo a lista como objeto único.
		System.out.println(nomesCarros);
		
		// exibindo o nome de cada elemento de dentro da lista.
		for(String carro : nomesCarros) {
			System.out.println(carro);
		}
		
		// substituindo um elemento com método 'set'
		nomesCarros.set(0, "COROLLA HYBRID");
		
		// exibindo a lista após alteração.
		System.out.println(nomesCarros);
		
		// Para conhecer todos os métodos disponíveis para um objeto do tipo ArrayList, basta
		// adicionar a notação '.' após o nome do objetos, e através do ctrl+space a IDE auxiliar
		// na exibição e descrição de uso de todos os métodos disponíveis para o objeto.
		
		// CURIOSIDADE: buscando um elemento e substituindo o elemento encontrado por outro.
		if (nomesCarros.contains("CORSA")) {
			for (int i = 0; i < nomesCarros.size(); i++) {
				if ("CORSA".equals(nomesCarros.get(i))) {
					nomesCarros.set(i, "FUSCA");
				}
			}
		}
		System.out.println(nomesCarros);
		System.out.println(nomesCarros.size() + " veículos encontrados.");
	}
}
