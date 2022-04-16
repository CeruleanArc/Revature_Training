package arrays;
import java.util.Arrays;

public class SwapElements {

    public void start() {

        int[] elements = {1, 2, 3, 4, 5};

        // Enter code to swap the first element with the last.

        //Store the first element temporarily.
        int temp = elements[0];

        // Swap the elements.
        elements[0] = elements[elements.length-1];
        elements[elements.length-1] = temp;

        // Print the results.
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }

    }

}
