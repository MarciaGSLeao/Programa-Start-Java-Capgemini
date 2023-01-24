package collections;

import java.util.LinkedList;

public class LinkedLists {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> anosNascimentos = new LinkedList<>();
		
		anosNascimentos.add(1963);
		anosNascimentos.add(1964);
		anosNascimentos.add(1987);
		anosNascimentos.add(1988);
		anosNascimentos.add(1990);

		System.out.println(anosNascimentos);
		
		// os métodos 'addFirst' e 'addLast', bem como outros com a mesma terminologia, 
		// não afetam o elementos que se encontram nas extremidades no tocantes a sua integridade,
		// apenas deslocam o índice dos mesmos para +1(addFirst) ou -1(addLast).
		anosNascimentos.addFirst(1960);
		anosNascimentos.addLast(2015);
		
		System.out.println(anosNascimentos);
	}

}
