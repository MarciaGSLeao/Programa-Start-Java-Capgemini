package exercises_lesson04.application;

import java.util.Scanner;

import exercises_lesson04.entities.Person;

public class MainProgram {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome da pessoa: ");
		person.setName(sc.nextLine());
		System.out.print("Informe o peso da pessoa: ");
		person.setWeight(sc.nextDouble());
		System.out.print("Informe a altura da pessoa: ");
		person.setHeight(sc.nextDouble());
		
		System.out.printf("%n%s tem IMC = %.2f", person.getName(), person.calcIMC());
		
		sc.close();
		
	}
	
}
