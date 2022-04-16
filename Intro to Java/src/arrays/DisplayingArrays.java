package arrays;

import org.w3c.dom.ls.LSOutput;

public class DisplayingArrays {

    public void start() throws ArrayIndexOutOfBoundsException {

        int[] intArray = new int[3];
        System.out.println(intArray);

        //The output here will be the memory location of the array.

        intArray[0] = -5123;
        intArray[2] = 32;
        System.out.println(intArray[0]);

        // This will output the value at index 0: -5123.

        System.out.println(intArray[1]);

        // The output is the default integer: 0.

        try {
            System.out.println(intArray[3]);

            // There is no index of 3 in this array. An exception will follow.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no index 3 in this array. This exception shows that the code was written correctly.");
        }

    }

}
