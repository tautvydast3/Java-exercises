package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 * Scanner in = new Scanner(System.in);
		 * System.out.print("Please, enter an option number > "); int value =
		 * in.nextInt();
		 * 
		 * switch (value) { case 0: System.out.println("Option 0 selected"); break; case
		 * 1: System.out.println("Option 1 selected"); break; case 10:
		 * System.out.println("Exiting program..."); System.exit(0); break; default:
		 * System.out.println("Invalid option."); break; }
		 */

		// Converting code from MoreIfElse into Switch:

		System.out.println("Menu");
		System.out.println("========================");

		System.out.println("\t1. Print 'Hello'");
		System.out.println("\t2. Print 'How are you?'");
		System.out.println("\t3. Exit Program");
		System.out.println();
		System.out.printf("Enter an option > ");

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();

		if (input >= 100) {
			System.out.println("You found the hidden Easter egg!");
		} else {

			switch (input) {
			case 1:
				System.out.println("Hello");
				break;
			case 2:
				System.out.println("How are you?");
				break;
			case 3:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		}

	}

}
