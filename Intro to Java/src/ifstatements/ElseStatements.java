package ifstatements;

public class ElseStatements {

    public void start() {

        boolean a = true;

        if (a) {
            System.out.println("Inside the if-statement");
        } else {
            System.out.println("Inside the else statement.");
        }

        boolean b = false;

        if (!b) {
            System.out.println("Inside the if-statement.");
        } else {
            System.out.println("Inside the else statement.");
        }

    }

}
