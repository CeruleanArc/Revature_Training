package index;

import java.util.Scanner;

public class Back {
	
	public void start() {
		char input;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPress any key to continue or \"x\" to exit.");
		System.out.print("\nEnter: ");
		input = scan.next().charAt(0);
		if (input == 'x') {
			// Program will end.
		} else {
			new MainMenu().start();
		}
	}
	
}
