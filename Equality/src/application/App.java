package application;

public class App {

	public static void main(String[] args) {
		int cats = 42;
		int dogs = 23;
		int weasels = 42;

		boolean moreCatsThanDogs = cats > dogs;

		System.out.printf("More cats than dogs: %b.\n", moreCatsThanDogs);

		// Equality test operator
		System.out.printf("Same number of cats and weasels: %b.\n", cats == weasels);
		System.out.printf("Same number of cats and dogs: %b.\n", cats == dogs);

		System.out.printf("Number of cats greater than weasels: %b.\n", cats > weasels);
		
		// Do not use == with doubles!!!

	}

}
