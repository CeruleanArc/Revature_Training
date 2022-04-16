package mathoperators;

public class MathOperators {

    public void start() {

        int x = 5;
        int y = 3;
        int z;

        // Addition
        z = x + y;
        System.out.println(z);

        // Subtraction
        z = x - y;
        System.out.println(z);

        // Multiplication
        z = x * y;
        System.out.println(z);

        // Division
        z = x / y;
        System.out.println(z);

        // Modulus
        z = x % y;
        System.out.println(z);

        // Float vs. Int

        /* float f = 3.6f;
        int i = 22;
        int result = f + i;
        System.out.println(result);

        The compiler complains because we lose precision when turning a float into an int.
        We can add a cast to make the error disappear, forcing the compiler to truncate the value. */

        float f = 3.6f;
        int i = 22;
        int result1 = (int)f + i;
        System.out.println(result1);

        // The result is 22 + 3.6, with the decimal places dropped.

        long result2 = (long)f + i;
        System.out.println(result2);

        double result3 = f + i;
        System.out.println(result3);

    }

}
