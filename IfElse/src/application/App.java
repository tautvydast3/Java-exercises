package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter room temperature (F) >");

		double temperatureFahrenheit = scanner.nextFloat();
		scanner.close();

		double temperatureCelsius = (temperatureFahrenheit - 32) * (5.0 / 9.0);

		System.out.printf("Temperature Celsius: %.2f. ", temperatureCelsius);

		// If temperature in Celsius is less than 21, print "Too cold!"
		// If temperature in Celsius is greater than 21, print "Warm enough."

		/*
		if (temperatureCelsius < 21) {
			System.out.println("Too cold!");
		}
		if (temperatureCelsius > 21) {
			System.out.println("Warm enough.");
		}
		*/
		
		// Using If Else:
		
		if (temperatureCelsius < 21) {
			System.out.println("Too cold!");
		}
		else {
			System.out.println("Warm enough.");
		}

	}

}
