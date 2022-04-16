package index;

import java.util.Scanner;

public class MainMenu {
	
	public void start() {
		
		boolean restart = false;
		while (!restart) {
			
			Scanner scan = new Scanner(System.in);
			char input;
			
			System.out.println("\nWhich package would you like to run?");
			
			System.out.println("\n[1] Hello World");
			System.out.println("[2] Name Console");
			System.out.println("[3] Data Types");
			System.out.println("[4] Math Operators");
			System.out.println("[5] Arrays");
			System.out.println("[6] If-Statements");
			System.out.println("[7] Switch Statements");
			System.out.println("[x] End program");
			
			System.out.print("\nEnter: ");
			input = scan.next().charAt(0);
			System.out.println();
			
			switch (input) {
				case '1' -> {
					new helloworld.Main ().start ();
					restart = true;
				}
				case '2' -> {
					new nameconsole.Main ().start ();
					restart = true;
				}
				case '3' -> {
					new datatypes.Main ().start ();
					restart = true;
				}
				case '4' -> {
					new mathoperators.Main ().start ();
					restart = true;
				}
				case '5' -> {
					new arrays.Main ().start ();
					restart = true;
				}
				case '6' -> {
					new ifstatements.Main ().start ();
					restart = true;
				}
				case '7' -> {
					new switchstatements.Main ().start ();
					restart = true;
				}
				case 'x' -> restart = true;
				default -> System.out.println ("\nInvalid input.");
			}
		}
		
	}
 
	
}
