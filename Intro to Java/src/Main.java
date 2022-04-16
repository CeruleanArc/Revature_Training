import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char input;
        boolean restart = false;

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

        while (!restart) {
            restart = true;
            switch (input) {
                case '1':
                    new helloworld.Main().start();
                    break;
                case '2':
                    new nameconsole.Main().start();
                    break;
                case '3':
                    new datatypes.Main().start();
                    break;
                case '4':
                    new mathoperators.Main().start();
                    break;
                case '5':
                    new arrays.Main().start();
                    break;
                case '6':
                    new ifstatements.Main().start();
                    break;
                case '7':
                    new switchstatements.Main().start();
                    break;
                default:
                    System.out.println("\nInvalid input.");
                    restart = false;
                    break;
            }
        }

    }

}