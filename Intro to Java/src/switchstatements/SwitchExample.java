package switchstatements;

public class SwitchExample {

    public void start() {

        int value = 7;

        switch (value) {
            default:
                System.out.println("Default case");
            case 4:
                System.out.println("Case 4");
            case 5:
                System.out.println("Case 5");
                break;
            case 6:
                System.out.println("Case 6");
        }

    }

}
