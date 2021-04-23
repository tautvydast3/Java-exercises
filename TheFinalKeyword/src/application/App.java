package application;

public class App {

	public static void main(String[] args) {

		/*
		 * To make variable, that I won't be able to change in the future, I will use a
		 * Final modifier. Variables that can't be changed are called constants. It is
		 * agreed by conventions to write constants in capital letters.
		 */

		final int VALUE = 9;
		System.out.println(VALUE);


		final String USER_PASSWORD = "abc";
		System.out.println(USER_PASSWORD);
	}

}
